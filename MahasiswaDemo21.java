
    import java.util.Scanner;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // buang enter

        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21(jumlah);

        // input data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData mahasiswa ke-" + (i+1));

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);

                // tampil data
        System.out.println("\nData mahasiswa:");
        list.tampil();

        // 🔍 pencarian
        System.out.print("\nMasukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        int posisi = list.sequentialSearch(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
        // 🔹 SEQUENTIAL
        System.out.println("Pencarian data:");
        double cari = 3.2;

        int posisi = list.sequentialSearch(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        // 🔹 BINARY
        System.out.println("\nPencarian data menggunakan Binary Search");

        list.bubbleSort();

        System.out.println("Data mahasiswa setelah sorting:");
        list.tampil();

        int posisi2 = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
        }