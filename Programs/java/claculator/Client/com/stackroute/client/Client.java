package com.stackroute.client;
import com.stackroute.Calc.*;
class Client {
public static void main(String []args){

Calculator clientobj=new Calculator();
int sum,diff;
sum=clientobj.addition(5,6);
diff=clientobj.subtraction(6,2);
System.out.println("sum is"+sum);
System.out.println("difference is "+diff);
}

}
