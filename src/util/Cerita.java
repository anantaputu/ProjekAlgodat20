package util;

import java.util.Scanner;

public class Cerita {
  String kode;
  Dialog head;
  Cerita left;
  Cerita right;
  Scanner scanner = new Scanner(System.in);

  public Cerita(String kode) {
    this.kode = kode;
    this.head = null;
    this.left = null;
    this.right = null;
  }

  public void tambahDialog(String dialog) {
    if (head == null) {
      head = new Dialog(dialog);
    } else {
      Dialog current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new Dialog(dialog);
    }
  }

  public void displayDialog () {
    String choose1;
    Dialog current = head;
    while (current != null) {
      choose1 = scanner.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();
      if (choose1.equals("")){
        System.out.println("\n" + current.dialog);
        current = current.next;
      }
    }
  }
}