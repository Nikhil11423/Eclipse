package exam;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

class exam   
{    
    private String croma;  
    private String puma;
	private String items;  
   
       
      
    exam(String items,String Croma, String puma)   
    {  
        this.croma=Croma;  
        this.puma = puma;
        this.items=items;
         
    }  
          
    
    public String getItems()   
    {  
        return items;  
    } 
        public String getCroma()   
            {  
                return croma;  
            }  
            public String getPuma()   
            {  
                return puma;  
            } 
             
           
            public static void displayFormat()   
            {  
                System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");  
                System.out.print("\nitems \t\tCroma \t\tPuma\n");  
                System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");  
            }  
               
              
            public void display()   
            {  
                System.out.format("   %-9s             %-9s     %-9s   \n" ,croma, puma);  
            }  
            
            public static void main(String [] args) {
            displayFormat();
           
            }
}      
 

