package by.lessons.task7;
/**
 * 1 Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ),
 * Год издания(тип Int), Количество старниц (тип int), цена (double).
 * Инициализацию книги в классе main выполнять через конструктор с параметрами.
 * Также определите конструктор без параметров.
 * 2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
 * 3 Создать метод, который будет изменять ценц книги (сам метод в качестве параметра будет принимать новую цену)*/
public class Book {
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int year;
    private int pages;
    private Double price;

    public Book(Integer studentId, String name, String author, String publishing, int year, int pages, Double price) {
        this.id = studentId;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
    }

    public String info() {
        return "Информация о книге: " + name + '\n'+
                "Автор " + author + '\n' +
                "издательство " + publishing + '\n' +
                "год издания " + year + '\n' +
                "количество страниц " + pages + '\n' +
                "цена " + price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**5 Создать метод в классе Book, который будет принимать
    массив книг и возвращать массив книг, у которых год издания ниже переданнго года в методе.*/
    public int getYear() {
        return year;
    }
    public static Book[] getBOOKs(Book[] Books, int year) {

        int count = 0;
        for (Book Book : Books) {
            if (Book.getYear() < year) {
                count++;
            }
        }
        Book OldBooks[] = new Book[count];
        int index = 0;

        for (int i = 0; i < Books.length; i++) {
            if ( Books[i].getYear() <
                    year) {
                OldBooks[index] = Books[i];
                index++;
            }
        }
        return OldBooks;
    }
}
