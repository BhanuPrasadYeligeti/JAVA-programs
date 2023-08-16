public class Numericalrectangularpattern {
    public static void main(String[] args)
    {
        int i,j,k;
        int r=7;
        for(i=1;i<=r;i++)
        {
            for(j=i;j<=r;j++)
            {
                System.out.print(j);
            }
            for(k=1;k<=i-1;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
