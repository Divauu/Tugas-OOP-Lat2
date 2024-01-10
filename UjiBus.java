package ClassPBO.Enkapsulasi.Latihan2;

public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus(10);
        busMini.cetak();

        busMini.plusPenumpang(3);
        busMini.cetak();

        busMini.plusPenumpang(1);
        busMini.cetak();

        busMini.plusPenumpang(1);
        busMini.cetak();
    }
}
