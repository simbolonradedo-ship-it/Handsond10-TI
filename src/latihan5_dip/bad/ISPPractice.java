package latihan5_dip.bad;

class DIPPractice {

    private CardValidator validator = new CardValidator();
    private FraudDetector fraudDetector = new FraudDetector();
    private NotificationSender notificationSender = new NotificationSender();
    private TransactionLogger logger = new TransactionLogger();

    public void processPayment(String cardNumber, double amount) {

        logger.log("Processing payment...");

        if (!validator.validate(cardNumber)) {
            logger.log("Card validation FAILED.");
            notificationSender.send("Payment failed: Invalid card.");
            return;
        }

        if (fraudDetector.detect(amount)) {
            logger.log("Fraud detected!");
            notificationSender.send("Payment blocked: Fraud suspected.");
            return;
        }

        logger.log("Payment success for amount: " + amount);
        notificationSender.send("Payment success!");
    }

    public static void main(String[] args) {
        DIPPractice dip = new DIPPractice();

        dip.processPayment("1234567812345678", 5000);
    }
}
