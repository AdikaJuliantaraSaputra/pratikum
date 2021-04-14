import java.util.ArrayList;
import java.util.Scanner;

class vcdMaster {
    String judul,aktor,sutradara,publisher,kategori; //atribut
    int stok; 

    // untuk metode nya
    public void inputVCD(String judul, String aktor, String sutradara, String publisher, String kategori, int stok ){
        this.judul = judul;
        this.aktor = aktor;
        this.sutradara = sutradara;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok; 
    }
    // untuk menampilkan this digunakan untuk memanggil method yang ada di dalam class
    public void tampilkan(){
        System.out.println("Judul : "+this.judul);
        System.out.println("Aktor : "+this.aktor);
        System.out.println("Sutradara : "+this.sutradara);
        System.out.println("Publisher : "+this.publisher);
        System.out.println("Kategori : "+this.kategori);
        System.out.println("Stok : "+this.stok);
    }
}
// untuk inhe nya berada di keword extends 
class vcd extends vcdMaster{
    
}
public class soal1{
    public static void main(String[] args) {
        String cari,ulang;
        Scanner inp = new Scanner(System.in); // scanner untuk mencari judul nya
        
        ArrayList<vcdMaster> data = new ArrayList<>(); //untuk menampilkan data yang sudah kita tentukan
        
        vcd vcd1 = new vcd();
        vcd1.inputVCD("Hospital Playlist","Kim Jung dae","BObby","Korea","Remaja",2);
        vcd vcd2 = new vcd();
        vcd2.inputVCD("Cinta Suci","Mas Bram","Dadang","SCTV","semua umur",5);
        vcd vcd3 = new vcd();
        vcd3.inputVCD("Doraemon","Mobita","Yosuke","Jepang","anak-anak",1);
        vcd vcd4 = new vcd();
        vcd4.inputVCD("Doctors","Visenzo","Yedam","KBS","dewasa",6);
        vcd vcd5 = new vcd();
        vcd5.inputVCD("Kuntilanak","Siska","Adjie","MBC","dewasa",8);
        
        // digunakan untuk menambahkan data jika tidak di add data tidak akan myncyl 
        data.add(vcd1);
        data.add(vcd2);
        data.add(vcd3);
        data.add(vcd4);
        data.add(vcd5);
        
        // while true digunaka untuk kondisi yes dan no saat ditanya apakah ingin mencari lagi 
        while(true){
            for(int i=0; i<data.size(); i++){
                System.out.println(i + 1+", "+ data.get(i).judul); // codingan untuk mengambil judul 
            }
            System.out.println("===============RENTAL VCD DALMOON ===============");
            System.out.println("Pilih VCD :");
            cari = inp.nextLine();
            data.get(Integer.parseInt(cari)-1).tampilkan(); //ketika sudah mengambil disini di tampilkan hasilnya 
            
            System.out.println("===============RENTAL VCD DALMOON ===============");
            System.out.println("Apakah anda ingin mencari lagi?(y/n)");
            ulang = inp.nextLine();
            if(ulang.equals("n")){
                break;
            }
            System.out.println("================================");
        }
    }
    
}
