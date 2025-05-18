
//

public class SortednRotatedArr{

public static int search(int arr[],int tar,int si, int ei){

	if(si>ei){
	return -1;
	}

	//kaam
	int mid=si+(ei-si)/2;

	//found
	if(arr[mid]==tar){
	return mid;
	}

	//mid on L1

	if(arr[si]<=arr[mid]){

	//case a:
	if(arr[si]<=tar && tar<=arr[mid]){
	return search(arr,tar,si,mid-1);//left part
	}
	//case b:
	else{
		return search(arr,tar,mid+1,ei);
	}
}

	//mid on L2
	else{


	//case c:
	if(arr[mid]<=tar && tar<=arr[ei]){
		return search(arr,tar,mid+1,ei);
	}
	//case d:
	else{
		return search(arr,tar,si,mid-1);
	}
}
}

public static void main(String args[]){

int arr[]={4,5,6,7,0,1,2};
int tar=0;
int tarIdx=search(arr,tar,0,arr.length);
System.out.print(tarIdx+" ");
}
}


