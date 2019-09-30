public class IntegerPolindrome{
    public static void main(String[] arg){
        int gn=155556661;
        int no=gn;
        int result=0;
        while(no>0){
            int digit = no%10;
            result = result*10+digit;
            no=no/10;
        }
        if(result==gn){
            System.out.print("given no is polindrome");
        }
        else{
             System.out.print("not polindome");
        }
    }
}