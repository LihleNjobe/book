package za.ac.cput.book;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookDetailsTest {


    // COLLECTIONS

    @Test
    void collectiontest() {
        Collection<BookDetails> BookDetailsCollection = new LinkedHashSet();
        for (int x = 0; x < 5; x++) {
            String title = "Java tutorial book Version1  " + 1;
            String ISBN = "isbn6709" + 1;
            BookDetails b = new BookDetails(title, ISBN);
            System.out.println(title);

            BookDetailsCollection.add(b);
        }
    }

    //MAP
    @Test
    public void maptest() {
        Map<Integer, String> BookDetailsMap = new HashMap<>();

    BookDetailsMap.put(1, "Entrepreneurship");
    BookDetailsMap.put(2, "How to make a million");
        assertEquals(2, BookDetailsMap.size());
    System.out.println(BookDetailsMap) ;

    }

    // SET

    @Test
    void settest() {
        Set<BookDetails> BookDetailsSet = new HashSet<>();
        for (int x = 0; x < 2; x++) {
            String title = "Java tutorial book Version1  " + 1;
            String ISBN = "isbn6709" + 1;
            BookDetails b = new BookDetails(title, ISBN);
            System.out.println(ISBN);
        }

        assertEquals(2, BookDetailsSet.size());

    }


    // LIST
    @Test
    public void listtest() {
        List<String> BookDetails = new ArrayList<>();
        BookDetails.add("Java Tutorial");
        BookDetails.add("Statistics with R");
        BookDetails.add("Secrets ");

        for (int x = 0; x < 3; x++) {
            assertEquals(3, BookDetails.size());
            System.out.println(BookDetails.get(x));
        }

    }

    @Test
    public void listRemove() {
        List<String> BookDetails = new ArrayList<>();
        BookDetails.add("Java Tutorial");
        BookDetails.add("Statistics with R");
        BookDetails.add("Secrets");
        BookDetails.remove("Secrets");

        assertEquals(2, BookDetails.size());
        System.out.println(BookDetails.size());
    }


    @Test
    public void listFind() {

    }

}
