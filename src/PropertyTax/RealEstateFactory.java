package PropertyTax;

import java.io.IOException;

public class RealEstateFactory {

    public RealEstate CreateRealEstate(RealEstateType type) throws IOException {
        RealEstate realEstate = null;
        double S;
        double taxK;
        System.out.println("Enter the total area of the property: ");
        S = ReaderDouble.GetDouble();
        System.out.println("Enter a tax per square meter of real estate: ");
        taxK = ReaderDouble.GetDouble();

        switch (type) {
            case COMMERCIAL -> {
                System.out.println("Enter your trading revenue: ");
                double revenue = ReaderDouble.GetDouble();
                realEstate = new CommercialRealEstate(S, taxK, revenue);
            }
            case INDUSTRIAL -> realEstate = new IndustrialRealEstate(S, taxK);
            case RESIDENTIAL -> {
                System.out.println("Enter subsidy percentage: ");
                double subsidy = ((int)(ReaderDouble.GetDouble())) / 100.0;
                realEstate = new ResidentialProperties(S, taxK, subsidy);
            }
        }
        return realEstate;
    }
}
