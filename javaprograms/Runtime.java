import java.util.Scanner;
public class Runtime {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("eneter n value");

        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("array values are");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }



    }
    
}
