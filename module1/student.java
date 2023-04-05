package module1;

import java.util.*;
public class student{
        int rollno;
        String Name;
        String address;
        
        Scanner sc=new Scanner(System.in);
        
        public void accept(){
            
        System.out.println("Enter the roll no.");
        rollno=sc.nextInt();
        
        System.out.println("Enter the name");
        Name=sc.nextLine();
        
        System.out.println("Enter the address");
        address=sc.next();
        
        
        }
    }