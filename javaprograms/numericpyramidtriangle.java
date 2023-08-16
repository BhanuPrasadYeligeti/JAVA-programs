public class numericpyramidtriangle {
    public static void main(String[] args)
    {
        int i,j,k,l;
        int r=4;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=r-i;j++)
            {
                System.out.print("");

            }
            for(k=1;k<i;k++)
            {
                System.out.print(k);
            }
            for(l=i-1;l>1;l++)
            {
               System.out.print(l);

            }
        System.out.println();

        }
    }
    
}
