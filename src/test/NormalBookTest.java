import main.ui.Book;
import main.ui.RegularBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NormalBookTest {
    Book normalBook;

    @Test
    public void testANewBookIsAvailable(){
        normalBook = new RegularBook("","");
        assertEquals(true, normalBook.isAvailable());
    }
    @Test
    public void testABookWithoutBorrower(){
        normalBook = new RegularBook("","");
        assertEquals(null, normalBook.getBorrower());

    }
}
