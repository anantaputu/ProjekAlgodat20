public class MainCerita {
  public static void main(String[] args) {
    AlurCerita ceritaUtama = new AlurCerita();

    ceritaUtama.createRoot("prolog");

    // Telusuri Dalam Kiri 
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act1"), "kiri", "prolog");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act2.1"), "kiri", "act1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act2.2"), "kanan", "act1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act3.1"), "kiri", "act2.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.1"), "kiri", "act3.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.2"), "kanan", "act3.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end1"), "kiri", "act4.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end2"), "kanan", "act4.1");

    // Telusuri Dalam Kanan
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end3"), "kanan", "act3.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end4"), "kanan", "act2.1");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end7"), "kanan", "act2.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("act4.3"), "kiri", "act2.2");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end5"), "kiri", "act4.3");
    ceritaUtama.inorderInput(ceritaUtama.root, new Cerita("end6"), "kanan", "act4.3");

    ceritaUtama.levelOrderTraversal();
  }
}