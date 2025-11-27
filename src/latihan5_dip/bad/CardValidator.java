package latihan5_dip.bad;

public class CardValidator {
    public boolean validate(String cardNumber) {
        System.out.println("Validating card number: " + cardNumber);
        return cardNumber != null && cardNumber.length() == 16;
    }
}
