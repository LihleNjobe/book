package za.ac.cput.book;

import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookDetailsTest {


    // ****************************************COLLECTIONS**********************************************

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
    public void collectionFind() {
        Collection<String> BookDetailsCollection = new LinkedHashSet();
        BookDetailsCollection.add("Entrepreneurship");
        BookDetailsCollection.add("The 5AM gang");

        BookDetailsCollection.contains("The 5AM gang");
        System.out.println(BookDetailsCollection.contains("The 5AM gang"));

    }


    //**************************************MAP*********************************************************
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
    public void mapFind() {
        Map<Integer, String> BookDetailsMap = new HashMap<>();
        BookDetailsMap.put(1, "Entrepreneurship");
        BookDetailsMap.put(2, "How to make a million");
        BookDetailsMap.put(3, "How to deal with ADP3 stress");

        BookDetailsMap.get(3);
        System.out.println(BookDetailsMap.get(3));
    }


    // *************************************LIST*******************************************************
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
    //****************************************SET*****************************************************
    @Test
    public void setAdd() {

        Set<BookDetails> BookDetailsSet = new HashSet<>();
        BookDetailsSet.add(new BookDetails("Love Island", 234));
        BookDetailsSet.add(new BookDetails("The fire house", 23));

        assertEquals(2, BookDetailsSet.size());
        System.out.println(BookDetailsSet);
    }

    @Test
    public void setRemove() {
        Set<BookDetails> BookDetailsSet = new HashSet<>();
        BookDetailsSet.add(new BookDetails("Girls Talk", 45));
        BookDetailsSet.add(new BookDetails("Important notice", 44));
        BookDetailsSet.remove("Girls Talk");

        assertEquals(2, BookDetailsSet.size());


    }

    @Test
    public void setfind() {
        Set<BookDetails> BookDetailsSet = new HashSet();
        BookDetailsSet.add(new BookDetails("Love Island", 12));
        BookDetailsSet.add(new BookDetails("The House", 9));

        BookDetailsSet.contains("The 5AM gang");
        System.out.println(BookDetailsSet.contains("The 5AM gang"));

    }

}

