package util;

import java.util.Scanner;
import entity.*;
import entity.Player;
import entity.Human;
import entity.Item;

public class AlurCerita {  
  public Cerita root;
  Scanner scanner = new Scanner(System.in);
  QueuePlayer queuePlayer = new QueuePlayer();

  // Membuat objek karakter Ananta
  public Player player1 = new Player(
    "Ananta",
    100, // Health
    85,  // Energy
    100,  // Power
    "Bijaksana"
  );

  // Membuat objek karakter Wadis
  public Player player2 = new Player(
    "Wadis", 
    100,  // Health
    90,  // Energy
    95,  // Power
    "Tegas"
  );

  // Membuat objek karakter Khair
  public Player player3 = new Player(
    "Khair", 
    100,  // Health
    100, // Energy
    90,  // Power
    "Optimis dan penuh keyakinan"
  );

  // Membuat objek karakter Fakhroni
  public Human human = new Human(
    "Fakhroni", 
    100,  // Health
    100, // Energy
    100, // Power
    "Pendiam dan tidak tahu arah"
  );

  // Membuat objek Monster Xenomorph
  public Monster monster1 = new Monster(
    "Xenomorph", 
    200,  // Health
    120, // Energy
    190, // Power
    "Agresif dan pemarah",
    "Alien"
  );

  // Membuat objek Monster Carberus
  public Monster monster2 = new Monster(
    "Carberus", 
    150,  // Health
    150, // Energy
    90, // Power
    "Patuh dan Tegas",
    "Anjing Penjaga"
  );

  // Membuat objek Roh Umbra
  public Roh roh = new Roh(
    "Umbra", 
    200,  // Health
    150, // Energy
    99, // Power
    "Independen dari kegelapan",
    "Penjaga"
  );

  // Membuat objek Dewa Ares
  public Dewa dewa1 = new Dewa(
    "Ares", 
    800,  // Health
    500, // Power
    250, // Energy Absolut
    "Liar, impulsif, dan haus darah",
    "Penyembuhan Masif"
  );

  // Membuat objek Dewa Moros
  public Dewa dewa2 = new Dewa(
    "Moros", 
    500,  // Health
    400, // Power
    250, // Energy Absolut
    "Tidak berperasaan dan netral",
    "Aura Kehampaan"
  );

  // Konstruktor Tree AlurCerita
  public AlurCerita() {
    root = null;
  }

  // Fungsi Membuat Root Tree
  public void createRoot(String kode) {
    root = new Cerita(kode);
  }

  // Fungsi Menginput Node Tree Menggunakan Metode Inorder
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

  // Fungsi Menginput Dialog ke Node Tree Tertentu Menggunakan Metode PreOrder
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

