public class RepeatString {

    public static void main(String[] args) {
 
int n = 3;
String in = "stackroute";
 
StringBuilder b = new StringBuilder(n * in.length());
   for (int i = 0; i < n; i += 1) {
   b.append(in);
}
String newString = b.toString();
System.out.println(newString);
    }
}
