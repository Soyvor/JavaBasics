import java.util.*;
class value
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("enter the word to search");
        String w=sc.nextLine();
        if(str.contains(w))
        {
                System.out.println("present");
                
        }
        else{
                System.out.println("not present");
        }

    }
}        