// 231232028 - Falmesino Abdul Hamid

public class Kalender {
  private int tanggal;
  private int bulan;
  private int tahun;

  public Kalender() {
    tanggal = 1;
    bulan = 1;
    tahun = 2000;
  }

  public Kalender(int tanggal) {
    bulan = 1;
    tahun = 2000;
    this.tanggal = tanggal;
  }

  public Kalender(int bulan, int tahun) {
    tanggal = 1;
    this.bulan = bulan;
    this.tahun = tahun;
  }

  public Kalender(int tanggal, int bulan, int tahun) {
    this.tanggal = tanggal;
    this.bulan = bulan;
    this.tahun = tahun;
  }

  public int getTanggal() {
    return this.tanggal;
  }

  public int getBulan() {
    return this.bulan;
  }

  public int getTahun() {
    return this.tahun;
  }

  public void setTanggal(int tanggal) {
    this.tanggal = tanggal;
  }

  public void setBulan(int bulan) {
    this.bulan = bulan;
  }

  public void setTahun(int tahun) {
    this.tahun = tahun;
  }
}