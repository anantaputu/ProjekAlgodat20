package entity;

public class Dewa extends Karakter {
  String specialSkill;

  public Dewa(String name, int health, int energy, int power, String personality, String specialSkill) {
    super(name, health, energy, power, personality);
    this.specialSkill = specialSkill;
  }

  @Override
  public void showKarakterInfo() {
    super.showKarakterInfo();
    System.out.println("Special Skill: " + this.specialSkill);
  }
}