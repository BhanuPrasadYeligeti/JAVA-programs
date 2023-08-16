public class Methodarray {
    static void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int[] arr_2=arr;
        System.out.println("original array elements");

        display(arr);
        System.out.println("copied  array elements");
        display(arr_2);

    }
    
}
