
package it_a1;

public class C extends B
{
    int a = 3000;
    int b = 4000;
    void m2(int a, int b)
    {
        System.out.println(a);//44
        System.out.println(b);//33
        System.out.println(this.a);//3000
        System.out.println(this.b);//4000
        System.out.println(super.a);//30
        System.out.println(super.b);//40
    }
    public static void main(String[] args) 
    {
       C obj = new C(); 
       obj.m2(44, 33);
    }
}
