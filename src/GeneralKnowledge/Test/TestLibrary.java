package GeneralKnowledge.Test;

import org.junit.Test;

public class TestLibrary {
    @Test
    public void testAddBook(){
        Library library = new Library();
        library.addBook("title","author");
    }

}
