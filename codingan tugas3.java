import java.util.*;
//class koleksi gitar ArielNoah = super class
class koleksigitarArielNoah{

    //membuat suatu class
    private String gitar;
    private int harga;

    //method gitar menggunakan Overloading
    public koleksigitarArielNoah(){
    }
    //method yang diawali dengan nama class yaitu Constructor
    public koleksigitarArielNoah(String gitar,int harga){
        this.gitar=gitar;
        this.harga=harga;
    }
    //Menambahkan setter
    public void isiMainan(String gitar,int harga){
        this.gitar=gitar;
        this.harga=harga;
    }
    public void isigitar(String gitar, int harga){
        this.gitar=gitar;
        this.harga=harga;
    }
    //Menambahkan getter
    public String getGitar(){
        return this.gitar;
    }
    public int getHarga(){
        return this.harga;
    }
    //Method
    public void lihatGitar(){
        System.out.println("Gitar   ="+gitar);
        System.out.println("Harga   ="+harga);
        System.out.println("");
      }
    }
    //Inheritance
    public class Tugas3 extends koleksigitarArielNoah{
        public String namaGitar;
        public Tugas3(){
            super();
    }
    public Tugas3(String gitar,int harga){
        super(gitar,harga);
    }
    public void lihatGitar(){
        super.lihatGitar();
        System.out.println("nama Gitar="+this.namaGitar);
    }

class tugas33{
    public static void main(String args[]){
    //Membuat biodata mahasiswa
    String nama ="Nama : Muhammad Fajar Setiyanto";
    System.out.println(nama);
    String kelas ="Kelas : TI.21.A.3";
    System.out.println(kelas);
    String nim ="Nim : 312110194\n";
    System.out.println(nim);
    

    //Membuat input
    try(Scanner input = new Scanner(System.in)){
        System.out.print("Nama gitar:");
        String gitar = input.nextLine();
    
    //Objek
    Tugas3 p2= new Tugas3("Yamaha APX1000 ","11.350.000rb");
    Tugas3 p3= new Tugas3("Yamaha f400 semi akustik","1.600.000rb");

    //Memanggil method
    p2.lihatGitar();
    p3.lihatGitar();
    koleksigitarArielNoah p4,p5;

    p4= new koleksigitarArielNoah();
    p5= new koleksigitarArielNoah();
    p4.isigitar("Yamaha APX1000","11.350.000rb");
    p5.isigitar("Yamaha f400 semi akustik","1.600.000rb");
    p4.lihatGitar();
    p5.lihatGitar();
    }catch (Exception z){
        System.out.print(z);
        }
    }
}
}
