

//Sorting an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class SortArryList{

public static void main(String args[]){

ArrayList<Integer>list=new ArrayList<>();

list.add(2);
list.add(5);
list.add(9);
list.add(3);
list.add(6);

Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

}
}

