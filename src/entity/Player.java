package entity;

public class Player extends Karakter {
  String role;
  String goal;

  public Player(String name, String role, int health, int energy, int power, String personality, String goal) {
    super(name, health, energy, power, personality);
    this.role = role;
    this.goal = goal;
  }

  @Override
  public void showKarakterInfo() {
    super.showKarakterInfo();
    System.out.println("Role: " + this.role);
    System.out.println("Goal: " + this.goal);
  }

  public void performAction(String action) {
    System.out.println(this.name + " is performing action: " + action);
  }
}
