import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
public static void main(String[] args){
// 1.addAll() - by using add all method we can copy objects from one array list into another collection
	
ArrayList al = new ArrayList();
al.add('X');
al.add('Y');
al.add('Z');
al.add('A');
al.add('B');
al.add('C');
ArrayList al_dup = new ArrayList();

// now using addAll method we are going to copy the elements of ArrayList al into ArrayList al_dup 
al_dup.addAll(al);

System.out.println(al_dup);

// 2.Now using removeAll we are going to remove these elements from al_dup ArrayList

al_dup.removeAll(al);

System.out.println("Now we would have an empty ArrayList as we have used removeAll method");

System.out.println(al_dup);

// 3.sorting
// now to sort an ArrayList we have to use static methods from the Collections class and this collections class is also present inside the utils package
System.out.println("Currently elements in the ArrayList are "+al);
Collections.sort(al);
System.out.println("After sorting the elements in the ArrayList are "+al);

// 4.sorting in the reverse order
Collections.sort(al,Collections.reverseOrder());
System.out.println("After sorting the elements in reverse order "+al);

// 5.shuffling(random order) elements
Collections.shuffle(al);
System.out.println("After shuffling the elements are "+al);
}}
