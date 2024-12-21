package entity;

import util.ListItem;

public class Player extends Karakter {
  public ListItem item = new ListItem();

  public Player(String name, int health, int energy, int power, String personality) {
    super(name, health, energy, power, personality);
  }

  public void addItem (String nama, String type, int effect, boolean isReusable) {
    item.addItem(nama, type, effect, isReusable);
  }

  public Item hapusItem (String choice) {
    return item.hapusItem(choice);
  }

  public void sortItem () {
    item.bubbleSort();
    item.displayItem();

    if (item.head.isReusable) {
      this.power += item.head.effect;
      System.out.println("Power bertambah: " + item.head.effect);
      this.power -= item.head.effect;
    } else {
      switch (item.head.type) {
        case "power":
          this.power += item.head.effect;
          System.out.println("Power " + this.name + " menjadi " + this.power);
        case "energy":
          this.energy += item.head.effect;
          System.out.println("Energy " + this.name + " menjadi " + this.energy);
        case "health":
          this.health = Math.min(100, this.health + item.head.effect);
          System.out.println("Health " + this.name + " menjadi " + this.health);
        default:
          item.head = item.head.next;
      }
    }
  }
}
