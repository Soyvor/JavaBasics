                                                                                import java.util.Scanner 
class kk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,f=0,i;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter 10 Numbers");
            a[10]=sc.nextInt();
        }
        System.out.println("Enetr the number to be searched");
        n=sc.nextInt();
        if(a[i]==n)
        System.out.println("Number found at the index of"+n[i]);
        else 
        System.out.println("Number not found");
    }
}