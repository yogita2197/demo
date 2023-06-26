package string_programms;

public class Demo_reverse_string {

	public static void main(String[] args) {
         String originalStr = "Demo";
         String reversedStr  = "";
         
         for (int i = 0; i < originalStr.length(); i++ )  {
        	 reversedStr = originalStr.charAt(i) + reversedStr;
        	 
         }
         System.out.println("reversed string: " + reversedStr);
}
}