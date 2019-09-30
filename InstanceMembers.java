public class InstanceMembers{
   int a;
   //a=99;//identifier expected
   
    public InstanceMembers(){
       // a=7;
    }
     {
        a=10;
        System.out.println(a);//illegal forward reference
    }
    //int a=11;
    static{
        b=5;
       System.out.println(b);//illegal forward reference
    }
    //static int b=55;
    public static void main(String[] arg) {
        InstanceMembers ins=new InstanceMembers();
       // System.out.println(ins.a);
       // System.out.println(b);
    }
    // System.out.println("b");//illegal start of type
}