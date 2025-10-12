package by.lessons.task7;

public class ClasessMain {
    public static void main(String[] args) {
        Book books1 = new Book(1, "Незнайка", "Носов", "Мир", 1952, 125, 255.0);
        books1.setPrice(65.25);

        String result = books1.info();
        System.out.println(result);

        for (Book Book : books()) {
            System.out.println(Book.info());
        }

        Book[] oldBooks = Book.getBOOKs(books(), 1990);
        System.out.println("__________________________________");
        System.out.println("Старые книги: ");
        for (Book book : oldBooks) {
            System.out.println(book.info());
        }


    }

    public static Book[] books() {
        Book books1 = new Book(1, "Незнайка", "Носов", "Мир", 1952, 125, 255.0);
        Book books2 = new Book(2, "Война и мир", "Толстой", "Мир", 1854, 548, 45.0);
        Book books3 = new Book(3, "Шантарам", "Автор3", "Свет", 1998, 8756, 74.2);
        Book books4 = new Book(4, "Азазель", "Акунин", "Свет", 1865, 354, 10.55);
        Book books5 = new Book(5, "Книга5", "Автор5", "Мир", 2000, 78757, 78.2);
        Book arrayBook[] = {books1, books2, books3, books4, books5};
        return arrayBook;
    }
}


