

// Check whether a number is prime or not.

public class PrimeNumber{


public static void main(String args[]){

int num=13;

boolean prime=true;

for(int i=2;i<=num/2;i++){

if(num%i==0){

prime=false;
break;

}
}
if(prime && num>1){
System.out.println("Number is prime");
}else{
System.out.println("Number is Not prime");

}




}


}
