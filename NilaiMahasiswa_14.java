import java.util.Scanner;

public class NilaiMahasiswa_14 {
    private static int[][] nilai;

    public static void inputNilai(int jumlahMahasiswa, int jumlahTugas) {
        nilai = new int[jumlahMahasiswa][jumlahTugas];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai Tugas Minggu " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanNilai() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai Tugas Minggu " + (j + 1) + ": " + nilai[i][j]);
            }
        }
    }

    public static int cariMingguNilaiTertinggi() {
        int maxNilai = Integer.MIN_VALUE;
        int mingguTertinggi = -1;

        for (int j = 0; j < nilai[0].length; j++) {
            int totalNilaiMinggu = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalNilaiMinggu += nilai[i][j];
            }
            if (totalNilaiMinggu > maxNilai) {
                maxNilai = totalNilaiMinggu;
                mingguTertinggi = j + 1;
            }
        }

        return mingguTertinggi;
    }
    public static void tampilkanMahasiswaNilaiTertinggi() {
        int maxNilai = Integer.MIN_VALUE;
        int minggu = -1;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > maxNilai) {
                    maxNilai = nilai[i][j];
                    minggu = j + 1;
                    mahasiswaTertinggi = i + 1;
                }
            }
        }

        System.out.println("Mahasiswa " + mahasiswaTertinggi + " memiliki nilai tertinggi " + maxNilai + " pada minggu ke-" + minggu);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();
        inputNilai(jumlahMahasiswa, jumlahTugas);
        tampilkanNilai();
        int mingguTertinggi = cariMingguNilaiTertinggi();
        System.out.println("Minggu dengan nilai tertinggi: Minggu ke-" + mingguTertinggi);
        tampilkanMahasiswaNilaiTertinggi();
    }
}
