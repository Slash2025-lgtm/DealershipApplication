package com.pluralsight.ui;

import com.pluralsight.dataholders.DealershipFileManager;

public class App {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        do {
            userInterface.display();
        } while (true);

    }
}
