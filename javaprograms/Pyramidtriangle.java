public class Pyramidtriangle {
    public static void main(String[] args)
    {
        int i,j,k;
        int r=4;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=r-i;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=2*i-1;j++)
            {
            System.out.print("*");
            }
         System.out.println();
        }
    }
    
}
