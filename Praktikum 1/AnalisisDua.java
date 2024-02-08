public class AnalisisDua {
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        System.out.println(s);
    }
}

//outputnya everything
//menggunakan operator kondisional ternary
//karena i tidak lebih kecil dari 40 dan tidak lebih besar dari 50, maka hasilnya adalah else dan mengisi variabel s dengan everything
