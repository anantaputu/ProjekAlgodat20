package util;

import entity.Item;

public class ListItem {
  public Item head, tail;

  public ListItem () {
    this.head = null;
    this.tail = null;
  }

  public void addItem(String nama, String type, int effect, boolean isReusable) {
    Item newNode = new Item(nama, type, effect, isReusable);
    if (head == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  public Item hapusItem(String choice) {
    if (head == null) {
      System.out.println("Item kosong!");
      return null;
    }

    entity.Item current = head;
    Item temp = null;

    while (current != null) {
      if (current.nama.equals(choice)) {
        if (current.isReusable == true) {
          return current;
        } else {
          Item returnItem = current;
          temp.next = current.next;
          current.next = null;
          return returnItem;
        }
      }
      temp = current;
      current = current.next;
    }

    System.out.println("Item tidak ditemukan!");
    return null;
  }

  public void displayItem () {
    Item current = head;
    int count = 1;
    while (current != null) {
      System.out.println(count++ + ". Nama : " + current.nama + ", Efek : " + current.effect + ", Tipe : " + current.type);
      current = current.next;
    }
  }

  public void bubbleSort() {
    if (head == null) {
      return;
    }

    boolean tertukar;
    do {
      tertukar = false;
      Item current = head;

      while (current.next != null) {
        if (current.effect > current.next.effect) {
          // Tukar data antar node
          int tempEffect = current.effect;
          String tempNama = current.nama;
          String tempType = current.type;

          current.effect = current.next.effect;
          current.nama = current.next.nama;
          current.type = current.next.type;

          current.next.effect = tempEffect;
          current.next.nama = tempNama;
          current.next.type = tempType;

          tertukar = true;
        }
        current = current.next;
      }
    } while (tertukar);
  }
}