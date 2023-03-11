import java.util.Scanner;

public class mobil {
    public static void main(String[] args) {

        // membuat array jenis mobil
        String[] mobil = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < mobil.length; i++ ){
            System.out.print("mobil ke-" + i + ": ");
            mobil[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : mobil ){
            System.out.println(b);
        }

    }
}