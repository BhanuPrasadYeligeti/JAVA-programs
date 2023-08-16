public class Arrayreverse {
    int a=3,b=10;
     static void  printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(+arr[i]);
        }
    }
    static int[] reverse(int[] arr)
    {
        int i=0;
        int j=0;
        int n=arr.length;
        int[] ans=new int[n];
    for(i=n-1;i>=0;i--)
    {
ans[j++]=arr[i];
    }
return ans;
    }
    public static void main(String[] args)
    {
int[] arr={1,2,3,4};
int[]ans=reverse(arr);
printArray(ans);
printArray(arr);




    }
    
}
