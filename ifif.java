import java.util.*;
class ifif
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str,w="";
        char ch;
        System.out.println("enter the string ");
        
    
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ' )
            {
                w=w+ch;
            }
        }
        System.out.println("the space removed str is "+w);
    }
}