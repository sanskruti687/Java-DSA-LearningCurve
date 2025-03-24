import java.util.*;
class primeNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter a number:");
        int num=sc.nextInt();
         sc.close();

         boolean isprime=true;

         if(num<=1)
         {
            isprime=false;
         }
         else
         {
            for(int i=2;i<=num/2;i++)
            {
                if(num% i==2)
                {
                    isprime=false;
                    break;
                }


            }
         }
         if(isprime)
         {
            System.out.println(num + "is a  not prime num");
         }
         else
         {
            System.out.println(num + " is  prime number");
         }


    }
}