import java.util.*;
class num
{
    public static void main(String args[])
    {
        float k=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(float i=1;i<=n;i++)
        {
            k=k+(1/i);
        }
        System.out.format("%.2f",k);
    }
}