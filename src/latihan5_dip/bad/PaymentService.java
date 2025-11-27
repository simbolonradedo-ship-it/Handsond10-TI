package latihan5_dip.bad;

// FAT INTERFACE (melanggar ISP)
public interface PaymentService {

    // Untuk semua jenis pembayaran
    void pay(double amount);

    // Untuk kartu kredit (tidak semua payment butuh)
    void validateCard(String cardNumber);

    // Untuk e-wallet (tidak semua payment butuh)
    void topUp(double amount);
}
