package by.lessons.task9;
/**
 *  1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться
 *  Многоквартирный жилой дом. Поля, которые можно определить в Многоквартирном жилье: количество квартир.*/
public class MultiApartmentBuilding extends CivilBuilding{
    private int countApartment;

    public MultiApartmentBuilding(String street, String wall, int year, String purpose, int countFloor, int countApartment) {
        super(street, wall, year, purpose, countFloor);
        this.countApartment = countApartment;
    }

    public int getCountApartment() {
        return countApartment;
    }

    public void setCountApartment(int countApartment) {
        this.countApartment = countApartment;
    }

    public String info() {
        String result = super.info();
        result = result + ", количество квартир: " + countApartment ;
        return result;
    }
}
