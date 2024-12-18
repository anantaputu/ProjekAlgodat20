package util;

import entity.Player;

public class QueuePlayer {
  NodePlayer front, rear;

  public QueuePlayer () {
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

  public int sizeQueue() {
    NodePlayer current = front;
    int sum = 0;
    while (current != null) {
      sum++;
      current = current.next;
    }
    return sum;
  }
}