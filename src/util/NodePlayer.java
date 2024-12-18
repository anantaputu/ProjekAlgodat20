package util;

import entity.Player;

public class NodePlayer {
  public Player nodePlayer;
  public NodePlayer next;

  public NodePlayer (Player nodePlayer) {
    this.nodePlayer = nodePlayer;
    this.next = null;
  }
}