public class Array {
    public static void main(String[] args)
    {
        int[] original={1,2,3,4};
        int[] copied=original;
        System.out.print("original\n");
        for(int i=0;i<original.length;i++)
        {
            System.out.println(original[i]);

        }
        System.out.print("copied\n");
        for(int i=0;i<copied.length;i++)
        {
            System.out.println(copied[i]);

        }
    
}
}
