public class Sorting21 {
    int data[];
    int jmlData;

    Sorting21(int data[], int jmlData) {
        this.data = data;
        this.jmlData = jmlData;
    }
    //BUBLE SORT
    void bubbleSort() {
        for(int i=0; i<jmlData-1; i++){
            for(int j=0; j<jmlData-i-1; j++){
                if(data[j] > data[j+1]){
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
            }
        }
    }
    void tampil() {
        for(int i=0; i<jmlData; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    //SELECTION SORT
    void selectionSort() {
    for(int i = 0; i < jmlData - 1; i++) {
        int min = i;
        for(int j = i + 1; j < jmlData; j++) {
            if(data[j] < data[min]) {
                min = j;
            }
        }
        int tmp = data[min];
        data[min] = data[i];
        data[i] = tmp;
    }
    }
    //INSERTION SORT
    void insertionSort() {
    for(int i = 1; i < jmlData; i++) {
        int key = data[i];
        int j = i - 1;

        while(j >= 0 && data[j] > key) {
            data[j + 1] = data[j];
            j--;
        }
        data[j + 1] = key;
    }
}
}