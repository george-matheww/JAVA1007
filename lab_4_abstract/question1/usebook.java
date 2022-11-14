import java.util.*;
public class usebook {
    public static void main(String[] args){
        fiction fbook=new fiction("percy jackson");
        nonfiction nfbook = new nonfiction("lord of the rings");
        fbook.set_book_price();
        nfbook.set_book_price();

        System.out.println(fbook.return_book_titile()+" "+fbook.return_book_price());
        System.out.println(nfbook.return_book_titile()+" "+nfbook.return_book_price());
    }
}