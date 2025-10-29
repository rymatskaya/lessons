package by.lessons.task9;


/**
 2.1  Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики Значения придумать самим.
 Добавить эти объекты в деревню (реализовать метод по добавлению постройки в деревню)
 (должны придумать,как это сделать)
 2.2 Реализовать метод по выводу информации о каждой постройке.
 2.3 Реализовать метод по подсчету общего количества зданий в деревне.
 2.4 Посчитать количество промышленных зданий в деревне. И вывести информацию о этих зданиях.*/
public class MainClass {
    public static void main(String[] args) {
        CivilBuilding sportBuiding = new CivilBuilding("Мира", "блок", 2000, "Спорт", 3);
        System.out.println(sportBuiding.info());
        AdministrativeBuilding ispolcom = new AdministrativeBuilding("Ленина", "блок",  2015, "гос", "управление", 265);
        MultiApartmentBuilding apartBuilding = new MultiApartmentBuilding("Космонавтов", "каркас", 2020, "жилой дом", 7, 365);
        MultiApartmentBuilding apartBuilding1 = new MultiApartmentBuilding("Космонавтов", "каркас", 2022, "жилой дом", 5, 254);
        Factory factory = new Factory("Lenina", "кирпич", 1999, "сельское хозяйство", 2545, "трактора");
        Factory factory1 = new Factory("Советская", "кирпич", 2005, "легкая промышленность", 255, "молоко");

        Village village = new Village();

        village.addBuiling(sportBuiding);
        village.addBuiling(ispolcom);
        village.addBuiling(apartBuilding);
        village.addBuiling(apartBuilding1);
        village.addBuiling(factory);
        village.addBuiling(factory1);

        village.info();
    }
}
