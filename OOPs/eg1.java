package OOPs;

class Book{
    String title ="do coding";
    String author = "karan";
    float price = 400;

    void showDetails(){
        System.out.println("title : "+title + "\nauthor : " + author + "\nprice : " + price);
    }
    void applyDiscount(int disc){
       float discount = price*disc/100f;
       price = price - discount;
        System.out.println("book price after applying Discount " + price);
    }
}
public class eg1 {
    public static void main(String[] args) {
        Book book = new Book();
        book.showDetails();
        book.applyDiscount(10);
//        book.showDetails();
    }
}
