public class Trianglereversepattern {
    public static void main(String[] args)
    {
        int i,j;
        int r=4;
        for(i=0;i<=r;i++)
        {
            for(j=1;j<=r*1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
