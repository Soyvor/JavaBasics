import java.util.*;
class getchar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in );
        System.out.println("enter the string ");
        String str=sc.nextLine();
        System.out.println("enter the position of the character which you want to see unicode of ");
           char ch;
           int pos=sc.nextInt();
        
           ch=str.charAt(pos);
           int i=(int)ch;
           System.out.println(i);
            
            

        }
    }