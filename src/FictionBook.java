public class FictionBook extends Book{
    private String category;

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public double getAmount() {
        return price*0.90;
    }
}
