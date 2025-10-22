package by.lessons.task10;

/**
 * 3. Создать класс Кофемашина. Поля наименование. Список функционала.
 * Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы.
 * Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
 */
public class CoffeeMachine implements ElectricAppliances {
    private String name;
    private String functions;
    private Double price;
    private Boolean isOn;

    public CoffeeMachine(String name, String functions, Double price) {
        this.name = name;
        this.functions = functions;
        this.price = price;
    }

    public CoffeeMachine() {
    }

    @Override
    public void work() {
        System.out.println("Кофемашина " + name + " варит кофе");
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "name='" + name + '\'' +
                ", functions='" + functions + '\'' +
                ", price=" + price +
                '}';
    }

    public Boolean getOn() {
        return isOn;
    }

    @Override
    public void start() {
        ElectricAppliances.super.start();
        isOn = true;
        System.out.println(getOn());
    }
}
