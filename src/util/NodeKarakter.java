package util;

import entity.Karakter;

public class NodeKarakter {
  public Karakter nodeKarakter;
  public NodeKarakter next;

  public NodeKarakter (Karakter nodeKarakter) {
    this.nodeKarakter = nodeKarakter;
    this.next = null;
  }
}