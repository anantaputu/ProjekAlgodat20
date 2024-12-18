package util;

import java.util.Scanner;
import entity.*;

public class AlurCerita {  
  public Cerita root;
  Scanner scanner = new Scanner(System.in);
  QueuePlayer queuePlayer = new QueuePlayer();

  // Membuat objek karakter Ananta
  Player player1 = new Player(
    "Ananta",
    "Sang Penjaga Keseimbangan",
    100, // Health
    80,  // Energy
    90,  // Power
    "Bijaksana", 
    "Mengembalikan energi Pohon Kehidupan sebelum para dewa menghancurkan dunia"
  );

  // Membuat objek karakter Wadis
  Player player2 = new Player(
    "Wadis", 
    "Sang Pengelana Kegelapan", 
    100,  // Health
    100,  // Energy
    95,  // Power
    "Tegas", 
    "Membebaskan dirinya dari kontrak dan membalas dendam kepada entitas tersebut"
  );

  // Membuat objek karakter Khair
  Player player3 = new Player(
    "Khair", 
    "Sang Penyembuh Cahaya", 
    100,  // Health
    100, // Energy
    75,  // Power
    "Optimis dan penuh keyakinan, tetapi terkadang naif", 
    "Menyelamatkan sebanyak mungkin orang dan menghancurkan sumber kegelapan"
  );

  // Membuat objek karakter Fakhroni
  Human human = new Human(
    "Fakhroni", 
    100,  // Health
    100, // Energy
    100, // Power
    "Periang dan sangat sopan kepada orang baru"
  );

  // Membuat objek Monster Xenomorph
  Monster monster1 = new Monster(
    "Xenomorph", 
    300,  // Health
    200, // Energy
    120, // Power
    "Agresif dan pemarah",
    "Alien"
  );

  // Membuat objek Monster Carberus
  Monster monster2 = new Monster(
    "Carberus", 
    150,  // Health
    150, // Energy
    90, // Power
    "Patuh dan Tegas",
    "Anjing Penjaga"
  );

  // Membuat objek Roh Umbra
  Roh roh = new Roh(
    "Umbra", 
    200,  // Health
    150, // Energy
    99, // Power
    "Independen dari kegelapan",
    "Penjaga"
  );

  // Membuat objek Dewa Ares
  Dewa dewa1 = new Dewa(
    "Ares", 
    800,  // Health
    500, // Power
    "Liar, impulsif, dan haus darah",
    "Penyembuhan Masif"
  );

  // Membuat objek Dewa Moros
  Dewa dewa2 = new Dewa(
    "Moros", 
    500,  // Health
    400, // Power
    "Tidak berperasaan dan netral",
    "Aura Kehampaan"
  );

  public AlurCerita() {
    root = null;
    queuePlayer.enqueue(player1);
    queuePlayer.enqueue(player2);
    queuePlayer.enqueue(player3);
  }

  public void createRoot(String kode) {
    root = new Cerita(kode);
  }

  public void inorderInput(Cerita node, Cerita newNode, String direction, String kode) {
    if (node != null) {
      inorderInput(node.left, newNode, direction, kode);
      if (node.kode.equals(kode)) {
        if (direction.equals("kanan")) {
          node.right = newNode;
        } else {
          node.left = newNode;
        }
        return;
      }
      inorderInput(node.right, newNode, direction, kode);
    }
  }

  public void PreOrderInputDialog(Cerita node, String direction, String kode, String dialog) {
    if (node != null) {
      if (node.kode.equals(kode)) {
        if (direction.equals("kanan")) {
          node.right.tambahDialog(dialog);
        } else {
          node.left.tambahDialog(dialog);
        }
        return;
      }
      PreOrderInputDialog(node.left, direction, kode, dialog);
      PreOrderInputDialog(node.right, direction, kode, dialog);
    }
  }

