public class RunnableDemo{
    public static void main(String[] ar){
        Runnable r=new Runnable(){
            public void run(){
                System.out.println("inside run()");
            }
        };
        Thread t=new Thread(r);
        t.start();
        
    }
    
}