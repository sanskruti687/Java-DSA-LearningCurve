//Find the largest element in an array.
public class LargeNumber
{
    public static void main(String[] args) {
        int arr[]={9,2,3,4,6,11,55};
        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];

            }
        }
            System.out.println(max);
        }

    }
