public class AlurCerita {  
  Cerita root;

  public AlurCerita() {
    root = null;
  }

  public void createRoot(String kode) {
    root = new Cerita(kode);
  }

  public void inorderInput(Cerita node, Cerita newNode, String direction, String kode) {
    if (node != null) {
      if (node.kode.equals(kode)) {
        if (direction.equals("kanan")) {
          node.right = newNode;
        } else {
          node.left = newNode;
        }
        return;
      }
      inorderInput(node.left, newNode, direction, kode);
      inorderInput(node.right, newNode, direction, kode);
    }
  }

  public void preOrder(Cerita node) {
    if (node == null) {
      return;
    }

    System.out.print(node.kode);
    System.out.println();
    preOrder(node.left);
    preOrder(node.right);
  }


  public void levelOrderTraversal() {
    if (root == null) {
      return;
    }

    Queue queue = new Queue();
    queue.enqueue(root);

    while (queue.front != null) {
      Cerita current = queue.dequeue();
      System.out.print(current.kode);
      System.out.println();

      if (current.left != null) {
        queue.enqueue(current.left);
      }

      if (current.right != null) {
        queue.enqueue(current.right);
      }
    }
  }
}