import java.util.*;
class gg
{
    public static void main(String Args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=0,b=1;
    int sum=a+b;
    System.out.print(0+","+1+",");
    for(int i=1;i<30;i++)
    {
        a=b;
        b=i;
        sum=a+b;
        if(sum>5)
        sum=sum+1;
        System.out.print(sum+",");
        
    }
     }
}
