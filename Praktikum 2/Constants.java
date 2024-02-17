public class Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54; //var lokal
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/*
Outputnya Paper size in centimeters: 21.59 by 27.94
Perbedaannya ada di aksesibilitas, final double hanya bisa digunakan dalam main. Sedangkan public static final double bisa diakses
di manapun dalam kelas tersebut.
*/
