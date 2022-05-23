package spotify.premium;


public class CreditCard {
    private String cardEmitter;
    private int cardNumber;
    private int cvv;
    private String ownerName;
    private String fullAddress;

    public CreditCard() {
    }

    public CreditCard(String cardEmitter, int cardNumber,
                      int cvv, String ownerName, String fullAddress) {
        this.cardNumber = cardNumber;
        this.cardEmitter = cardEmitter;
        this.cvv = cvv;
        this.ownerName = ownerName;
        this.fullAddress = fullAddress;
    }

    public String getcardEmitter() {
        return cardEmitter;
    }

    public void setcardEmitter(String cardEmitter) {
        this.cardEmitter = cardEmitter;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getownerName() {
        return ownerName;
    }

    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getfullAddress() {
        return fullAddress;
    }

    public void setfullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public String toString() {
        return "From class CreditCard {" +
                " the card emitter is '" + cardEmitter + '\'' +
                ", the card number is '" + cardNumber +
                ", the CVV on the card is '" + cvv +
                ", the owner name is '" + ownerName + '\'' +
                ", the full address is '" + fullAddress + '\'' +
                "} ";
    }

//    public CreditCard(CreditCard creditCard) {
//        this.cardNumber = creditCard.cardNumber;
//        this.cardEmitter = creditCard.cardEmitter;
//        this.cvv = creditCard.cvv;
//        this.ownerName = creditCard.ownerName;
//        this.fullAddress = creditCard.fullAddress;
//    }
}
