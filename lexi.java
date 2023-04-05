import java.util.*;
class lexi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("enter the wnd string");
        String str2=sc.nextLine();
        int i,c=0,d=0;
        char ch,ch2;
        if(str.length()==str2.length())
        {
            c++;
        
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            ch2=str2.charAt(i);
            if(ch==ch2)
            {
                d++;
            }
            
        }
        if(d==str.length() && c==1)
        {
            System.out.println("lexicographically equal strings");
            
        }
        else
        {
            System.out.println("invalid");
    }
    }
}
}