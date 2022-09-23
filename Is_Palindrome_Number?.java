import java.util.*;
class Switchdemo {

	public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int r1,r2,flag=0;
			int d=(int)Math.log10(n);
			while(n>0)
			{
				r1=n%10;
				r2=n/(int)Math.pow(10, d);
				if(r1!=r2)
				{
					flag=1;
					break;
			}
				n=n%(int)Math.pow(10, d);
				n/=10;
				d-=2;	
			}
			if(flag==0)
			{
				System.out.println("2");
			}
			else
			{
				System.out.println("1");
			}
		}

	}
