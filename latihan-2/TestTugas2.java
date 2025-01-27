// 231232028 - Falmesino Abdul Hamid

public class TestTugas2 {
  public static void main(String args[]) {
    Truk truk = new Truk(900);
    System.out.println("Muatan Maksimal: " + truk.getMuatanMaks());

    truk.tambahMuatan(500.0);
    truk.tambahMuatan(300.0);
    truk.tambahMuatan(150.0);
    truk.tambahMuatan(50.0);

    System.out.println("Muatan sekarang: " + truk.getMuatan());
  }
}