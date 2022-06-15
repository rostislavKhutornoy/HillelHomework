package Task22;

import java.io.IOException;

public class PropertyTax {
    public static void Tax() throws IOException {
        while (true) {
            RealEstateFactory realEstateFactory = new RealEstateFactory();
            System.out.println("Choose your property type.");
            System.out.println("1 - residential; 2 - trading; 3 - production; 0 - exit from the program.");
            int choose = (int) (ReaderDouble.GetDouble());
            switch (choose) {
                case 0 -> {
                    System.out.println("Goodbye!");
                }
                case 1 -> {
                    realEstateFactory.CreateRealEstate(RealEstateType.RESIDENTIAL).CalculateTax();
                }
                case 2 -> {
                    realEstateFactory.CreateRealEstate(RealEstateType.COMMERCIAL).CalculateTax();
                }
                case 3 -> {
                    realEstateFactory.CreateRealEstate(RealEstateType.INDUSTRIAL).CalculateTax();
                }
                default -> {
                    System.out.println("Unknown value. Try again");
                }
            }
            if (choose == 0) {
                break;
            }
        }
    }
}
