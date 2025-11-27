package latihan5_dip.bad;

public class FraudDetector {
    public boolean detect(double amount) {
        System.out.println("Checking fraud for amount: " + amount);
        return amount > 10000; // contoh: transaksi di atas 10k dianggap mencurigakan
    }
}
