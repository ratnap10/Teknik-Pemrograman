import java.util.Scanner;

public class Strings_W2 {
    public static void main(String[] args) {
        Scanner ketik = new Scanner(System.in);
        String A = ketik.nextLine();
        String B = ketik.nextLine();
        
        int jumhrf = A.length() + B.length();
        String banding = A.compareTo(B) > 0 ? "Yes":"No";
        String kptlA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String kptlB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println("\n" + jumhrf);
        System.out.println(banding);
        System.out.println(kptlA + " " + kptlB);
    }
}