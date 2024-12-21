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

  public void sort () {
    item.bubbleSort();
    Item current = item.head;
    System.out.println("Item milik " + this.name);
    while (current != null) {
      System.out.println(current.nama + " -> " + current.type + " -> " + current.effect);
      current = current.next;
    }
  }
}
