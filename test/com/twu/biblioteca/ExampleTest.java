package com.twu.biblioteca;


import com.twu.biblioteca.constants.BibliotecaBooksList;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    BibliotecaService bibliotecaService = new BibliotecaService();


    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void applicationStartShowsWelcomeMessage() {
        bibliotecaService.showWelcomeMessage();
        assertEquals("Welcome to Bangalore library!", outContent.toString());

    }

    @Test
    public void applicationShowsBooksListAfterWelcomeMessage() {
        bibliotecaService.showBooksList();
        assertEquals(BibliotecaBooksList.libraryBooksList.toString(), outContent.toString());
    }
}
