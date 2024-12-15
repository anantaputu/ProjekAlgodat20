public class Dewa extends Character {
  String specialSkill;

  public Dewa(String name, int health, int power, String personality, String specialSkill) {
    super(name, health, 0, power, personality); // Energy diatur menjadi 0 untuk Dewa
    this.specialSkill = specialSkill;
  }

  public void performAction(String action) {
    System.out.println(this.name + " is performing action: " + action);
  }

  @Override
  public void showCharacterInfo() {
    super.showCharacterInfo();
    System.out.println("Special Skill: " + this.specialSkill);
  }
}
