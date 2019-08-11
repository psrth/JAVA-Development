//PROJECT ENIGMA
//Class 10 Computer Board Project
//Purpose: Encryption and Decryption of messages
//Version: 1.0.3
//Author: Parth Sharma
//A tribute to Alan Turing, 1912-1954

import java.util.*;

public class ENIGMA {
    
  //function for encryption of ROT13
   public static String rotE13(String input){   
        String done = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            done += c;
        }
        return done;
  }
  
  //function for encryption using Caesar Cipher
  public static String caesarE(String input, int shift){   
      String done = "";
      for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if       (c >= 'a' && c <= 'm') c += shift;
            else if  (c >= 'A' && c <= 'M') c += shift;
            else if  (c >= 'n' && c <= 'z') c -= shift;
            else if  (c >= 'N' && c <= 'Z') c -= shift;
            done += c;
      }
      return done;
    }
    
  //function for decryption using Caesar Cipher
  public static String caesarD(String input, int shift){
      String done = "";
      for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if       (c >= 'a' && c <= 'm') c -= shift;
            else if  (c >= 'A' && c <= 'M') c -= shift;
            else if  (c >= 'n' && c <= 'z') c += shift;
            else if  (c >= 'N' && c <= 'Z') c += shift;
            done += c;
      }
      return done;
  }
  
  //function for encryption using Vignere Cipher
  public static String encryptVig(String text, String key)   {
        String res = "";
        text = text.toUpperCase();
        for (int i = 0, j = 0; i < text.length(); i++)  {
            char c = text.charAt(i);
            if (c < 'A' || c > 'Z') continue;
            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
   }
   
  //function for decryption using Vignere Cipher
  public static String decryptVig(String text, String key)  {
        String res = "";
        text = text.toLowerCase();
        for (int i = 0, j = 0; i < text.length(); i++)  {
            char c = text.charAt(i);
            if (c < 'a' || c > 'z')   continue;
            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
            j = ++j % key.length();
        }
        return res;
    }
    
  //mains function to run program
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        //this while loop enables a choice to reuse or terinate ENIGMA
        while (true){
        System.out.println("What would you like to do?");
        System.out.println("1. Encryption \n2. Decryption");
        int menuSel = sc.nextInt();
        //using switch case to manage the user-entered choice
        switch (menuSel) {
          case 1:
          System.out.println("What encryption would you like?"); 
          System.out.println("1. ROT13 Cipher \n2. Caesar Cipher \n3. Vigenere Cipher");
          int choice = sc.nextInt();
          //a nested switch to chose a particular type of cipher
          switch (choice) {
              case 1:
                Scanner ab = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String move = ab.nextLine();
                String check = rotE13(move);
                System.out.println(check);
                break;
                
                case 2:
                Scanner cd = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String move2 = cd.nextLine();
                System.out.println("Enter the number to shift by: ");
                int chan2 = cd.nextInt();
                String check2 = caesarE(move2, chan2);
                System.out.println(check2);
                break;
                   
                case 3:
                Scanner ef = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String move3 = ef.nextLine();
                System.out.println("Enter the key: ");
                String chan3 = ef.nextLine();
                String check3 = encryptVig(move3, chan3);
                System.out.println(check3);
                break;
                
                default:            
                System.out.println("Not recognized.");
                break;    
           }
          break;
        
          case 2:
          System.out.println("What decryption would you like?"); 
          System.out.println("1. ROT13 Cipher \n2. Caesar Cipher \n3. Vigenere Cipher");
          int choice2 = sc.nextInt();
          //another nested switch for chosing cipher
             switch (choice2){ 
               case 1:
                Scanner gh = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String move = gh.nextLine();
                String check = rotE13(move);
                System.out.println(check);
                break;
                
              case 2:
                Scanner ij = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String move2 = ij.nextLine();
                System.out.println("Enter the number to shift by: ");
                int chan2 = ij.nextInt();
                String check2 = caesarD(move2, chan2);
                System.out.println(check2);
                break;
                
              case 3:
                Scanner kl = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String move3 = kl.nextLine();
                System.out.println("Enter the key: ");
                String chan3 = kl.nextLine();
                String check3 = decryptVig(move3, chan3);
                System.out.println(check3);
                break;
                
              default:
              System.out.println("Option Not Recognized.");
              break;
          }
          break;
       
          default:
          System.out.println("Option not recognized by ENIGMA. Please try again.");
          //a default message to ensure smooth running of program
          break;
      }
       //the following block of code 
       System.out.println("Enter:");
       System.out.println("1. Ues ENIGMA again \n2. Terminate ENIGMA");
       int ex = sc.nextInt();
       if (ex==1) continue;
       else break;
    }
  }
}
