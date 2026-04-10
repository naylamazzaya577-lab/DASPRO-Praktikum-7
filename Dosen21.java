public class Dosen21 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen21(String kd, String nm, boolean jk, int age) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println(kode + " | " + nama + " | " + jk + " | " + usia);
    }
}