import java.util.*;
class library
{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string ");
      String str;
      str=sc.nextLine();
      char ch;
      System.out.println("Enter the letter you want to search for");
      char ch2=sc.next().charAt(0);
      int l=str.length(),flag=0,pos=0;
      for(int i=0;i<l;i++)
      {
          ch=str.charAt(i);
          if(ch==ch2)
          {
              flag++;
              pos=i;
            
          }
         
          
      }
      if(flag==1)
      {
           System.out.println("element found at " +pos);
      }
      else {
          System.out.println("element not found");
       }
      
 }
}
