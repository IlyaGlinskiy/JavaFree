package by.glinkiy.lesson5.tast27;

public class CardMain {
    public static void main(String[] args) {
//        PaySystem masterCard = new PaySystem(5497,24,"CreditCard",true,"MasterCard");
//        masterCard.printStatCard();
        PersonCard card = new PersonCard(1254, 12_24, CardType.CREDIT, PaySystem.MASTERCARD, true,
                "Jon", "Smit");
        card.printStatCard();
    }
}
