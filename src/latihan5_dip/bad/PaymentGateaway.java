package latihan5_dip.bad;

/**
 * Abstraction: PaymentGateway
 */
interface PaymentGateaway {
    /**
     * Charge payment to card
     *
     * @param cardNumber Card number to charge
     * @param amount     Amount to charge
     * @return transaction ID
     */
    String charge(String cardNumber, double amount);
}
