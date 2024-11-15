import java.util.Scanner;
public class Ucapan_14 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank You "+nama+"\nErpan the force be with you.");
    }
}