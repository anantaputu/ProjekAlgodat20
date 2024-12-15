public class Cerita {
  String kode;
  Dialog head;
  Cerita left;
  Cerita right;

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
}