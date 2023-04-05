import java.util.*;
class SUM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers a and b");
        int a,b,diff;
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is "+sum);
        if(a>b)
        {
        diff= a-b;
    }
    else if(b>a)
    {
        diff=b-a;
    }
    else
    diff=a-b;
    
    System.out.println("The difference is " +diff);
    }
}