package datamember;

public class Data {
    String Id;
    String Nama;
    String Jenis;
    
    Data(String id, String nama, String jenis) {
        this.Id = id;
        this.Nama = nama;
        this.Jenis = jenis;
    }
    
    protected void printData() {
        System.out.println("ID Member : " + this.Id);
        System.out.println("Nama Member : " + this.Nama);
        System.out.println("Jenis Member : " + this.Jenis);
        System.out.println("");
    }
}