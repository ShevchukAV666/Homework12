public class Book {
    private String nameOfBook; //название
    private Author author; // автор
    private int yearPublication; // год публикации книги


    public Book(String nameOfBook, Author author, int yearPublication) {
            this.nameOfBook = nameOfBook;
            this.author = author;
            this.yearPublication = yearPublication;

    }

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}






