//subclass/childclass
public class DVDFilm extends DVD{
    private String[] pemeran;
    private String sutradara;
    
    public DVDFilm(String judul, String pemeran, String sutradara, String publisher, String kategori, int stok){
        //menginisialisasi atribut superclass
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran.split(", ");
        this.sutradara = sutradara;
    }
    
    public String[] getPemeran(){
        return pemeran;
    }
    public String getSutradara(){
        return sutradara;
    }
    public String getKategoriFilm(){
        return switch (getKategori()) {
            case "SU" -> "Semua Umur";
            case "D" -> "Dewasa";
            case "R" -> "Remaja";
            case "A" -> "Anak-anak";
            default -> "Tidak Diketahui";
        };
    }
    
    @Override //dari method abstrak superclass
    public void infoDVD(){
        System.out.println(
                "| Judul\t\t: " + getJudul()
                + "\n| Pemeran\t: " + String.join(", ", getPemeran())
                + "\n| Sutradara\t: " + getSutradara()
                + "\n| Publisher\t: " + getPublisher()
                + "\n| Kategori\t: " + getKategoriFilm()
                + "\n| Stok\t\t: " + getStok()
        );
    }
}
