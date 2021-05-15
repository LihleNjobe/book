package za.ac.cput.book;

import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookDetailsTest {


    // COLLECTIONS

    @Test
    public void collectionAdd() {
        Collection<String> BookDetailsCollection = new LinkedHashSet();

        BookDetailsCollection.add("Entrepreneurship");
        BookDetailsCollection.add("The 5AM gang");
        assertEquals(2, BookDetailsCollection.size());
        System.out.println(BookDetailsCollection);

    }

    @Test
    void CollectionRemove() {
        Collection<String> BookDetailsCollection = new LinkedHashSet();

        BookDetailsCollection.add("Entrepreneurship");
        BookDetailsCollection.add("The 5AM gang");
        BookDetailsCollection.remove("Entrepreneurship");

        assertEquals(1, BookDetailsCollection.size());
        System.out.println(BookDetailsCollection);

    }

    @Test
    void collectionFind() {
        Collection<String> BookDetailsCollection = new LinkedHashSet();
        BookDetailsCollection.add("Entrepreneurship");
        BookDetailsCollection.add("The 5AM gang");

        BookDetailsCollection.contains("The 5AM gang");
        System.out.println(BookDetailsCollection.contains("The 5AM gang"));

    }


    //MAP
    @Test
    public void mapAdd() {
        Map<Integer, String> BookDetailsMap = new HashMap<>();

        BookDetailsMap.put(1, "Entrepreneurship");
        BookDetailsMap.put(2, "How to make a million");
        assertEquals(2, BookDetailsMap.size());
        System.out.println(BookDetailsMap);

    }

    @Test
    public void mapRemove() {
        Map<Integer, String> BookDetailsMap = new HashMap<>();
        BookDetailsMap.put(1, "Entrepreneurship");
        BookDetailsMap.put(2, "How to make a million");
        BookDetailsMap.remove(1);

        assertEquals(1, BookDetailsMap.size());
        System.out.println(BookDetailsMap);

    }

    @Test
    public void mapFind(){
        Map<Integer, String> BookDetailsMap = new HashMap<>();
        BookDetailsMap.put(1, "Entrepreneurship");
        BookDetailsMap.put(2, "How to make a million");
        BookDetailsMap.put(3, "How to deal with ADP3 stress");

        BookDetailsMap.get(3);
        System.out.println(BookDetailsMap.get(3));
  }


    //SET
    @Test
    public void setAdd() {
        Set<BookDetails> BookDetailsSet = new HashSet<>();
        BookDetailsSet.add(new BookDetails("ABC", "ISBN78"));
        BookDetailsSet.add(new BookDetails("How did I end up here ", "ISBN680"));
        BookDetailsSet.add(new BookDetails("Secret life of Walter Mitty", "ISBN67"));

        assertEquals(3, BookDetailsSet.size());
        System.out.println(BookDetailsSet);

    }

    @Test
    public void setRemove() {


    }



    // LIST
    @Test
    public void listAdd() {
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
        BookDetails.remove("Statistics with R");

        assertEquals(2, BookDetails.size());
        System.out.println(BookDetails.size());
        System.out.println(BookDetails);
    }


    @Test
    public void listFind() {
        List<String> BookDetails = new ArrayList<>();
        BookDetails.add("Java Tutorial");
        BookDetails.add("Statistics with R");
        BookDetails.add("Secrets");

        BookDetails.indexOf("Secrets");
        System.out.println(BookDetails.indexOf("Secrets"));


        }
    }

