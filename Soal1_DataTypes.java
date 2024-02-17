import java.math.BigInteger;
import java.util.Scanner;

public class Soal1_DataTypes {
    public static void main(String[] args) {
        System.out.print("Berapa data yang ingin anda inputkan: ");

        // menerima input keyboard yang ditampung ke array T
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger[] T = new BigInteger[n];

        System.out.println("\nData: ");
        for(int x=0; x<n; x++){
            String userInput = input.next();
            T[x] = new BigInteger(userInput);
        }
        System.out.print("\n");
        
        for (int i = 0; i < n; i++) {
            if(T[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0){
                System.out.println(T[i] + " can be fitted in: ");
                if (T[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && T[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                    System.out.println("* byte");
                }
                if (T[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && T[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                    System.out.println("* short");
                }
                if (T[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && T[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                    System.out.println("* int");
                }
                if (T[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && T[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                    System.out.println("* long");
                }
            }else{
                System.out.println(T[i] + " can't be fitted anywhere.");
            }
        }
    }
}
