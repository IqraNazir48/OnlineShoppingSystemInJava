public class Book extends Product{
    //(int pId,String pName, int pQuantity, double pPrice
    String bookTitle;
    String bookAuthor;
    Book(int id,String name,int quantity, double price,String title,String author){
        super(id,name,quantity,price);
        this.bookTitle=title;
        this.bookAuthor=author;
    }
    //setters and getters
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String toString(){
        return "Book Name: "+this.pName+"  Book id: "+this.pId+"  Book Price per Item: "+this.pPrice+"  Book Title: "+this.bookTitle+"  Book Author"+this.bookAuthor;

    }
}
