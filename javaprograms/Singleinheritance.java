 public class Singleinheritance {
    public static void main(String[] args)
    {
        Child  obj=new Child();
        obj.display(5);
        obj.sum();
    }

    
}
 class Parent
{ 
      void display(int a)
    {
    System.out.println("bhanu"+a);
}
}

class Child extends Parent 
{
    void sum()
    {
System.out.print("child class");
}
}
