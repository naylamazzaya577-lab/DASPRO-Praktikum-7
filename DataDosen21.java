public class DataDosen21 {

    Dosen21[] dataDosen = new Dosen21[10];
    int idx;

    void tambah(Dosen21 dsn) {
        if(idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for(int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
        System.out.println();
    }

    // 🔵 Bubble Sort ASC (termuda → tertua)
    void sortingASC() {
        for(int i = 0; i < idx-1; i++) {
            for(int j = 0; j < idx-i-1; j++) {
                if(dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen21 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for(int i = 0; i < idx-1; i++) {
            int idxMax = i;
            for(int j = i+1; j < idx; j++) {
                if(dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen21 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    //Insertion Sort DSC
    void insertionSort() {
        for(int i = 1; i < idx; i++) {
            Dosen21 temp = dataDosen[i];
            int j = i;

            while(j > 0 && dataDosen[j-1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }

            dataDosen[j] = temp;
        }
    }
}