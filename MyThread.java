public class MyThread extends Thread{
    public static void main(String[] arg){
        MyThread t=new MyThread();
        t.start();
        System.out.println("t1");
        t.start();//Exception 
        System.out.println("t2");
    }
    public void run(){

    }
}