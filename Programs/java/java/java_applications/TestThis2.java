class A{  
A(){System.out.println("hello a");}  
A(int x){  
this(); // go to A constructor -> prints "hello a" 
System.out.println(x);  // 10
}  
}  
class TestThis2{  
public static void main(String args[]){  
A a=new A(10);  
}}  


