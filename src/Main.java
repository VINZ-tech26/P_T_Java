public class Main{
    public static void main(String[] args){
        String s ="My name is vinay ";
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                count ++;
        }
        IO.print(count);
    }
}
