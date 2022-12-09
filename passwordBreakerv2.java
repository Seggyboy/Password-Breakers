import java.io.*;
import java.lang.Math;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class passwordBreakerv2{

   

   public static void main(String args[])
   {
     try{
     Crack("qazwsxedc12");
     }
     
     
      catch (Exception error) {
         System.out.println(error);
      }
      
   
   
   
   
   
   
   
   }
   
   public static void Crack(String str) throws FileNotFoundException, IOException
   {
      String fileName = "C:\\Users\\1856676\\Documents\\School\\Computer Science\\Runtime\\AP Compsci\\passwordbreakers\\passwords.txt";
      FileInputStream fis = new FileInputStream(fileName);
      Scanner namer = new Scanner(fis);
      String[] passwords = new String[8716];
      String charSet = "123456789";
      
      boolean found = false;
      for(int x = 0; x<passwords.length; x++)
      {
         passwords[x] = namer.nextLine(); // reads the passwords into an array
         
        
      
      }
      
         String password = "";
         
      for(int x = 0; x<passwords.length && found == false; x++)
      {
        
        password = passwords[x];
         if(str.equals(password))
            {
               System.out.println("password is " + password);
               found = true;
               break;
               
            }
        for(int y = 0; y<charSet.length() && found ==false; y++)
        {
            
            password = passwords[x];
            String tester = password += charSet.substring(y,y+1);
            System.out.println(password);
            
           if(str.equals(tester))
            {
               System.out.println("password is " + password);
               found = true;
               break;
            }
            
           
           
        
        }
        
         
      
      
      }
   
   
   }




















}