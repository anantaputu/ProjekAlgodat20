package util;

import entity.Karakter;

public class QueueKarakter {
  NodeKarakter front, rear;

  public QueueKarakter () {
    this.front = null;
    this.rear = null;
  }

  public void enqueue(Karakter nodeKarakter) {
    NodeKarakter newNode = new NodeKarakter(nodeKarakter);
    if (front == null) {
      front = rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public Karakter dequeue() {
    if (front == null) {
      return null;
    }
    Karakter nodeKarakter = front;
    front = front.next;
    return nodeKarakter;
  }
}