import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
    char c;
    Scanner sc=new Scanner(System.in);
    c=sc.next().charAt(0);
    int value=c;
    System.out.println(value);
    }
}