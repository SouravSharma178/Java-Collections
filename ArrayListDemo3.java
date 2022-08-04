import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListDemo3 {
public static void main(String args[]) {
String []arr = {"Cat","Dog","Elephant"};
for(String value:arr){
System.out.println(value);
    
}
// now we are going to convert this array into ArrayList
// here Arrays is a class from java.utils package and it has a static method called asList
ArrayList al = new ArrayList(Arrays.asList(arr));
System.out.println("This is conversion from array to Array to ArrayList "+al);
}
}
