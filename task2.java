/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
   enqueue() - помещает элемент в конец очереди, 
   dequeue() - возвращает первый элемент из очереди и удаляет его, 
   first() - возвращает первый элемент из очереди, не удаляя.
 */

 package W4;

 import java.util.ArrayDeque;
 
 public class task2 {
 
     public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
         linkedList.addLast(element);
 
         return linkedList;
     }
 
     public static int dequeue(ArrayDeque<Integer> linkedList) {
         int firstElement = linkedList.getFirst();
         linkedList.pollFirst();
         System.out.println("Queue after removing an element: " + linkedList);
 
         return firstElement;
     }
 
     public static int first(ArrayDeque<Integer> linkedList) {
         return linkedList.getFirst();
     }
 
     public static void main(String[] args) {
         ArrayDeque<Integer> linkedList = new ArrayDeque<>();
         for (int i = 0; i < 10; i++) {
             linkedList.add((int) (Math.random() * (10 - 1)));
         }
         int element = 22;
         System.out.println("Queue: " + linkedList);
         System.out.println("Queue after element added: " + enqueue(linkedList, element) + "\n"
                 + "Element to be added " + element);
         System.out.println("Element to remove: " + dequeue(linkedList));
         System.out.println("First element: " + first(linkedList));
     }
 
 }
