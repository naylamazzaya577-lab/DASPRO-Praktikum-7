public class MahasiswaBerprestasi21 {
   Mahasiswa21[] listMhs;
    int idx;
    MahasiswaBerprestasi21(int jumlah) {
    listMhs = new Mahasiswa21[jumlah];
}
    void tambah(Mahasiswa21 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println();
        }
    }
    
    //SEQUENTIAL SEARCH
    int sequentialSearch(double cari) {
        for (int i = 0; i < idx; i++) {
            if (listMhs[i].ipk == cari) {
                return i;
            }
        }
        return -1;
    }
    void tampilPosisi(double x, int pos) {
    if (pos != -1) {
        System.out.println("Data dengan IPK " + x + " ditemukan pada indeks ke-" + pos);
    } else {
        System.out.println("Data dengan IPK " + x + " tidak ditemukan");
    }
    }
   void tampilDataSearch(double x, int pos) {
    if (pos != -1) {
        System.out.println("Data mahasiswa dengan IPK " + x + " adalah:");
        listMhs[pos].tampil();
    } else {
        System.out.println("Data tidak ditemukan");
    }
    }
    void bubbleSort() {
    for(int i = 0; i < idx - 1; i++) {
        for(int j = 0; j < idx - i - 1; j++) {
            if(listMhs[j].ipk > listMhs[j+1].ipk) {
                Mahasiswa21 tmp = listMhs[j];
                listMhs[j] = listMhs[j+1];
                listMhs[j+1] = tmp;
            }
        }
    }
}
   int findBinarySearch(double cari, int left, int right) {
    int mid;

    if (right >= left) {
        mid = (left + right) / 2;

        if (cari == listMhs[mid].ipk) {
            return mid;
        } 
        // DIBALIK KARENA DESCENDING
        else if (listMhs[mid].ipk < cari) {
            return findBinarySearch(cari, left, mid - 1);
        } else {
            return findBinarySearch(cari, mid + 1, right);
        }
    }

    return -1;
}
}