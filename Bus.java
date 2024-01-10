package ClassPBO.Enkapsulasi.Latihan2;

public class Bus {
    private int penumpang, maxPenumpang;

    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void plusPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>=maxPenumpang) {
            System.out.println("Overload penumpang");
        }
        else{
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("Penumpang seharusnya adalah = "+maxPenumpang);
    }
}
