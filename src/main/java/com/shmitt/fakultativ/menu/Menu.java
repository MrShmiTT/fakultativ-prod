package com.shmitt.fakultativ.menu;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1. Показать все курсы");
        System.out.println("2. Показать курсы начиная с коротких");
        System.out.println("3. Показать курсы по Java Script;");
        System.out.println("0. Выход из приложения;");
    }

    public void start() throws SQLException {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                MenuController menuController = new MenuController();
                switch (key) {
                    case 1:
                        menuController.findAllOutput();
                        break;
                    case 2:
                        menuController.findAllShortestOutput();
                        break;
                    case 3:
                        menuController.findByNameOutput();
                        break;
                    case 0:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                        break;
                }
            } while (key != 0);
        }
    }
}
