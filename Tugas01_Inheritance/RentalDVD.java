
import java.util.Scanner;

public class RentalDVD {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        DVD[] dvd = new DVD[100];
        int htg = 0;
        
        while(true){
            System.out.println("[ RENTAL DVD ]");
            System.out.println("| 1. Tambah DVD Film");
            System.out.println("| 2. Tambah DVD Musik");
            System.out.println("| 3. Lihat daftar DVD");
            System.out.println("| 4. Keluar");
            System.out.println("======================");
            System.out.print("Pilih: ");
            int plh = input.nextInt();
            input.nextLine();
            
            switch(plh){
                case 1:
                    System.out.println("\n[ DVD Film ]");
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Pemeran: ");
                    String pemeran = input.nextLine();
                    System.out.print("Sutradara: ");
                    String sutradara = input.nextLine();
                    System.out.print("Publisher: ");
                    String publisher = input.nextLine();
                    System.out.print("Kategori (SU/D/R/A): ");
                    String kategori = input.nextLine().toUpperCase();
                    System.out.print("Stok: ");
                    int stok = input.nextInt();
                    input.nextLine(); // consume newline character
                    dvd[htg] = new DVDFilm(judul, pemeran, sutradara, publisher, kategori, stok);
                    htg++;
                    System.out.println("----------------------");
                    System.out.println("Berhasil menambahkan DVD Film!");
                    System.out.println("======================");
                    break;
                case 2:
                    System.out.println("\n[ DVD Musik ]");
                    System.out.print("Judul: ");
                    judul = input.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = input.nextLine();
                    System.out.print("Produser: ");
                    String produser = input.nextLine();
                    System.out.print("Publisher: ");
                    publisher = input.nextLine();
                    System.out.print("Top hits: ");
                    String tophits = input.nextLine();
                    System.out.print("Kategori (C/J/P/R/O): ");
                    kategori = input.nextLine().toUpperCase();
                    System.out.print("Stok: ");
                    stok = input.nextInt();
                    input.nextLine(); // consume newline character
                    dvd[htg] = new DVDMusik(judul, penyanyi, produser, publisher, tophits, kategori, stok);
                    htg++;
                    System.out.println("----------------------");
                    System.out.println("Berhasil menambahkan DVD Musik!");
                    System.out.println("======================");
                    break;
                case 3:
                    System.out.println("\n[ Daftar DVD ]");
                    System.out.println("| 1. DVD Film");
                    System.out.println("| 2. DVD Musik");
                    System.out.println("======================");
                    System.out.print("Pilih: ");
                    int pilih;
                    pilih = input.nextInt();
                    switch(pilih){
                        case 1:
                            System.out.println("\n[ DVD Film ]");
                            for(int i=0; i<htg; i++){
                                //memeriksa apakah objek merupakan instance dari kelas DVDFilm
                                if(dvd[i] instanceof DVDFilm){
                                    dvd[i].infoDVD();
                                    System.out.println("\n---------------------");
                                }
                            }
                            break;
                        case 2:
                            System.out.println("\n[ DVD Musik ]");
                            for(int i=0; i<htg; i++){
                                //memeriksa apakah objek merupakan instance dari kelas DVDMusik
                                if(dvd[i] instanceof DVDMusik){
                                    dvd[i].infoDVD();
                                    System.out.println("\n---------------------");
                                }
                            }
                            break;
                        default: System.out.println("Input tidak valid!"); break;
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih sudah berkunjung!");
                    System.out.println("Sampai jumpa lagi....");
                    System.exit(0);
                    break;
                default: System.out.println("Input tidak valid!\n");break;
            }
        }
    }
}
