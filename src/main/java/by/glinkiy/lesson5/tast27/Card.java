package by.glinkiy.lesson5.tast27;
/*
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
 */
public abstract class Card {
    private int serialNumber;
    private int validityPeriod;
    private CardType cardType;
    private PaySystem paySystem;

    public Card(int serialNumber, int validityPeriod, CardType cardType, PaySystem paySystem) {
        this.serialNumber = serialNumber;
        this.validityPeriod = validityPeriod;
        this.cardType = cardType;
        this.paySystem = paySystem;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getValidityPeriod() {
        return validityPeriod;
    }

    public CardType getCardType() {
        return cardType;
    }

    public PaySystem getPaySystem() {
        return paySystem;
    }

    public abstract void printStatCard();
}
