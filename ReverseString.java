public class ReverseString{
    public static void main(String[] arg){
        String original="12121";
        String reverse="";
        int l=original.length();
        for(int i=l-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equalsIgnoreCase(reverse))
        System.out.println("polindrome : "+reverse);
        else{
            System.out.println("not polindrome : "+original);
        }
    }
}