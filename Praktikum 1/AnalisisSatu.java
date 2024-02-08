public class AnalisisSatu {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);
        
        System.out.println("Hasil 1 " +hasil);
    }
}

//outputnya Hasil 1 -125 karena byte hanya bisa menampung nilai -128 sampai 127, sedangkan 125+6 = 131, maka 131-256 adalah -125.
//referensi: https://stackoverflow.com/questions/2458495/how-are-integers-cast-to-bytes-in-java
