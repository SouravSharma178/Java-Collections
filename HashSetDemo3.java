import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo3 {
public static void main(String args[]){
// Set,Union and Intersection    
HashSet <Integer> set1 = new HashSet<Integer>();
set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
set1.add(5);
System.out.println("HashSet1 "+set1);
HashSet <Integer> set2 = new HashSet<Integer>();
set2.add(4);
set2.add(5);
set2.add(9);
// 1.union (it will collect all the elements from both the sets and and it will preserve all the unique elements)
set1.addAll(set2);
System.out.println("HashSet1 after union with HashSet2 "+set1);
// 2.intersection ()
// set1.retainAll(set2);
// System.out.println("HashSet1 after intersection with HashSet2 "+set1);
// 3.difference
// set1.removeAll(set2);
// System.out.println("HashSet1 after difference with HashSet2 "+set1);

// 4.subset
System.out.println(set1.containsAll(set2));
}}