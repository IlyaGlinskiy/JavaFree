package by.glinkiy.lesson5.tast27;

public class PersonCard extends CardWithChip{
    private String firstName;
    private String lastName;

    public PersonCard(int serialNumber, int validityPeriod, CardType cardType, PaySystem paySystem, boolean availabilityChip, String firstName, String lastName) {
        super(serialNumber, validityPeriod, cardType, paySystem, availabilityChip);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printStatCard() {
        System.out.println("Personal card data: "+"\n User: "+firstName+" "+lastName+"\n Card type: "
                +super.getCardType()+"\n Pay system: "+super.getPaySystem()+"\n Serial number: "+super.getSerialNumber()+
                "\n Validity period: "+super.getValidityPeriod()+"\n Availability chip: "+super.isAvailabilityChip());

    }
}
