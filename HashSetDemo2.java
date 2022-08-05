import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo2 {
public static void main(String args[]){
// HashSet has no unique methods of its own it just uses methods of the Set Interface
HashSet <Integer> evennumber = new HashSet <Integer>();
evennumber.add(2);
evennumber.add(4);
evennumber.add(6);
System.out.println(evennumber);
HashSet <Integer> number = new HashSet<Integer>();
// 1.addAll method
number.addAll(evennumber);
number.add(10);
System.out.println("This is after addAll method "+number);
// 2.removeAll method
number.removeAll(evennumber);
System.out.println("This is after removeAll method only 10 is left since it was added later "+number);
}}