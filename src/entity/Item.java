package entity;

public class Item {
  public String nama;
  public String type;
  public int effect;
  public boolean isReusable;
  public Item next, prev;

  public Item (String nama, String type, int effect, boolean isReusable) {
    this.nama = nama;
    this.type = type;
    this.effect = effect;
    this.isReusable = isReusable;
    this.next = null;
    this.prev = null;
  }
}