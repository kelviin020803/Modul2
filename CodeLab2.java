import java.util.Scanner;
class mahasiswa_umm {
    String nama;
    String nim;
    String jurusan;

    public mahasiswa_umm(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
}

public class CodeLab2 {
    private static mahasiswa_umm[] daftarmahasiswa_umm = new mahasiswa_umm[100];
    private static int jumlahmahasiswa_umm = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data mahasiswa_umm");
            System.out.println("2. Tampilkan Data mahasiswa_umm");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahDatamahasiswa_umm();
                    break;
                case 2:
                    tampilkanDatamahasiswa_umm();
                    break;
                case 3:
                    System.out.println("kelvin-382");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 3);
    }

    private static void tambahDatamahasiswa_umm() {
        System.out.print("Masukkan nama mahasiswa_umm: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa_umm: ");
        String nim = scanner.nextLine();
        while (nim.length() != 15) {
            System.out.println("NIM Harus 15 Digit!");
            System.out.print("Masukkan NIM mahasiswa_umm: ");
            nim = scanner.nextLine();
        }
        System.out.print("Masukkan jurusan mahasiswa_umm: ");
        String jurusan = scanner.nextLine();

        mahasiswa_umm newmahasiswa_umm = new mahasiswa_umm(nama, nim, jurusan);
        daftarmahasiswa_umm[jumlahmahasiswa_umm] = newmahasiswa_umm;
        jumlahmahasiswa_umm++;
        System.out.println("Data mahasiswa_umm berhasil ditambahkan.");
    }

    private static void tampilkanDatamahasiswa_umm() {
        System.out.println("Data mahasiswa_umm:");
        for (int i = 0; i < jumlahmahasiswa_umm; i++) {
            mahasiswa_umm mahasiswa_umm = daftarmahasiswa_umm[i];
            System.out.println("Nama: " + mahasiswa_umm.getNama() +
                    ", NIM: " + mahasiswa_umm.getNim() +
                    ", Jurusan: " + mahasiswa_umm.getJurusan());
        }
    }
}
//kelvin - 382