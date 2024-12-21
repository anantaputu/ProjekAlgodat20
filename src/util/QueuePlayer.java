package util;

import entity.Player;

public class QueuePlayer {
  NodePlayer front, rear;

  public QueuePlayer () {
    this.front = null;
    this.rear = null;
  }

  public void nullQueue() {
    this.front = null;
    this.rear = null;
  }

  public void enqueue(Player nodePlayer) {
    NodePlayer newNode = new NodePlayer(nodePlayer);
    if (front == null) {
      front = rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public Player dequeue() {
    if (front == null) {
      return null;
    }
    Player nodePlayer = front.nodePlayer;
    front = front.next;
    return nodePlayer;
  }

  public void displayQueue(Player playerBattle) {
    NodePlayer current = front;
    while (current != null) {
      if (!current.equals(playerBattle)) {
        System.out.println(current.nodePlayer.name + " [Health: " + current.nodePlayer.health + ", Energy: " + current.nodePlayer.energy + "]");
      }
      current = current.next;
    }
  }

  public int sizeQueue() {
    NodePlayer current = front;
    int sum = 0;
    while (current != null) {
      sum += 1;
      current = current.next;
    }
    return sum;
  }
}