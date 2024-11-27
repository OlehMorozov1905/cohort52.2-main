package homework_18.book;

import homework_18.book.model.Book;
import homework_18.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {

        Book book = new Book("War and peace", "Tolstoy", 1980, 1000L);
        book.display();
        System.out.println("----------------------------------------");
        Dictionary dictionaryEng = new Dictionary("English Dictionary", "Bonk", 1985, 2000L, "english", 20000, "language");
        dictionaryEng.display();
        System.out.println("----------------------------------------");
        Dictionary dictionaryWords = new Dictionary("Words Dictionary", "Ojegov", 1990, 3000L, "russian", 30000, "words");
        dictionaryWords.display();
        System.out.println("----------------------------------------");

    }
}
