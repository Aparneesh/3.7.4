
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    String authorToFind = ("L. Frank Baum");
    String bookToFind = ("Sky Island");
    double minimumRating = 0.0;

    for(Book b: childrensBooks){
      if(b.getAuthor().equals(authorToFind)){
        System.out.println(b.getTitle());
      }
    }

    for(Book b: childrensBooks){
      if(b.getTitle().equals(bookToFind)){
        minimumRating = b.getRating();
        System.out.println(minimumRating);
      }
    }

    for(Book b: childrensBooks){
      if(b.getRating() >= minimumRating){
        System.out.println(b.getTitle());
      }
    }


    
  }
}