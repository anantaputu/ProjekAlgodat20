package entity;

public class Roh extends Karakter {
  String derajat;

  public Roh(String name, int health, int energy, int power, String personality, String derajat) {
    super(name, health, energy, power, personality);
    this.derajat = derajat;
  }
}
