
class Rental {
    private String date;
    private Book book;
    private person person;

    public Rental(String date, Book book, person person) {
        this.date = date;
        this.book = book;
        this.person = person;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public person getPerson() {
        return person;
    }

    public void setPerson(person person) {
        this.person = person;
    }
}