/**
 * 231232028 - Falmesino Abdul Hamid
 * https://spada.swadharma.ac.id/mod/assign/view.php?id=21711
 */

public class Tabungan {
  private int saldo;

  public Tabungan(int saldo) {
    this.saldo = saldo;
  }

  public int getSaldo() {
    return this.saldo;
  }

  public void simpanUang(int jumlah) {
    this.saldo += jumlah;
  }

  public boolean ambilUang(int jumlah) {
    if (jumlah <= this.saldo) {
      this.saldo -= jumlah;
      return true;
    }

    return false;
  }
}