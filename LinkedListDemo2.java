import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class LinkedListDemo2 {
public static void main(String args[]){
// The following methods are specific to LinkedList only
LinkedList l = new LinkedList();
l.add('X');
l.add('Y');
l.add('Z');
l.add('A');
l.add('B');
l.add('C');
LinkedList l_dup = new LinkedList();
// 1.addAll method
l_dup.addAll(l);
System.out.println(l_dup);
// 2.removeAll method (removes all elements from the l_dup LinkedList)
// l_dup.removeAll(l);
// System.out.println(l_dup);
// 3.sorting the LinkedList
Collections.sort(l_dup);
System.out.println(l_dup);
// 4.shuffling the LinkedList
Collections.shuffle(l_dup);
System.out.println(l_dup);
// 5.sorting in reverse order
Collections.sort(l_dup,Collections.reverseOrder());
System.out.println(l_dup);
}}