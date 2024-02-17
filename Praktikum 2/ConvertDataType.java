class ConvertDataType {
    static short methodOne(long l){
        int i = (int) l;
        return (short) i;
    }
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

/*
Output dari b adalah 10. Dari variabel d yang bertipe double, dikonversi ke float, lalu pada methodOne dikonversi lagi ke int
yang nantinya mengembalikan nilai bertipe short dan terakhir di ubah ke variabel b bertipe byte.
*/
