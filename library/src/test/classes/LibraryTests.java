package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.SearchByType;
import main.classes.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTests {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Book1", "Author1", 1);
        book2 = new Book("Book2", "Author2", 2);
        book3 = new Book("Book3", "Author3", 3);
        student1 = new Student("Student1", 1);
        student2 = new Student("Student2", 2);
        student3 = new Student("Student3", 3);

        library.addBook(book1);
        library.addBook(book2);
        library.addStudent(student1);
        library.addStudent(student3);
    }

    @Test
    void testReturnedBookShouldBeRemovedFromStudentLibrary() {
        assertTrue(library.lendBook(book1, student1));
        assertTrue(library.returnBook(book1, student1));
        assertFalse(student1.hasBook(book1));
    }

    @Test
    void testUnregisteredStudentShouldNotLentBookFromLibrary() {
        assertFalse(library.lendBook(book1, student2));
    }

    @Test
    void testSearchStudentsById() {
        ArrayList<Object> ids = new ArrayList<>();
        ids.add(student1.getId());
        ids.add(student3.getId());

        ids.add(student2.getId());

        ArrayList<Student> result = library.searchStudents(SearchByType.ID, ids);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(student1));
        assertTrue(result.contains(student3));
        assertFalse(result.contains(student2));
    }

    @Test
    void testSearchStudentsByName() {
        ArrayList<Object> names = new ArrayList<>();
        names.add(student1.getName());
        names.add(student3.getName());

        names.add(student2.getName());

        ArrayList<Student> result = library.searchStudents(SearchByType.NAME, names);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(student1));
        assertTrue(result.contains(student3));
        assertFalse(result.contains(student2));
    }


    @Test
    void testSearchStudentsInvalidSearchType() {
        ArrayList<Object> keys = new ArrayList<>();
        keys.add(student1.getName());

        ArrayList<Student> result = library.searchStudents(SearchByType.TITLE, keys);
        assertNull(result);

        result = library.searchStudents(SearchByType.AUTHOR, keys);
        assertNull(result);
    }


    @Test
    void testSearchBooksById() {
        ArrayList<Object> ids = new ArrayList<>();
        ids.add(student1.getId());
        ids.add(student3.getId());

        ids.add(student2.getId());

        ArrayList<Book> result = library.searchBooks(SearchByType.ID, ids);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(book1));
        assertTrue(result.contains(book2));
    }

    @Test
    void testSearchBooksByTitle() {
        ArrayList<Object> titles = new ArrayList<>();
        titles.add(book1.getTitle());
        titles.add(book2.getTitle());

        titles.add(book3.getTitle());

        ArrayList<Book> result = library.searchBooks(SearchByType.TITLE, titles);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(book1));
        assertTrue(result.contains(book2));
    }

    @Test
    void testSearchBooksByAuthor() {
        ArrayList<Object> authors = new ArrayList<>();
        authors.add(book1.getAuthor());
        authors.add(book2.getAuthor());
        authors.add(book3.getAuthor());

        ArrayList<Book> result = library.searchBooks(SearchByType.AUTHOR, authors);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains(book1));
        assertFalse(result.contains(book3));
        assertTrue(result.contains(book2));
    }

    @Test
    void testSearchBooksInvalidSearchType() {
        ArrayList<Object> keys = new ArrayList<>();
        keys.add(book1.getTitle());

        ArrayList<Book> result = library.searchBooks(SearchByType.NAME, keys);
        assertNull(result);
    }
}
