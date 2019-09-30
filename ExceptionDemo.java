public class ExceptionDemo{
    public static void main(String[] ar){
        System.out.println("a");
        String s1=ar[0];
        String s2=ar[1];
        int s3=Integer.parseInt(s1);
        int s4=Integer.parseInt(s2);
        try{
            System.out.println(10/0);
            System.out.println(s1);
            System.out.println(s2);
            }
        
        /*catch(ArithmeticException ae){
            ae.printStackTrace();
        }*/
        catch(ArrayIndexOutOfBoundsException ce){
            
        } 
        finally{
        System.out.println(11/0);
        
            System.out.println("b");
            System.out.println("c");
        
        }
       
    }
}