package by.lessons.task9;
/**
 *  1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые
 *  можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)
 *  Все поля должны быть с модификатором доступа private. Реализовывать методы getter и setter по
 *  необходимости. Инициализацию объекта производить через конструктор.*/
public class Factory extends IndustrialBuilding{
    private int countEmployees; // количество работников
    private String products; // выпускаемая продукция (запчасти, полиэтилен и т.д.)

    public Factory(String street, String wall, int year, String industry, int countEmployees, String products) {
        super(street, wall, year, industry);
        this.countEmployees = countEmployees;
        this.products = products;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public void setCountEmployees(int countEmployees) {
        this.countEmployees = countEmployees;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String info() {
        String result = super.info();
        result = result + " Kоличество работников: " + countEmployees +
                ", выпускаемая продукция: " + products;
        return result;
    }
}
