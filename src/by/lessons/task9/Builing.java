package by.lessons.task9;
/** 1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.*/
public class Builing {
    private String street;
    private String wall;
    private int year;

    public Builing(String street, String wall, int year) {
        this.street = street;
        this.wall = wall;
        this.year = year;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String info() {
        String result = "";
        result = result + " Улица " + street + ", материал стен" + wall +", год постройки " + year ;
        return result;
    }
}
