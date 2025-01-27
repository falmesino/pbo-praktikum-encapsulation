public class TestMultiTabungan {
  public static void main(String[] args) {
      // Membuat akun MultiTabungan dengan saldo awal 1,000,000 IDR
      MultiTabungan tabungan = new MultiTabungan(1000000);

      // Menampilkan saldo awal
      System.out.println("Saldo awal: IDR " + tabungan.getSaldo());

      // Menyimpan 50 AUD
      System.out.println("\nMenyimpan 50 AUD...");
      tabungan.simpanUang(50, "AUD");
      System.out.println("Saldo setelah deposit AUD: IDR " + tabungan.getSaldo());

      // Menarik 20 USD
      System.out.println("\nMenarik 20 USD...");
      boolean penarikanUSD = tabungan.ambilUang(20, "USD");
      System.out.println("Penarikan USD berhasil? " + penarikanUSD);
      System.out.println("Saldo setelah penarikan USD: IDR " + tabungan.getSaldo());

      // Menyimpan 200,000 IDR
      System.out.println("\nMenyimpan 200,000 IDR...");
      tabungan.simpanUang(200000, "IDR");
      System.out.println("Saldo setelah deposit IDR: IDR " + tabungan.getSaldo());

      // Mencoba menarik 2,000,000 IDR (saldo tidak mencukupi)
      System.out.println("\nMenarik 2,000,000 IDR...");
      boolean penarikanIDR = tabungan.ambilUang(2000000, "IDR");
      System.out.println("Penarikan IDR berhasil? " + penarikanIDR);
      System.out.println("Saldo setelah penarikan IDR: IDR " + tabungan.getSaldo());

      // Mencoba menyimpan dalam mata uang yang tidak didukung (EUR)
      System.out.println("\nMenyimpan 100 EUR...");
      tabungan.simpanUang(100, "EUR");
      System.out.println("Saldo setelah deposit EUR: IDR " + tabungan.getSaldo());

      // Mencoba menarik dalam mata uang yang tidak didukung (JPY)
      System.out.println("\nMenarik 5000 JPY...");
      boolean penarikanJPY = tabungan.ambilUang(5000, "JPY");
      System.out.println("Penarikan JPY berhasil? " + penarikanJPY);
      System.out.println("Saldo setelah penarikan JPY: IDR " + tabungan.getSaldo());
  }
}