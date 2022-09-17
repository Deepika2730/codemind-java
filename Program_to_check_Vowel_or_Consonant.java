import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if(c=='a' || c=='A' || c=='E' || c=='e'|| c=='I' ||c=='i' || c=='O' ||c=='o')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}