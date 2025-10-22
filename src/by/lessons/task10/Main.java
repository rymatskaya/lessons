package by.lessons.task10;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("Bosh", "latte, americano", 5512.4);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine("Scarlet", "варит кофе", 1545.0);

        Refrigerator refrigerator1 = new Refrigerator("F-54", "Bosh", 4555.0);
        Refrigerator refrigerator2 = new Refrigerator("F-55", "Bosh", 5555.0);

        WashingMachine washingMachine1 = new WashingMachine("D-25", "Indesit", 8455.0);
        WashingMachine washingMachine2 = new WashingMachine("D-45", "Bosh", 4582.5);

        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("D-25", "Indesit", 8455.0);
        VacuumCleaner vacuumCleaner2 = new VacuumCleaner("D-45", "Bosh", 4582.5);

        ElectricAppliances electricAppliances[] = {coffeeMachine1, coffeeMachine2, refrigerator1, refrigerator2, washingMachine1, washingMachine2, vacuumCleaner1, vacuumCleaner2};

        for (ElectricAppliances e : electricAppliances
        ) {
            e.start();
            System.out.println(e.toString());
            e.work();
        }

        KitchenDevice kitchenDevice[] = {refrigerator1, refrigerator2, washingMachine1, washingMachine2};
        for (KitchenDevice e : kitchenDevice
        ) {
            System.out.println(e.toString());
            e.broken();
        }
         /**11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так,
          *  чтобы этот метод включал прибор (менял значение Boolean isOn на true.)
          *  Выведите результат в консоль*/
        ElectricAppliances coffeeMachines[] = {coffeeMachine1, coffeeMachine2};
        for (ElectricAppliances e : coffeeMachines
        ) {
            System.out.println(e.toString());
            e.start();
          }

    }
}
