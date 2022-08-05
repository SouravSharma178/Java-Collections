import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo1 {
public static void main(String args[]) {
// 1.Different ways to create HashSet objects    
// default HashSet object where the initial size is 16 objects and the load factor is 0.75    
//   HashSet hs = new HashSet(100);
//  HashSet hs = new HashSet(100,float(0.90));
//  HashSet <Integer>hs = new HashSet<Integer>();

// 2.Add objects to a HashSet
HashSet hs = new HashSet();
hs.add(100);
hs.add("Welcome");
hs.add('A');
hs.add(true);
hs.add(null);
hs.add(15.5);
// HashSet will not follow the insertion order and will arrange elements randomly
System.out.println(hs);
      
// 3.remove objects from a HashSet
hs.remove("Welcome");
System.out.println("After removing element "+hs);

// 4.contains (it checks for a particular value in the HashSet)
System.out.println(hs.contains(100));

// 5.isEmpty
System.out.println(hs.isEmpty());

// 6.ways to read objects from a HashSet
// since we do not have an index we cannot use a for loop
// for each loop
System.out.println("This is using for each loop");
for(Object e:hs){
    System.out.println(e);
}
System.out.println("This is using iterator method ");
Iterator it = hs.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
}}