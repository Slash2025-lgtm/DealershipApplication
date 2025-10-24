package com.pluralsight;

public class App {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        userInterface.display();
    }
}
