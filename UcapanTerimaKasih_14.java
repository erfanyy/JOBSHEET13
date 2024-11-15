import java.util.Scanner;
public class UcapanTerimaKasih_14 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the universe.\n"+"You inpired in me a love for learning and made me feel like i could ask you anything.");
    }
    public static void UcapanTambahan(String ucapanTambahan){
        System.out.println(ucapanTambahan);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UcapanTerimaKasih();
        System.out.println("Apakah anda ingin menambahkan ucapan tambahan?");
        String ucapanTambahan = sc.nextLine();
        UcapanTambahan(ucapanTambahan);

        sc.close();

    }
}
