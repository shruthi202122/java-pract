public class MyThread1 extends Thread{
   
    public static void main(String[] ar){
        
        MyThread1 t=new MyThread1();
        t.start();
        
        
        t.run();
        for(int i=6;i<=10;i++){
            Thread tt=Thread.currentThread();
            String name=tt.getName();
            System.out.println(name+" "+i);
        }
    }
    public void run(){
        for(int i=1;i<=5;i++){
            Thread tt=Thread.currentThread();
            String name=tt.getName();
            System.out.println(name+" "+i);
        }
    }
    public void start(){
        
    }
}