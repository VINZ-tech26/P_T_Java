public class chars {

    public static void main(){

        String s = "My name is vinay ";
        int count = 0;
        char c = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (c !=s.charAt(i)) {
                continue;
            }
                count++;
            }
            IO.print(count);
        }
    }
