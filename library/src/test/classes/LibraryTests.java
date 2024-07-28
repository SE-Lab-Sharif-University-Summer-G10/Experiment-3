package test.classes;

import main.classes.Book;
import main.classes.Library;
import main.classes.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTests {
    private Library library;
    private Book book1;
    private Book book2;
    private Student student1;
    private Student student2;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Book1", "Author1", 1);
        book2 = new Book("Book2", "Author2", 2);
        student1 = new Student("Student1", 1);
        student2 = new Student("Student2", 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addStudent(student1);
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

}
