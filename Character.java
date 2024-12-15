public class Character {
    String name;
    int health;
    int energy;
    int power;
    String personality;
  
    public Character(String name, int health, int energy, int power, String personality) {
      this.name = name;
      this.health = health;
      this.energy = energy;
      this.power = power;
      this.personality = personality;
    }
  
    public void takeDamage(int damage) {
      this.health -= damage;
      if (this.health < 0) this.health = 0;
      System.out.println(this.name + " took " + damage + " damage. Remaining health: " + this.health);
    }
  
    public void useEnergy(int amount) {
      if (this.energy >= amount) {
        this.energy -= amount;
        System.out.println(this.name + " used " + amount + " energy. Remaining energy: " + this.energy);
      } else {
        System.out.println(this.name + " doesn't have enough energy!");
      }
    }
  
    public void restoreEnergy(int amount) {
      this.energy += amount;
      System.out.println(this.name + " restored " + amount + " energy. Current energy: " + this.energy);
    }
  
    public void showCharacterInfo() {
      System.out.println("=== Character Info ===");
      System.out.println("Name: " + this.name);
      System.out.println("Health: " + this.health);
      System.out.println("Energy: " + this.energy);
      System.out.println("Power: " + this.power);
      System.out.println("Personality: " + this.personality);
      System.out.println("======================");
    }
  }
  
