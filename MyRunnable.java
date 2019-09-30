public class MyRunnable{
    public static void main(String[] ar)throws InterruptedException{
        Runnable r=new Runnable(){
             public void run(){
                for(int i=1;i<=5;i++){
                    Thread tt=Thread.currentThread();

                    String name=tt.getName();
                    System.out.println(name+"  MyRunnable run()");
                    try{
                        tt.sleep(2000);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }

        };
            Thread t=new Thread(r);
            t.start();

            for(int i=6;i<=10;i++){
                Thread tt=Thread.currentThread();
                    
                String name=tt.getName();
                System.out.println(name+"  main");
                tt.sleep(500);
            }
        
            
    }
}