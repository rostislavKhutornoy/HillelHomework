package Task22;

public abstract class RealEstate implements CalculateTax{
    public double S;
    public double taxK;

    public RealEstate() {
    }

    public RealEstate(double s, double taxK) {
        this.S = s;
        this.taxK = taxK;
    }
}
