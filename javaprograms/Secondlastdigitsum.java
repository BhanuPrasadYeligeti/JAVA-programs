import java.util.*;
public class Secondlastdigitsum {
    public static void main(String[] args)
    
    {
        int n;
        System.out.print("enetr a n value");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        int sum=0;
        int r;
        int temp=0;
       // int n=e;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(sum<9)
        {
            System.out.print(sum);

        }  
        else{
            while(sum>0)
            {
            r=sum%10;
            temp=temp+r;
            sum=sum/10;
            }
            System.out.print(temp);
            
        }  

    }
 
    
}
