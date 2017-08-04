package com.twu.biblioteca.app;

import com.twu.biblioteca.service.BibliotecaService;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();
        bibliotecaService.start();
    }
}
