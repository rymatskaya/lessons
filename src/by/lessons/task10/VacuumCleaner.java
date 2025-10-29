package by.lessons.task10;
/**6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn.
 *  Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так,
 *  чтобы метод выводил «Пылесос убирает».*/
public class VacuumCleaner implements ElectricAppliances{
    private String name;
    private String brand;
    private Double price;
    public Boolean isOn;

    public VacuumCleaner(String name, String brand, Double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void work() {
        System.out.println("Пылесос работает");
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