  // Fungsi Untuk Melakukan Battle antara Entitas Entitas Tujuan
  public void battle(Karakter opponent, Player p1, Player p2, Player p3) {
    QueuePlayer current = queuePlayer;

    queuePlayer.enqueue(p1);
    queuePlayer.enqueue(p2);
    queuePlayer.enqueue(p3);

    Player currentPlayer;
    System.out.print("\033[H\033[2J");
    System.out.flush();

    while (current.sizeQueue() > 0) {
      currentPlayer = current.dequeue();
      System.out.print("\033[H\033[2J"); System.out.flush();

      while (true) {
        System.out.println("===== Pertarungan Dimulai =====");
        System.out.println("1. Serang");
        System.out.println("2. Pilih & Gunakan Item");
        System.out.println("3. Urutkan Item Descending");
        System.out.println("4. Menyerah");
        if (currentPlayer.energy < 10) {
          System.out.println("5. Pulihkan Energi");
        }
        System.out.println("\n------------------------------\nAntrian bermain!!!");
        queuePlayer.displayQueue(currentPlayer);
        System.out.println("\n------------------------------\nPlayer bermain!!!");
        System.out.println(currentPlayer.name + " [Health: " + currentPlayer.health + ", Energy: " + currentPlayer.energy + "]\nMelawan");
        System.out.println(opponent.name + " [Health: " + opponent.health + ", Energy: " + opponent.energy + "]");
        System.out.print("Pilih aksi: ");

        String choose = scanner.nextLine().trim();

        if (choose.equals("1")) { // Serang
          if (currentPlayer.energy >= 10) {
            currentPlayer.attack(opponent);
            if (opponent.health > 0) {
              opponent.attack(currentPlayer);
            }
            scanner.nextLine();
          } else {
            System.out.println("Energi tidak cukup untuk menyerang.");
          }
        } else if (choose.equals("2")) { // Pilih & Gunakan Item
          System.out.println("\nDaftar Item:");
          currentPlayer.item.displayItem();
          System.out.print("Pilih Item berdasarkan nama: ");
          String itemName = scanner.nextLine().trim();
          Item selectedItem = currentPlayer.hapusItem(itemName);
            
          if (selectedItem != null) {
            System.out.println(currentPlayer.name + " menggunakan item: " + selectedItem.nama);
            if (selectedItem.isReusable) {
              currentPlayer.power += selectedItem.effect;
              System.out.println("Power bertambah: " + selectedItem.effect);
              currentPlayer.attack(opponent);
              opponent.attack(currentPlayer);
              currentPlayer.power -= selectedItem.effect;
            } else {
              switch (selectedItem.type) {
                case "power":
                  currentPlayer.power += selectedItem.effect;
                  System.out.println("Power " + currentPlayer.name + " menjadi " + currentPlayer.power);
                case "energy":
                  currentPlayer.energy += selectedItem.effect;
                  System.out.println("Energy " + currentPlayer.name + " menjadi " + currentPlayer.energy);
                case "health":
                  currentPlayer.health = Math.min(100, currentPlayer.health + selectedItem.effect);
                  System.out.println("Health " + currentPlayer.name + " menjadi " + currentPlayer.health);
              }
            }
            scanner.nextLine();
          } else {
            System.out.println("Item tidak ditemukan!");
          }
        } else if (choose.equals("3")) {
          currentPlayer.sortItem();
          currentPlayer.attack(opponent);
          opponent.attack(currentPlayer);
          scanner.nextLine();
        } else if (choose.equals("4")) { // Menyerah
          System.out.println(currentPlayer.name + " memilih menyerah. ");
          System.out.print("\033[H\033[2J"); System.out.flush();
          break;
        } else if (choose.equals("5") && currentPlayer.energy < 10) { // Pulihkan Energi
          currentPlayer.restoreEnergy();
          if (opponent.health > 0) {
            opponent.attack(currentPlayer);
          }
        } else {
          System.out.println("Pilihan tidak valid. Silakan coba lagi.");
          System.out.print("\033[H\033[2J"); System.out.flush();
          continue;
        }

        // Periksa jika pemain atau lawan kalah
        if (currentPlayer.health <= 0) {
          System.out.println(currentPlayer.name + " telah meninggal!");
          if (current.sizeQueue() > 0) {
            scanner.nextLine();
            break; // Lanjutkan ke pemain berikutnya
          } else {
            System.out.println(opponent.name + " memenangkan pertarungan!");
            scanner.nextLine();
            return;
          }
        }

        if (opponent.health <= 0) {
          System.out.println(opponent.name + " telah kalah!");
          return;
        }

        // Pemain kembali ke antrean jika masih hidup
        if (currentPlayer.health > 0) {
          current.enqueue(currentPlayer);
        }

        if (current.sizeQueue() == 0) {
          System.out.println("Semua pemain kalah! " + opponent.name + " memenangkan pertarungan!");
          return;
        }

        break;
      }

      if (opponent.energy < 15) {
        opponent.restoreEnergy();
      }
    }
  }

  // Fungsi untuk Berpindah Node dalam Tree dengan Kondisi Musuh yang ada pada Node
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
            human.showKarakterInfo();
            scanner.nextLine();
            battle(human, player1, player2, player3);
            if (human.health < 1) {
              current = current.left;
              player1.item.addItem("Surgawi", "health", 100, false);
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act2.1")) {
          player1.health = 100; player2.health = 100; player3.health = 100;
          player1.energy = 85; player2.energy = 90; player3.energy = 100;
          queuePlayer.nullQueue();
          while (true) {
            monster1.showKarakterInfo();
            scanner.nextLine();
            battle(monster1, player1, player2, player3);
            if (monster1.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act2.2")) {
          player1.health = 100; player2.health = 100; player3.health = 100;
          player1.energy = 85; player2.energy = 90; player3.energy = 100;
          queuePlayer.nullQueue();
          while (true) {
            monster2.showKarakterInfo();
            scanner.nextLine();
            battle(monster2, player1, player2, player3);
            if (monster2.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act3")) {
          player1.health = 100; player2.health = 100; player3.health = 100;
          player1.energy = 85; player2.energy = 90; player3.energy = 100;
          queuePlayer.nullQueue();
          while (true) {
            roh.showKarakterInfo();
            scanner.nextLine();
            battle(roh, player1, player2, player3);
            if (roh.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act4.1")) {
          player2.health = 750; player2.energy = 230; player2.power = 450;
          player1.health = 100; player1.energy = 85;
          player3.health = 100; player3.energy = 100;
          queuePlayer.nullQueue();
          while (true) {
            dewa1.showKarakterInfo();
            scanner.nextLine();
            battle(dewa1, player1, player2, player3);
            if (dewa1.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act4.2")) {
          player1.health = 100; player2.health = 100; player3.health = 100;
          player1.energy = 85; player2.energy = 90; player3.energy = 100;
          queuePlayer.nullQueue();
          while (true) {
            dewa2.showKarakterInfo();
            scanner.nextLine();
            battle(dewa2, player1, player2, player3);
            if (dewa2.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              player1.item.addItem("Kebahagiaan", "pelindung", 1000, false);
              break;
            }
          }
        } else if (current.kode.equals("end1") || current.kode.equals("end2")
        || current.kode.equals("end3") || current.kode.equals("end4")
        || current.kode.equals("end5") || current.kode.equals("end6")
        || current.kode.equals("end7")) {
          return;
        }
      } else {
        continue;
      }
    }
  }
}