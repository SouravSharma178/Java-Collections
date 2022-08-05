import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class LinkedListDemo3 {
public static void main(String args[]){
LinkedList l = new LinkedList();
l.add("Dog");
l.add("Cat");
l.add("Elephant");
l.add("Horse");
System.out.println(l);
// 1.addFirst (to add an element at the start of the LinkedList)
l.addFirst("Dinosaur");
System.out.println(l);
// 2.addLast (to add an element at the end of the LinkedList)
l.addLast("Whale");
System.out.println(l);
// 3.removeFirst (to remove an element at the start of the LinkedList)
l.removeFirst();
System.out.println(l);
// 4.removelast (to remove an element at the start of the LinkedList)
l.removeLast();
System.out.println(l);
// 5.getFirst
System.out.println(l.getFirst());
// 5.getLast
System.out.println(l.getLast());
}}