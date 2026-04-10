import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataDosen21 list = new DataDosen21();

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda)");
            System.out.println("4. Sorting DSC (Usia tertua)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();

                    System.out.print("Nama: ");
                    String nm = sc.nextLine();

                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();

                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    list.tambah(new Dosen21(kd, nm, jk, usia));
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    break;

                case 4:
                    list.sortingDSC(); // atau insertionSort()
                    System.out.println("Data berhasil diurutkan DSC!");
                    break;
            }

        } while(pilih != 5);
    }
}

