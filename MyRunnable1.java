public class MyRunnable1{
    public static void main(String[] arg){
        Runnable r=()->System.out.println("run()");
        r.run();
    }
}