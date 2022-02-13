package Encapsulation;

public class CreditCard {
    private int cvv; //Once the CVV is set you cannot access the cvv hence we say cvv is encapsulated
    private String cardNo; /*card number is encapsulated partially we can set carno only once and we can
    read carno using getCardNo() method*/

    public CreditCard(int cvv, String cardNo) {
        this.cvv = cvv;
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }
}
