// Queue implementation using the LinkedList class.


class Queue {
   private LinkedList linkedList;
    
   Queue() {
      linkedList = new LinkedList();
   }
   
   public void enqueue(int newData) {
      // Create a new node
      Node newNode = new Node(newData);
       
      // Insert as list tail (end of queue)
      linkedList.append(newNode);
   }
   
   public int dequeue() {
      // Copy list head's data
      int dequeuedItem = linkedList.getHeadData();
      
      // Remove list head
      linkedList.removeAfter(null);
      
      // Return dequeued item
      return dequeuedItem;
   }
   
   public void print() {
      linkedList.printList();
   }
}

public class QueueDemo {
   public static void main(String[] args) {
      int[] numbers = { 83, 4, 57, 6, 92, 49, 64, 5 };
      
      // Initialize a new Queue and add numbers
      Queue numQueue = new Queue();
      for (int number : numbers) {
          numQueue.enqueue(number);
      }

      // Output queue
      System.out.print("Queue after initial enqueues: ");
      numQueue.print();
      
      // Dequeue 83 and print
      numQueue.dequeue();
      System.out.print("Queue after first dequeue:    ");
      numQueue.print();
      
      // Enqueue 99 and print
      numQueue.enqueue(99);
      System.out.print("Queue after enqueueing 99:    ");
      numQueue.print();
      
      // Dequeue 4 and print
      numQueue.dequeue();
      System.out.print("Queue after second dequeue:   ");
      numQueue.print();
   }
}
