package assignments;
import java.util.Scanner;

public class Assignment1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String str;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter string");
			str = s.nextLine();
			String[] st = str.split("\\s");
			for (String s1 : st) {
				System.out.println(s1);
			}
			System.out.println("\n");
			
			//file name
//			int fromPos=str.indexOf("from");
//			int wherePos=str.indexOf("where");
//			String fileString=str.substring(fromPos+4, wherePos);
			

			String[] s2 = str.split("where");
			System.out.println(s2[0]);
			
			
			System.out.println("\n");
			
			
			System.out.println(s2[1]);
			
			
			
			System.out.println("\n");
			
			String beforeWhere=s2[0];
			String[] fromSplit=beforeWhere.split("from");
			String fileString=fromSplit[1];
			
			System.out.println(fileString);
			
			
			
			System.out.println("\n");
					
					

			//issue
			String s3 = s2[1];
			 
			String[] s4 = s3.split("and");
			int i=0;

			for (String str1 : s4) {
				
				System.out.println("condition "+(++i)+" : " + str1);
			}
			
			
			
			
			System.out.println("\n");
			
			for(int j=0;j<s4.length;j++) {
				String condString=s4[j];
				String operator;
				for(int k=1;k<=s4.length;k++) {
					System.out.println("Condition "+k);
					if(k==1) {
						operator=">";
					}
					else if(k==2) {
						operator="=";
					}
					else {
						operator="";
					}
					//String operator="[>,=]";
					String[] condVarString=condString.split(operator);
					String variable=condVarString[0];
					String condOperator=operator;
					String value=condVarString[1];
					System.out.println("variable : "+variable);
					System.out.println("operator : "+condOperator);
					System.out.println("Value : "+value);
				}
				
			}
//			String s5=s4[0];
//			String op1=">";
//			String s7=s4[1];
//			String op2="=";
//			
//			
//			int j,k;
//			for(j=1;j<=s4.length;j++)
//			{
//				String[] s6=s5.split("[<=]");
//				
//			System.out.println("Condition :"+j);
//			for(k=0;k<j;k++) {
//			
//			System.out.println("	Variable : "+s6[k]);
//			k++;
//			System.out.println("	Operator : "+op1);
//			System.out.println("	Value : "+s6[k]);
//				
//			}
//			}

			
//			String[] s8=s7.split(op2);
//			System.out.println("Condition 2 :");
//			
//			System.out.println("	Variable : "+s8[0]);
//			System.out.println("	Operator : "+op2);
//			System.out.println("	Value : "+s8[1]);
//			
			
			//Logical operators
//			String s9=s2[1];
//			String logic_op1="and";
//			String logic_op2="or";
//			String logic_op3="not";
//			String[] s10=s9.split("\\s");
//			for(int l=0;l<s10.length;l++) {
//				if(s10[l]==logic_op1 || s10[l]==logic_op2 || s10[l]==logic_op3) {
//				System.out.println(s10[l]);
//				}
//			}
			
			if(str.contains("order by")) {
			
			int n=str.indexOf("order by");
			
			String orderByCond = str.substring(n+8);
			System.out.println(orderByCond);
			}
			

		
			int m=str.indexOf("select");
			int p=str.indexOf("from");
			String fields=str.substring(m+7, p);
			String[] fieldsArray = fields.split(",");
			for(String fieldString : fieldsArray) {
				System.out.println(fieldString);
			}
			
			
			if(str.contains("group by")) {
				
				int grp=str.indexOf("group by");
				
				String groupByCond = str.substring(grp+8);
				System.out.println(groupByCond);
				}

			}
	}


