import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo1 {
public static void main(String[] args) {

//ArrayList al  = new ArrayList();
//This is the first way to declare array list

//ArrayList <Integer> al = new ArrayList<Integer>();

//ArrayList <String> al = new ArrayList<String>();

// Since list is the parent interface of ArrayList we can also declare it as

//List al = new ArrayList();

// 1.Add method

ArrayList al = new ArrayList();
al.add(100);
al.add("Welcome");
al.add(15.5);
al.add('A');
al.add(true);
System.out.println(al); // [100, Welcome, 15.5, A, true]

// 2.size method
System.out.println("Number of elements in ArrayList "+al.size());

// 3.remove method
// The remove method takes both index and the object as an argument

al.remove(1);
System.out.println("After removing elements in ArrayList "+al);

// 4.add elements at a particular index
al.add(2,"Python");
System.out.println("The list after adding Python at index 2 is "+al); //[100, 15.5, Python, A, true]

// 5.get method(get a particular element)
System.out.println("The element we were searching for at index 3 is "+al.get(3));


// 6.set method(change a particular value)
al.set(2,"Java");
System.out.println("The list after changing is "+al); //[100, 15.5, Java, A, true]

// 7.contains(check if a particular value is present or not)
System.out.println("The list contains value 100 "+al.contains(100));

// 8.isEmpty()
System.out.println("The list is Empty = "+al.isEmpty());

// 9.There are 3 ways to retrieve values from an ArrayList
System.out.println("This is using for loop");
for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
}
// This is using for each loop
// if we declare a variable as an object it can store data of any type
System.out.println("This is using for each loop");
for(Object e:al) {
	System.out.println(e);
}

// Iterator method
// iterator is a parent interface of the collection interface
// the al.iterator returns elements which we store in a variable of type Iterator
Iterator it = al.iterator();
// hasNext checks if the iterator has an element whereas "next" prints those elements
System.out.println("This is using iterator method");
while(it.hasNext()){
	System.out.println(it.next()); // print the element and move to next
}
	}
}
