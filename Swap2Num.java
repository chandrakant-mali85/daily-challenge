

//Swap 2 Numbers Using ArrayList


import java.util.ArrayList;

public class Swap2Num{

public static void swap(ArrayList<Integer>list,int idx1,int idx2){

	int temp=list.get(idx1);
	list.set(idx1,list.get(idx2));
	list.set(idx2,temp);

}

public static void main(String args[]){

ArrayList<Integer>list=new ArrayList<Integer>();

list.add(2);
list.add(5);
list.add(9);
list.add(3);
list.add(6);


int idx1=1;
int idx2=3;
System.out.print(list);
swap(list,idx1,idx2);
System.out.println(list);

}


}
