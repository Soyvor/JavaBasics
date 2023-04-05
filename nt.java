import java.util.*;
class nt
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter a String");
        s=sc.nextLine();
        System.out.println("The menu is ");
        System.out.println("Press 1 to get the length of the string");
        System.out.println("Press 2 to get uppercase and lowercase");
        System.out.println("Press 3 to get Reverse of the number");
        System.out.println("Press 4 for exit");
        
        int c=sc.nextInt();
        String s1="",k,p;
        int i;
        int l=s.length();
        int d=0;
        while(d==0){
        switch(c)
        {
        case 1:
            System.out.println("the length is:"+l);
            break;
        case 2:
            k=s.toUpperCase();
            p=s.toLowerCase();
            System.out.println("Uppercase:"+k);
            System.out.println("Lowercase:"+p);
            break;
            
        case 3:
            
            char ch =' ';
            for(i=l;i>=l-1;i--)
            {
                ch=s.charAt(i);
                s1=s1+ch;
            }
            System.out.println("The reverse is:"+s1);
        break;
        
        case 4:
            d++;
            break;
            
        default:
            System.out.println("Wrong choice");
        }
    }

}}


        
        
            
        
    
    

