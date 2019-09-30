public class ExceptionDemo1 {
    public static void main(String[] arg){
        System.out.println("main firstline");
        try{
             show();
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }
       
        System.out.println("main lastline");
    
    }
    public static void show()throws ArithmeticException{
        System.out.println("show firstline");
        System.out.println(10/0);
        System.out.println("show lastline");
    }
}