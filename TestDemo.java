public class TestDemo{
  static float[] f=new float[2];
  public static void main(String[] arg){
    for(int i=0;i<2;i++){
        for(int j=2;j>=0;j--){
            if(i==j){
                System.out.println(i+" "+j);
            }
        }
    }
  }
}