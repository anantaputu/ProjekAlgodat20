package entity;

public class Dewa extends Karakter {
  String specialSkill;

  public Dewa(String name, int health, int power, String personality, String specialSkill) {
    super(name, health, 0, power, personality);
    this.specialSkill = specialSkill;
  }

  public void performAction(String action) {
    System.out.println(this.name + " is performing action: " + action);
  }

  @Override
  public void showKarakterInfo() {
    super.showKarakterInfo();
    System.out.println("Special Skill: " + this.specialSkill);
  }
}
