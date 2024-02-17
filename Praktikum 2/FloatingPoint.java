class FloatingPoint{
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int)Math.round(x); //bulatkan
        
        System.out.println(nx);
    }
}

/*
nx dibulatkan menjadi 93 dan casting dibutuhkan karena tipe data double tidak relevan setelah nx dikonversi Math.round().
*/
