import java.util.Scanner;
/**
 * Pemilihan2percobaan1_16
 */
public class Pemilihan2percobaan1_16 {
public static void main(String[] args) {
    Scanner sc16 = new Scanner(System.in);
    System.out.print("Masukan tahun: ");
    int tahun = sc16.nextInt();
    if((tahun % 4) == 0){
        if ((tahun % 100) != 0)
            System.out.println("Tahun kabisat");
    } 
    else
    System.out.println("Bukan tahun kabisat");
sc16.close();
}
}