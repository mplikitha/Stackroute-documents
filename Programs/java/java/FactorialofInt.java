package com.stackroute.module2.practiceExercises;

public class FactorialofInt {

	
	    
	    public static void main(String[] args)
	    {
	        FactorialofInt aFactorialInt = new FactorialofInt();
	        
	        System.out.println("Int factorials:");
	        aFactorialInt.printIntFactorials();
	        
	        System.out.println("Long factorials:");
	        aFactorialInt.printLongFactorials();
	    }
	    
	    
	    public void printIntFactorials()
	    {
	        int i  = 1;
	        int fact = 1;
	        String factresult;
	        while (true)
	        {
	            System.out.println("The factorial of "+i+" is"+ fact);
	        	//factresult="The factorial of "+i+" is "+fact;
	            if (Integer.MAX_VALUE / fact < (i+1)) {
	                System.out.println("The factorial of "+ (i+1)+ "is out of range.\n");
	            	//factresult="The factorial of "+(i+1)+" is out of range";
	                break;
	            }
	            i++;
	            fact *= i;
	           
	        }
	        
	    }
	    
	    public void printLongFactorials()
	    {
	        long i  = 1L;
	        long fact = 1L;
	        String factresult;
	        while (true)
	        {
	            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
	        	//factresult="The factorial of "+i+" is "+fact;
	        	
	            if (Long.MAX_VALUE / fact < (i+1)) {
	               System.out.println("The factorial of "+(i+1)+ "is out of range.\n");
	            	//factresult="The factorial of "+(i+1)+" is out of range";
	                break;
	            }
	            i++;
	            fact *= i;
	            
	        }
	       
	    }    
}
