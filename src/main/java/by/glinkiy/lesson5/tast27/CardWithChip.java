package by.glinkiy.lesson5.tast27;

public class CardWithChip extends Card {
    private boolean availabilityChip;

    public void addChip() {
        availabilityChip = true;
    }

    public void offChip() {
        availabilityChip = false;
    }

    @Override
    public void printStatCard() {
        System.out.println("Card has chip: " + availabilityChip);
    }

    public CardWithChip(int serialNumber, int validityPeriod, CardType cardType, PaySystem paySystem, boolean availabilityChip) {
        super(serialNumber, validityPeriod, cardType, paySystem);
        this.availabilityChip = availabilityChip;
    }

    public boolean isAvailabilityChip() {
        return availabilityChip;
    }
}
