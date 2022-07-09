
import java.util.Random;
/**
 * @version 1.00
 * @since July 09, 2022 GumBox Inc.
 * @author falc0n (https://www.github.com/haft2k)
 */



public class GeneratePassword{
   public static void main(String[] args) {
      System.out.println(generatePassword(16));
   }

   private static char[] generatePassword(int length) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$%^&*()-_+=|}]{[\"':;?\\/>.<,~`";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;

      Random random = new Random();
      char[] password = new char[length];

      for(int i = 0; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }

      return password;
   }
}