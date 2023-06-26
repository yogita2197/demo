package string_programms;

public class Reverse_String_Character {

	public static void main(String[] args) {
		 //1.  The idea is to traverse the length of the string 
	     // 2. Extract each character while traversing 
		 //3. Add each character in front of the existing string
		 String str= "Yogita", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Yogita"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    
	}

}
