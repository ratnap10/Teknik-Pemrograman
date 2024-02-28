//superclass/parentclass
public abstract class DVD {
    //enkapsulasi atribut yang hanya bisa diakses oleh kelas yang mendefinisikan dan subclassnya
    protected String judul;
    protected String publisher;
    protected String kategori;
    protected int stok;
    
    //konstruktor
    public DVD(String judul, String publisher, String kategori, int stok){
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }
    
    //accessor (setter-getter)
    public String getJudul(){
        return judul;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getKategori(){
        return kategori;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
    
    //method abstrak untuk digunakan di subclass
    public abstract void infoDVD();
}