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
    150,  // Power
    "Bijaksana"
  );

  // Membuat objek karakter Wadis
  public Player player2 = new Player(
    "Wadis", 
    100,  // Health
    90,  // Energy
    120,  // Power
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

  public void battle(Karakter opponent) {
    String choose;
    QueuePlayer current = queuePlayer;
    Player currentPlayer;
    System.out.print("\033[H\033[2J"); System.out.flush();

    while (current.sizeQueue() > 1) {
      currentPlayer = current.dequeue();
      System.out.print("\033[H\033[2J"); System.out.flush();

      System.out.println("===== Pertarungan Dimulai =====");
      System.out.println("1. Serang");
      System.out.println("2. Gunakan Item");
      System.out.println("3. Menyerah");
      if (currentPlayer.energy < 10) {
        System.out.println("4. Pulihkan Energi");
      }
      System.out.println("------------------------------\nAntrian bermain!!!");
      queuePlayer.displayQueue(currentPlayer);
      System.out.println("------------------------------\nPlayer bermain!!!");
      System.out.println(currentPlayer.name + " [Health: " + currentPlayer.health + ", Energy: " + currentPlayer.energy + "]");
      System.out.println(opponent.name + " [Health: " + opponent.health + ", Energy: " + opponent.energy + "]");
      
      boolean validChoice = false;
      while (!validChoice) {
        System.out.print("Pilih aksi: ");
        choose = scanner.nextLine();

        switch (choose) {
          case "1":
            if (currentPlayer.energy >= 10) {
              currentPlayer.attack(opponent);
              if (opponent.health > 0) {
                opponent.attack(currentPlayer);
              }
            } else {
              System.out.println("Energi tidak cukup untuk menyerang.");
            }
            validChoice = true;
            break;
          case "2":
            String choose1;
            currentPlayer.item.displayItem();
            System.out.print("Pilih Item berdasarkan nama : ");
            choose1 = scanner.nextLine();
            Item temp = currentPlayer.hapusItem(choose1);
            if (temp != null) {
              if (temp.isReusable == true) {
                currentPlayer.power += temp.effect;
                System.out.println(currentPlayer.name + " menggunakan " + temp.nama);
                currentPlayer.attack(opponent);
                opponent.attack(currentPlayer);
                currentPlayer.power -= temp.effect;
              } else {
                if (temp.type.equals("power")) {
                  currentPlayer.power += temp.effect;
                } else if (temp.type.equals("energy")) {
                  currentPlayer.energy += temp.effect;
                } else if (temp.type.equals("health")) {
                  currentPlayer.health += temp.effect;
                }
              }
            } else {
              System.out.println("Item tidak ditemukan!");
            }
            validChoice = true;
            break;
          case "3":
            System.out.println(currentPlayer.name + " memilih menyerah. " + opponent.name + " adalah pemenangnya!");
            currentPlayer.health = 0;
            validChoice = true;
            break;
          case "4":
            if (currentPlayer.energy < 10) {
              currentPlayer.restoreEnergy();
              if (opponent.health > 0) {
                opponent.attack(currentPlayer);
              }
              validChoice = true;
            } else {
              System.out.println("Energi sudah cukup, tidak perlu pulihkan.");
              validChoice = true;
            }
            break;
          default:
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            break;
        }
    }

    if (opponent.energy < 15) {
      opponent.restoreEnergy();
    }

    // Menghapus pemain yang mati dari antrean
    if (currentPlayer.health <= 0) {
      System.out.println(currentPlayer.name + " telah meninggal!");
      if (current.sizeQueue() > 0) {
        continue;
      } else {
        System.out.println(opponent.name + " mengalahkan " + currentPlayer.name);
        break;
      }
    }

    if (opponent.health <= 0) {
      System.out.println(opponent.name + " telah kalah!");
      current.enqueue(currentPlayer);
      break;
    }

    if (currentPlayer.health > 0) {
      current.enqueue(currentPlayer);
    }

    if (current.sizeQueue() < 1) {
      System.out.println("Kalah Telak!!!");
      break;
    }

    scanner.nextLine();
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
            human.showKarakterInfo();
            scanner.nextLine();
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
            monster1.showKarakterInfo();
            scanner.nextLine();
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
            monster2.showKarakterInfo();
            scanner.nextLine();
            battle(monster2);
            if (monster2.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
              break;
            }
          }
        } else if (current.kode.equals("act3")) {
          while (true) {
            roh.showKarakterInfo();
            scanner.nextLine();
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
            dewa1.showKarakterInfo();
            scanner.nextLine();
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
            dewa2.showKarakterInfo();
            scanner.nextLine();
            battle(dewa2);
            if (dewa2.health < 1) {
              current = current.left;
              break;
            } else {
              current = current.right;
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