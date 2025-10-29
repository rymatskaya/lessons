package by.lessons.task9;

/**
 * 1.4 Создать класс Административном здание. Административное здание должно наследоваться
 * от Гражданского здания. Поля, которые можно определить в Административном здании:
 * назначение административного здания (офисное, кинотеатр, спортсооружение),число людей,
 * на которое рассчитано здание.
 */
public class AdministrativeBuilding extends IndustrialBuilding {
    private String purposeIB; //назначение административного здания (офисное, кинотеатр, спортсооружение)
    private int countPeople; // число людей, на которое рассчитано здание.

    public AdministrativeBuilding(String street, String wall, int year, String industry, String purposeIB, int countPeople) {
        super(street, wall, year, industry);
        this.purposeIB = purposeIB;
        this.countPeople = countPeople;
    }

    public String getPurposeIB() {
        return purposeIB;
    }

    public void setPurposeIB(String purposeIB) {
        this.purposeIB = purposeIB;
    }

    public int getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(int countPeople) {
        this.countPeople = countPeople;
    }
    public String info() {
        String result = super.info();
        result = result + ", назначение административного здания: " + purposeIB +
                ", число людей, на которое рассчитано здание: " + countPeople;
        return result;
    }
}
