public class arraycount {
    public static void main() {
        String s = "programming";
        int[] counts = new int[255];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counts[ch] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (counts[i] > 0) {
                char ch = (char)i;
                IO.print(ch + ":" + counts[i] + "\n");
            }
        }
    }
}