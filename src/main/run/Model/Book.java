package Model;

import lombok.Data;

@Data
public class Book {
    private int idBook;
    private String bookTitle;
    private String author;
    private String brief;
    private String publisher;
    private String content;
    private String category;
}
