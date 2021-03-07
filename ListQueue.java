class NodeQ {
  protected char letter;
  protected NodeQ next;
  
  NodeQ(char input) {
    letter = input;
    next = null;
  }
  
}



class ListQueue {
  protected NodeQ head;
  protected NodeQ tail;
  protected int size;
  
  public ListQueue() {
    head = null;
    tail = null;
    size = 0;
  }
  
  public void enqueue(char element) {
    NodeQ node = new NodeQ(element);
    node.next = null;
    if (size == 0) {
      head = node;
    }
    else {
      tail.next = node;
    }
    tail = node;
    size++;
  }
  
  public char dequeue() throws RuntimeException {
    if (size == 0) {
      throw new RuntimeException("Queue is empty.");
    }
    char result = head.letter;
    head = head.next;
    size--;
    if (size == 0) {
      tail = null;
    }
    return result;
  }

}
  
