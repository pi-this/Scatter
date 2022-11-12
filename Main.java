import java.util.Random;
import java.util.Scanner;

public class Scramble{
   public static void main(String[] args) {
	   Scanner myObj = new Scanner(System.in);
	   String size;
	   String choice;
       
       System.out.println("Enter password langth (must be larger than 3) (12 is recomended)"); 
       size = myObj.nextLine(); 
       
       //Scanner myObj = new Scanner(System.in);
       //System.out.println("something that you would like to add to your password (if nothing, click enter)"); 
       //choice = myObj.nextLine(); 
       
       int val = convert(size);
       if (val <= 3){
		   System.out.println("password must be larger than 3 (12 is recomended)");
		   System.exit(0);
	   }

       System.out.println(generatePassword(val));
       
   }

   private static char[] generatePassword(int length) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$?&$%()*^<>+=";
      String numbers = "1234567890";
      //string choose = add;
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
      //password[4] = String choose;
   
      for(int i = 5; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password;
      
   }
   
   
   // Function to convert String to integer
    public static int convert(String str)
    {
        int val = 0;
  
        // Convert the String
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
  
            // This is thrown when the String
            // contains characters other than digits
            System.out.println("Invalid String");
        }
        return val;
    }
}
