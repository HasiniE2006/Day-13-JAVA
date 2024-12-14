class gp
{
    public void r()
    {
        System.out.println("Hello I'm Grand Parent");
    }
}
class p1 extends gp
{
    public void r1()
    {
        System.out.println("Hello I'm Parent1");
    }
}
interface p2
{
    void r2();
}
class d extends p1 implements p2
{
    public void r2()
    {
        System.out.println("I'm Parent2");
    }
    public void r3()
    {
        System.out.println("I'm Child");
    }
}
public class Hybrid_Inheritance
{
    public static void main(String[] args) 
    {
        d h=new d();
        h.r();
        h.r1();
        h.r2();
        h.r3();
    }
}
