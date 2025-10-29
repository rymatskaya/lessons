package by.lessons.task10;
/**5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn.
 * Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так,
 * чтобы метод выводил «Стиральная машина стирает»*/
public class WashingMachine implements ElectricAppliances, KitchenDevice {
    private String name;
    private String brand;
    private Double price;
    private Boolean isOn;

    public WashingMachine(String name, String brand, Double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина стирает");
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void broken() {
        System.out.println("Стиральная машина сломалась");
    }
}
