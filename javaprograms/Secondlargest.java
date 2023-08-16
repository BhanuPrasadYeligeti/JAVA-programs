public class Secondlargest {
    public static void main(String[] args)
    {
        int n=6;
        int i;
        int count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("yes prime");
        }
        else{
            System.out.print(" not prime");
        }
    }
    
    
}
