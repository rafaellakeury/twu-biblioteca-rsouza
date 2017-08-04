package com.twu.biblioteca.service;

import com.twu.biblioteca.constants.BibliotecaBooksList;


public class BibliotecaService {

    public void showWelcomeMessage() {
        System.out.print("Welcome to Bangalore library!");
    }

    public void showBooksList() {
        System.out.print(BibliotecaBooksList.libraryBooksList.toString());
    }

}
