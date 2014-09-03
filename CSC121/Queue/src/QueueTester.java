 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class QueueTester {
    public static void main(String[] args)
    {
    	System.out.println("---ARRAY QUEUE ---");
        ArrayQueue q = new ArrayQueue(10);
        q.enqueue("one");
        q.enqueue("two");
        System.out.println(q.dequeue());
        q.enqueue("five");
        q.enqueue("four");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.front);
        System.out.println(q.rear);
        
        System.out.println("\n");
        System.out.println("---LINKED QUEUE---");
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue("one");
        lq.enqueue("two");
        lq.enqueue("seven");
        lq.enqueue("five");
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        lq.enqueue("ten");
        lq.enqueue("nine");
        lq.enqueue("four");
        lq.enqueue("three");
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
    }
}