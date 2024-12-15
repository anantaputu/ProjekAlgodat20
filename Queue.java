public class Queue {
  NodeQueue front;
  NodeQueue rear;

  public Queue() {
    this.front = null;
    this.rear = null;
  }

  public void enqueue(Cerita nodeCerita) {
    NodeQueue newNode = new NodeQueue(nodeCerita);
    if (rear == null) {
      front = rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public Cerita dequeue() {
    if (front == null) {
      System.out.println("Queue is empty. Cannot dequeue.");
      return null;
    }

    Cerita nodeCerita = front.nodeCerita;
    front = front.next;

    if (front == null) {
      rear = null;
    }

    return nodeCerita;
  }

}