public class Triangle{
    public static void main(String[] arg){
        int n=4;
        
        for(int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}