import java.util.Arrays;

public class SumInteger {
    public static void main(String[] args) {
        int a =1523;
        String val = String.valueOf(a); // converting int value string
        char ch[] = new char[val.length()];

            for(int i=0;i<ch.length;i++){  // converting string value to array
                ch[i] = val.charAt(i); 
            }

            Arrays.sort(ch);  // sorting array 

            String sv = String.valueOf(ch); // converting array to string 
           int result = Integer.valueOf(sv); // converting string to int
        System.out.println(result);
    }
}
