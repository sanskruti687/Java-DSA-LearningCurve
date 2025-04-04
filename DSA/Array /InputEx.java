import java.util.*;

class  InputEx
{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of the element");
    int size=sc.nextInt();
    int number[]=new int[size];

    for(int i=0;i<=size;i++)
    {
        System.out.println("enter the element");
        number[i]=sc.nextInt();
        System.out.println(number[i]);

    }
}

}