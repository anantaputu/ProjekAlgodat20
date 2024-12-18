package entity;

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
    double damage = this.power * (this.energy / 250.0);
    opponent.health -= (int) damage;
    
    double energyCost = this.power * 0.2;
    this.energy -= (int) energyCost;

    if (this.energy < 0) this.energy = 0;
    if (opponent.health < 0) opponent.health = 0;
    if (opponent.energy < 0) opponent.energy = 0;
  }

  public void useEnergy(int amount) {
    if (this.energy >= amount) {
      this.energy -= amount;
      System.out.println(this.name + " menggunakan " + amount + " energi. Sisa energi: " + this.energy);
    } else {
      System.out.println(this.name + " Energi tidak mencukupi");
    }
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
    System.out.println("=== Karakter Info ===");
    System.out.println("Name: " + this.name);
    System.out.println("Health: " + this.health);
    System.out.println("Energy: " + this.energy);
    System.out.println("Power: " + this.power);
    System.out.println("Personality: " + this.personality);
    System.out.println("======================");
  }
}