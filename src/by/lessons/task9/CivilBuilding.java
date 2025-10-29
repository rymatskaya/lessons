package by.lessons.task9;
/**1.2 Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от
 класса Постройка. */
public class CivilBuilding extends Builing{
    private String purpose; // назначение (жилье или общественные здания)
    private int countFloor;  //количество этажей

    public CivilBuilding(String street, String wall, int year, String purpose, int countFloor) {
        super(street, wall, year);
        this.purpose = purpose;
        this.countFloor = countFloor;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public void setCountFloor(int countFloor) {
        this.countFloor = countFloor;
    }

    public String info() {
        String result = super.info();
        result = result + ", назначение: " + purpose +
                ", количество этажей: " + countFloor;
        return result;
    }
}
