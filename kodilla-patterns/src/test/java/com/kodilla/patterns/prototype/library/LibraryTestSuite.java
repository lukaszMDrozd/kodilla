package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //given
        Library library = new Library("Moja kolekcja");
        IntStream.iterate(1, n -> n +1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Tytuł" + n, "Jan" + n, LocalDate.now())));

        Book bookToRemoved = new Book("XX", "JanK", LocalDate.now());
        library.getBooks().add(bookToRemoved);

        //making a shallow copy of library object
        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Shallow Library CLone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        //making a deep copy of library object
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Deep Library CLone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        //when
        library.getBooks().remove(bookToRemoved);

        //then
        System.out.println("Library: " + library.getBooks() + "\n");
        System.out.println("Shallow Copy: " + shallowCopyLibrary.getBooks() + "\n");
        System.out.println("Deep Copy" + deepCopyLibrary.getBooks() + "\n");

        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(6, deepCopyLibrary.getBooks().size());
    }
}
