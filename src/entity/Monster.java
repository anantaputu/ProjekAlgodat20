package entity;

public class Monster extends Karakter {
  String monsterType;

  public Monster(String name, int health, int energy, int power, String personality, String monsterType) {
    super(name, health, energy, power, personality);
    this.monsterType = monsterType;
  }

  public void performAction(String action) {
    System.out.println(this.name + " is performing action: " + action);
  }

  @Override
  public void showKarakterInfo() {
    super.showKarakterInfo();
    System.out.println("Monster Type: " + this.monsterType);
  }
}
