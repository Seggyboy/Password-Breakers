import java.io.*;
import java.lang.Math;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Encrypt{


   
   
  
     String output = "";
     String charset = "abcdefghijklmnopqrstuvwxyz";
     int index = 0;
     int superindex = 0;
     int y = str.length();
     String compar1 = "";
     String compar2 = "";
     String[] letters = new String[y];
     for(int x = 0; x<str.length(); x++)
     {
      letters[x] = str.substring(x,x+1);
      System.out.println(letters[x]);
     }
     for(int x = 0; x < letters.length; x++)
     {
      
      if(x%2 == 0)
      {
        for(int z = 0; z<charset.length(); z++)
        {
         compar1 = charset.substring(z,z+1);
         compar2 = letters[x];
            if(compar1.equals(compar2))
            {
              superindex = z;
              break;
            }
         
        
        }
            letters[x]= charset.substring(superindex,superindex+2);
            letters[x]+= 9-x;
            index++;
          
         
         
       
      }
      else
      {
       
       letters[x] = charset.substring(superindex,superindex+2);
       letters[x]+= 2+x;

       index++;
      }
     
     
     }
     
     for(int x = 0; x<letters.length; x++)
     {
      output += letters[x];
     
     }
   
   return output;
   
   }
   
