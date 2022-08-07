import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueDemo1{
public static void main(String args[]) {
PriorityQueue q = new PriorityQueue(); 
// 1.To add elements to the PriorityQueue we can use either add or offer methods
q.add('A');
q.add('B');
q.add('C');
q.offer('C');
// Duplicates are allowed,Insertion Order is Preserved but Homogenous Data is not allowed
System.out.println("The priority queue is "+q);
// 2.To get the header elements we use the element and peek methods
// element returns no such element exception but peek returns null if queue is empty
System.out.println("The header element using element method is "+q.element());
System.out.println("The header element using peek method is "+q.peek()); 
// 3.To return and remove the element we use remove and poll methods
System.out.println("The queue using element remove is "+q.remove());
System.out.println("The queue using poll method is "+q.poll()); 
System.out.println("The priority queue after remove and poll method is "+q);
// 4.To read all the elements in the queue we are going to use the Iterator method
Iterator it = q.iterator();
while(it.hasNext()){
    System.out.println("This is using iterator "+it.next());
}
// This is using for each loop
for(Object e:q){
   System.out.println("This is using for each loop "+e); 
}
}}