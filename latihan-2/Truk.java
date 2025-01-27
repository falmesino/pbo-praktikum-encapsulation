// 231232028 - Falmesino Abdul Hamid

public class Truk {
  private double muatan;
  private double muatanMaks;

  public Truk(double beratMaks) {
    this.muatanMaks = beratMaks;
  }

  public double getMuatan() {
    return this.muatan;
  }

  public double getMuatanMaks() {
    return this.muatanMaks;
  }

  public void tambahMuatan(double berat) {
    System.out.println("Tambah muatan: " + berat);

    if ((this.muatan + berat) > this.muatanMaks) {
      System.out.println("Gagal");
    } else {
      this.muatan += berat;
      System.out.println("Ok");
    }
  }

  // 9,8 newtons = 1 kilogram

  public void newtsToKilo(double berat) {
    // ...
  }

  public void kiloToNewts(double berat) {
    // ...
  }
}