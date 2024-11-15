import java.util.Scanner;
public class Percobaan6_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.println("Masukan panjang");
        p=sc.nextInt();
        System.out.println("Masukan Lebar");
        l=sc.nextInt();
        System.out.println("Masukan Tinggi");
        t=sc.nextInt();
        

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " +L);

        vol=hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah "+vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume= hitungLuas(a, b)*tinggi;
        return volume;
    }

}
