package PropertyTax;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Возможно использовать встроенный интерфейс и создавать временные объекты для расчета налогов
        PropertyTax.Tax();
        // Возможно расчитать налог из вручную созданного объекта
        RealEstate realEstate = new ResidentialProperties(12, 12, 0.12);
        realEstate.CalculateTax();
        // Возможно вручную создать объект и использовать интерфейс для заполнения его полей, после чего расчитать налог
        RealEstate realEstate1;
        RealEstateFactory realEstateFactory = new RealEstateFactory();
        realEstate1 = realEstateFactory.CreateRealEstate(RealEstateType.RESIDENTIAL);
        realEstate1.CalculateTax();
    }
}
