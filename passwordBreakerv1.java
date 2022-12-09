import java.io.*;
import java.lang.Math;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class passwordBreakerv1{


   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      System.out.println("input a four digit password to guess.");
      String thing = input.nextLine();
      Crack(thing);
   
   }
   
   public static void Encrypt(String str)
   {
     n
   
   
   
   }
   
   public static void Crack(String str)
   {
      String charSet = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz0123456789!@#$%^&*()_+-=[]{};'?><";
      String parserd1 = "";
      String parserd2 = "";
      String parserd3 = "";
      String parserd4 = "";
      String parserd5 = "";
      String password = "";
      int count = 0;
      System.out.println(charSet.length());
   
      for(int x = 0; x<charSet.length(); x++)
      {
         if(password.equals(str))
         {
            break;
         }
         parserd1 = charSet.substring(x, x+1);
         count++;
         for(int y= 0; y<charSet.length(); y++)
         {
            if(password.equals(str))
            {
               break;
            }
            parserd2 = charSet.substring(y,y+1);
            password = parserd1+parserd2;
            count++;
            
            for(int z = 0; z<charSet.length(); z++)
            {
               count++;
               if(password.equals(str))
               {
                  break;
               }
               parserd3 = charSet.substring(z,z+1);
               password = parserd1+parserd2+parserd3;
               for(int a = 0; a<charSet.length(); a++)
               {
                  count++;
                  parserd4 = charSet.substring(a,a+1);
                  password = parserd1+parserd2+parserd3+parserd4;
                  if(password.equals(str))
                  {
                     break;
                     
                  }
                 
                              
               }  
               System.out.println(password);
               
            
            }
         }
         
         
        
       
       
         
       
      }
   
   
      System.out.println("password is " + password + "/n total iterations: " + count);
   }


}
