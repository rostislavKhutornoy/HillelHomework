package Task8;

/*
    У вас есть 24 собаки и 8 котов. Порция обеда для каждого животного составляет 50 грамм и стоит 2 доллара. Животные кушают 3 раза в день.

    Сколько нужно корма для котов в месяц?
    Сколько нужно корма для собак в месяц?
    Сколько нужно денег в месяц на содержание приюта?
*/

public class AnimalShelter {
    public int DogsNumber;
    public int CatsNumber;

    public AnimalShelter(int dogsNumber, int catsNumber) {
        DogsNumber = dogsNumber;
        CatsNumber = catsNumber;
    }

    public void PerMonth(int DayCount) {
        double DogsFeed = 0;
        double CatsFeed = 0;
        int MoneyCountDogs = 0;
        int MoneyCountCats = 0;
        for (int i = 1; i <= DogsNumber; i++) {
            DogsFeed += 50 * 3 * DayCount;
            MoneyCountDogs += 2 * 3 * DayCount;
        }
        for (int i = 1; i <= CatsNumber; i++) {
            CatsFeed += 50 * 3 * DayCount;
            MoneyCountCats += 2 * 3 * DayCount;
        }
        System.out.println("Need " + DogsFeed + " grams of food per month for dogs, or " +
                DogsFeed / 1000.0 + " kilograms. The right amount of feed will cost " +
                MoneyCountDogs + "$");
        System.out.println("Need " + CatsFeed + " grams of food per month for cats, or " +
                CatsFeed / 1000.0 + " kilograms. The right amount of feed will cost " +
                MoneyCountCats + "$");
    }

    public static void main(String[] args) {
        AnimalShelter FirstShelter = new AnimalShelter(24, 8);
        FirstShelter.PerMonth(31);
    }
}
