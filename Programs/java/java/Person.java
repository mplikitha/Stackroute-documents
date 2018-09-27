package PracticeEx2;

public class Person {
	String Name;
	int age;
	float salary;
	Person(String Name,int age,float salary) {
			this.Name=Name;
			this.age=age;
			this.salary=salary;
			
		}
	void display() {
		System.out.println("Person Name: "+Name);
		System.out.println("Person Age: "+age);
		System.out.println("Person Salary: "+salary);
	}
	public static void main(String args[]){  
		Person p1=new Person("Harry potter",30,2500.3f);  
		Person p2=new Person("sumit",40,6000f);  
		p1.display();  
		p2.display();  
		
	}	
	}
	

