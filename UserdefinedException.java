public class UserdefinedException{
    public static void main(String[] ar){
        int age=Integer.parseInt(ar[0]);
        
        try{
            if(age<20){
                throw new SmallAgeException("your age is less than 20");
            }
            else if(age>30){
                throw new BigAgeException();
            }
           /* else{
                System.out.println("Eligible!!!..");
            }*/
        }catch(SmallAgeException sae){
            sae.printStackTrace();
        }
        catch(BigAgeException bae){
            bae.printStackTrace();
        }
        System.out.println("thank you");
       
     }
}