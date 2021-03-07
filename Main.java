class Main {

  public static void main(String[] args) {
    
    //ArrayStack
    ArrayStack<Integer> test = new ArrayStack<Integer>();
    test.push(2);
    test.push(3);
    test.push(4);
    System.out.println(test.pop());
    System.out.println(test.pop());
    System.out.println(test.pop());
    //System.out.println(test.pop());
    
    
    
    //List-Based Queue
    ListQueue testQ = new ListQueue();
    testQ.enqueue('a');
    testQ.enqueue('b');
    testQ.enqueue('c');
    System.out.println(testQ.dequeue());
    System.out.println(testQ.dequeue());
    System.out.println(testQ.dequeue());
    
    
  }
}
