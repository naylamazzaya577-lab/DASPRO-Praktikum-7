public class SortingMain21 {

    public static void main(String[] args) {

        // BUBBLE SORT
        int a[] = {20, 10, 2, 7, 12};
        Sorting21 dataurut1 = new Sorting21(a, a.length);

        System.out.println("Data Awal 1: ");
        dataurut1.tampil();

        dataurut1.bubbleSort();

        System.out.println("Data setelah diurutkan dengan bubble sort (ASC):");
        dataurut1.tampil();

        System.out.println();

        // SELECTION SORT
        int b[] = {30, 20, 2, 8, 14};
        Sorting21 dataurut2 = new Sorting21(b, b.length);

        System.out.println("Data Awal 2 :");
        dataurut2.tampil();

        dataurut2.selectionSort();

        System.out.println("Data setelah diurutkan dengan selection sort (ASC):");
        dataurut2.tampil();

        System.out.println();

        // INSERTION SORT
        int c[] = {40, 10, 4, 9, 3};
        Sorting21 dataurut3 = new Sorting21(c, c.length);

        System.out.println("Data Awal 3 :");
        dataurut3.tampil();

        dataurut3.insertionSort();

        System.out.println("Data setelah diurutkan dengan insertion sort (ASC) :");
        dataurut3.tampil();
    }
}