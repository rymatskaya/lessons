package by.lessons.task10;

/**
 * 1. Создать Интерфейс Электроприборы. В интерфейсе Электроприборы реализовать абстрактный метод:  work();
   2. Создать дефолтный метод в интерфейсе Электроприборы., start() который выводит текст «Электроприбор стартует». */
public interface ElectricAppliances {
    public abstract void work();

    default void start() {
        System.out.println("Электроприбор стартует");
    }
}
