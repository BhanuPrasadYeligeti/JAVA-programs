public class Palindrome {
    public static void main(String[] args)
    {
        int n=123;
        int sum=0;
        int r;
        //int p=n;
        while(n>0)
        {
r=n%10;
sum=sum*10+r;
n=n/10;
        }
        System.out.print(sum);
        //System.out.print(p);

    }

    
}
