import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
public class LinkedListDemo1 {
public static void main(String args[]){
// 0.Declaring LinkedList
// Restrict LinkedList with a particular type of data/Homogenous data
// LinkedList <Integer> l = new LinkedList <Integer>();
// LinkedList <String> l = new LinkedList <String>();
LinkedList l = new LinkedList();
l.add(100);
l.add("Welcome");
l.add(15.5);
l.add('A');
l.add(true);
l.add(null);
System.out.println(l);
// 2.size method
// LinkedList like the ArrayList does not maintain a reserved size of 10 elements because it internally maintains all elements in the form of nodes
System.out.println(l.size());
// 3.remove method (it can be used both using index and the value itself)
l.remove("Welcome");
System.out.println(l);
// 4.add/insert an object at a particular index
l.add(0,"Sourav");
System.out.println(l);
// 5.get method (retrieve a particular value from the list)
System.out.println(l.get(1));
// 6.set method - replace a value with another value
l.set(0,"Sharma");
System.out.println(l);
// 7.contains (it returns boolean values)
System.out.println(l.contains('A'));
// 8.isEmpty()
System.out.println(l.isEmpty());
// Reading elements of a LinkedList
System.out.println("The LL using for loop is ");
for(int i=0;i<l.size();i++){
    System.out.println(l.get(i));
}
System.out.println("The LL using for each loop is ");
for(Object e:l){
   System.out.println(e); 
}
System.out.println("The LL using iterator is ");
Iterator it = l.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
}}