package Task22;

public class ResidentialProperties extends RealEstate {
    public double subsidy;

    public ResidentialProperties() {
    }

    public ResidentialProperties(double s, double taxK, double subsidy) {
        super(s, taxK);
        this.subsidy = subsidy;
    }

    @Override
    public void CalculateTax() {
        System.out.println("Tax amount: " + ((S*taxK)*subsidy));
    }
}
