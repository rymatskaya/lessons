package by.lessons.task10;
/**
 * 4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен).
 * Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так,
 * чтобы методы выводил «Холодильник морозит».*/
public class Refrigerator implements ElectricAppliances, KitchenDevice {
    private String name;
    private String model;
    private Double price;
    private Boolean isOn;

    public Refrigerator(String name, String model, Double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public void work() {
        System.out.println("Холодильник работает");
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void broken() {
        System.out.println("Холодильник сломался");
    }
}
