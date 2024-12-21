package entity;

import java.util.Random;

public class Karakter {
  public String name;
  public int health;
  public int energy;
  public int power;
  public String personality;

  public Karakter(String name, int health, int energy, int power, String personality) {
    this.name = name;
    this.health = health;
    this.energy = energy;
    this.power = power;
    this.personality = personality;
  }

  public void attack(Karakter opponent) {
    Random randomValue = new Random();
    
    double multiplier = 0.7 + (0.6 * randomValue.nextDouble());
    double damage = this.power * (this.energy / 250.0) * multiplier;
    
    opponent.health -= (int) damage;

    double energyCost = this.power * 0.2;
    this.energy -= (int) energyCost;

    if (this.energy < 0) this.energy = 0;
    if (opponent.health < 0) opponent.health = 0;
    if (opponent.energy < 0) opponent.energy = 0;

    System.out.printf("%s menyerang %s dengan kekuatan %.2f (%s%.0f%% damage)!%n",
    this.name, opponent.name, damage, 
    (multiplier > 1.0 ? "+" : ""), 
    (multiplier - 1.0) * 100);
  }

  public void heal(int healValue) {
    this.health += healValue;
    if (this.health > 100) {  // Batas maksimal health
      this.health = 100;
    }
    System.out.println(name + " memulihkan " + health + " health points.");
  }

  public void restoreEnergy() {
    int baseRecovery = 20;
    double healthFactor = this.health / 100.0;
    double powerFactor = 1 + (this.power / 50.0);
    int energyRecovery = (int) (baseRecovery * healthFactor / powerFactor);

    this.energy += energyRecovery;
    if (this.energy > 100) {
      this.energy = 100;
    }
  }

  public void showKarakterInfo() {
    System.out.println("===== Informasi Karakter =====");
    System.out.println("Nama        : " + this.name);
    System.out.println("Darah       : " + this.health);
    System.out.println("Energi      : " + this.energy);
    System.out.println("Power       : " + this.power);
    System.out.println("Personality : " + this.personality);
    System.out.println("==============================");
  }
}