import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "Java";
        int count = 0;
        for (char c : s.toCharArray()){
            count++;
        }

        System.out.println("The new string is "+ count);

    }
}
