public class Main {
    public static void main(String[] args) {
      // Membuat objek-objek karakter
      Player wadis = new Player("Wadis", "Warrior", 100, 50, 30, "Brave", "Defeat the Dark Lord");
      Player ananta = new Player("Ananta", "Mage", 80, 60, 40, "Wise", "Master the Elements");
      Player khair = new Player("Khair", "Assassin", 90, 40, 50, "Stealthy", "Take down the Tyrants");
  
      Monster xenomorph = new Monster("Xenomorph", 120, 30, 70, "Fierce", "Alien");
      Monster cerberus = new Monster("Cerberus", 150, 50, 60, "Aggressive", "Three-headed Beast");
  
      Human villainFakhroni = new Human("Villain Fakhroni", 100, 80, 60, "Cunning");
  
      Roh umbra = new Roh("Umbra", 100, 100, 90, "Mysterious", "High");
  
      Dewa ares = new Dewa("Ares", 200, 120, "God of War", "Warrior's Wrath");
      Dewa moros = new Dewa("Moros", 180, 110, "God of Doom", "Doom's Touch");
  
      // Menampilkan informasi karakter
      wadis.showCharacterInfo();
      ananta.showCharacterInfo();
      khair.showCharacterInfo();
      xenomorph.showCharacterInfo();
      cerberus.showCharacterInfo();
      villainFakhroni.showCharacterInfo();
      umbra.showCharacterInfo();
      ares.showCharacterInfo();
      moros.showCharacterInfo();
  
      // Simulasi beberapa aksi
      System.out.println("\n--- Battle Simulation ---");
  
      // Wadis menyerang Xenomorph
      wadis.takeDamage(30);
      xenomorph.takeDamage(40);
  
      // Xenomorph menggunakan energi
      xenomorph.useEnergy(10);
  
      // Ananta mengembalikan energi
      ananta.restoreEnergy(20);
  
      // Khair melakukan serangan diam-diam
      khair.performAction("Silent Strike on Cerberus");
  
      // Villain Fakhroni mengambil kerusakan
      villainFakhroni.takeDamage(50);
  
      // Cerberus melakukan aksi
      cerberus.performAction("Multiple Bite Attack");
  
      // Umbra melakukan aksi misterius
      umbra.performAction("Shadow Manipulation");
  
      // Ares menggunakan kemampuan khusus
      ares.performAction("Activate Warrior's Wrath");
  
      // Moros mengurangi energi
      moros.useEnergy(30);
    }
  }
  