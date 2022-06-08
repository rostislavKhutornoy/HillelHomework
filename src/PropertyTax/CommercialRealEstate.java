package PropertyTax;

public class CommercialRealEstate extends RealEstate{
    public double revenue;

    public CommercialRealEstate() {
    }

    public CommercialRealEstate(double s, double taxK, double revenue) {
        super(s, taxK);
        this.revenue = revenue;
    }

    @Override
    public void CalculateTax() {
        if (revenue < 100) {
            System.out.println("No tax.");
        } else System.out.println("Tax amount: " + (S*taxK));
    }
}
