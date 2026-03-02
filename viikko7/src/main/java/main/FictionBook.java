package main;

public class FictionBook extends Book implements Borrowable {

    public FictionBook(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }


    public String categorize() {
        return "Fiktiokirja";
        
    }

    public void returnBook() {

    }

    public void borrow() {

        

        
    }
}