  public void levelOrderDisplay() {
    if (root == null) {
      return;
    }

    Queue queue = new Queue();
    queue.enqueue(root);

    while (queue.front != null) {
      Cerita current = queue.dequeue();
      System.out.print(current.kode);
      System.out.println();

      if (current.left != null) {
        queue.enqueue(current.left);
      }
      if (current.right != null) {
        queue.enqueue(current.right);
      }
    }
  }

  public void battle(Karakter opponent) {
    String choose;
    QueuePlayer current = queuePlayer;
    Player currentPlayer;
    while (true) {
      currentPlayer = current.dequeue();

      // Tampilkan opsi
      System.out.println("=== Pertarungan Dimulai ===");
      System.out.println("1. Serang");
      
      if (currentPlayer.energy < 10) {
        System.out.println("2. Pulihkan Energi");
      }
      System.out.println("3. Menyerah");
      System.out.println("------------------------------");
      System.out.println(currentPlayer.name + " [Health: " + currentPlayer.health + ", Energy: " + currentPlayer.energy + "]");
      System.out.println(opponent.name + " [Health: " + opponent.health + ", Energy: " + opponent.energy + "]");
      System.out.print("Pilih aksi: ");
      choose = scanner.nextLine();

      // Bersihkan layar (opsional, tergantung terminal)
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Periksa kondisi kemenangan sebelum aksi
      if (currentPlayer.health <= 0) {
        System.out.println(currentPlayer.name + " telah kalah! Pemenangnya adalah " + opponent.name + "!");
        break;
      }
      if (opponent.health <= 0) {
        System.out.println(opponent.name + " telah kalah! Pemenangnya adalah " + currentPlayer.name + "!");
        break;
      }

      // Proses aksi pemain
      if (choose.equals("1")) {
        currentPlayer.attack(opponent);
        if (opponent.health > 0) {
          opponent.attack(currentPlayer);
        }
      } else if (choose.equals("2") && currentPlayer.energy < 10) {
        currentPlayer.restoreEnergy();
        if (opponent.health > 0) {
          opponent.attack(currentPlayer);
        }
      } else if (choose.equals("3")) {
        System.out.println(currentPlayer.name + " memilih menyerah. " + opponent.name + " adalah pemenangnya!");
        currentPlayer.health = 0; // Menyatakan currentPlayer kalah
        break;
      } else {
        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
      }

      if (opponent.energy < 15) {
        opponent.restoreEnergy();
      }

      // Periksa kondisi setelah aksi
      if (currentPlayer.energy <= 0 && opponent.energy <= 0) {
        System.out.println("Kedua karakter kehabisan energi dan tidak bisa bertarung lagi.");
        break;
      }
      if (currentPlayer.health <= 0 && current.sizeQueue() < 1) {
        System.out.println(currentPlayer.name + " telah kalah! Pemenangnya adalah " + opponent.name + "!");
        break;
      }
      if (opponent.health <= 0) {
        System.out.println(opponent.name + " telah kalah! Pemenangnya adalah " + currentPlayer.name + "!");
        break;
      }
      System.out.println(current.sizeQueue());
      if (currentPlayer.health < 1) {
        currentPlayer = null;
      } else {
        current.enqueue(currentPlayer);
      }

    }
  }

  public void nextAct () {
    String choose1;
    Cerita current = root;
    while (true) {
      choose1 = scanner.nextLine();
      if (choose1.equals("")) {
        current.displayDialog();
        if (current.kode.equals("prolog")) {
          current = current.left;
        } else if (current.kode.equals("act1")){
          while (true) {
            battle(human);
            if (human.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act2.1")) {
          while (true) {
            battle(monster1);
            if (monster1.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act2.2")) {
          while (true) {
            battle(monster2);
            if (monster2.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act3.1")) {
          while (true) {
            battle(roh);
            if (roh.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act4.1")) {
          while (true) {
            battle(dewa1);
            if (dewa1.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act4.2")) {
          while (true) {
            battle(dewa2);
            if (dewa2.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        }
      }
    }
  }
}