public class DVDMusik extends DVD{
    private String penyanyi;
    private String produser;
    private String[] tophits;
    
    public DVDMusik(String judul, String penyanyi, String produser, String publisher, String tophits, String kategori, int stok){
        //menginisialisasi atribut superclass
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.tophits = tophits.split(", ");
    }
    
    public String getPenyanyi(){
        return penyanyi;
    }
    public String getProduser(){
        return produser;
    }
    public String[] getTopHits(){
        return tophits;
    }
    public String getKategoriMusik(){
        return switch (getKategori()){
            case "C" -> "Classic";
            case "J" -> "Jazz";
            case "P" -> "Pop";
            case "R" -> "Rock";
            case "O" -> "Other";
            default -> "Tidak Diketahui";
        };
    }
    
    @Override
    public void infoDVD(){
        System.out.println(
                "| Judul\t\t: " + getJudul()
                + "\n| Penyanyi\t: " + getPenyanyi()
                + "\n| Produser\t: " + getProduser()
                + "\n| Publisher\t: " + getPublisher()
                + "\n| Kategori\t: " + getKategoriMusik()
                + "\n| Top hits\t: " + String.join(", ", getTopHits())
                + "\n| Stok\t\t: " + getStok()
        );
    }
}