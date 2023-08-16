public class Uniquearray {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,1,2,3};
        int i,j;
        for(i=0;i<7;i++)
        {
            for(j=i+1;j<7;j++)
            {
                if(a[i]==a[j])
                {
                 a[i]=-1;
                a[j]=-1;
                }
            }
        }
for(i=0;i<7;i++)
{
    if(a[i]>0)
    {
        System.out.print(a[i]);
    }
}
    }
    
}
