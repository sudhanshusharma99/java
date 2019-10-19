class length{
 void length_string{
String name="Dhruv Sharma";
int nameLength = name.length();
System.out.println("The name " + name + " contains " + nameLength + "letters.");
}
}
public class String {

   public static void main(String args[]) {
      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      System.out.println( helloString );
   }
}
