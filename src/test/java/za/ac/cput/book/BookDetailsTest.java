package za.ac.cput.book;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookDetailsTest {

    @Test
    void test () {
        List<BookDetails> bookDetailsList = new ArrayList<>();
        Set<BookDetails> bookDetailsSet = new HashSet<>();
        for(int x = 0; x < 5; x++) {
           String title = "t"  + 1;
           BookDetails b = new BookDetails(title);
            System.out.println(title);
            bookDetailsList.add(b);
            bookDetailsSet.add(b);

        }
        assertEquals(5, bookDetailsList.size());
        assertEquals(5, bookDetailsSet.size());


    }


}