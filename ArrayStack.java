public class ArrayStack {
  class ArrayStack<Integer> {
    protected int capacity;
    public static final int DEFAULTCAPACITY = 1000;
    protected int elements[];
    protected int top = -1;

    public ArrayStack(int cap) {
      capacity = cap;
      elements = new int[capacity];
    }

    public int size() {
      return (top + 1);
    }

    public boolean isEmpty() {
      return (top < 0);
    }

    public void push(int element) throws RuntimeException {
      if (size() == capacity)
        throw new RuntimeException("Stack is full.");
      elements[++top] = element;
    }

    public int top() throws RuntimeException {
      if (isEmpty())
        throw new RuntimeException("Stack is empty.");
      return elements[top];
    }

    public int pop() throws RuntimeException {
      int element;
      if (isEmpty())
        throw new RuntimeException("Stack is empty.");
      element = elements[top];
      top--;
      return element;
    }

  }
  
}

