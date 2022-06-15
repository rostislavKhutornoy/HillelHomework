package Task22;

public class IndustrialRealEstate extends RealEstate{
    public IndustrialRealEstate() {
    }

    public IndustrialRealEstate(double s, double taxK) {
        super(s, taxK);
    }

    @Override
    public void CalculateTax() {
        System.out.println("Tax amount: " + (S*taxK));
    }
}
