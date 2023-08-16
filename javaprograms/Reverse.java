
import java.util.Scanner;
public class Reverse{
    static void printArr(int[] a)
   {int i;
System.out.print("array elements are");
for(i=0;i<a.length;i++)
{
    System.out.print(a[i]);
}
   }
static void printReverse(int[] a)
{
    int k=a.length-1;
    System.out.print("reverse array elements");
    for(int i=k;k>=0;i--)
    {
        System.out.print(a[i]);
    }
    
}
    
    public static void main(String[] args){
    
    Scanner obj=new Scanner(System.in);
        System.out.print("enetr n value");
       int  n=obj.nextInt();
        int[] a=new int[n];
        System.out.print("enetr array elements");
        for(int i=0;i<a.length;i++){
        a[i]=obj.nextInt();
        }
    
        printReverse(a);
        printArr(a);
        
    }

}
    

