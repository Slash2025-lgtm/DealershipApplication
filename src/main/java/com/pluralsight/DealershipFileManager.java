package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {

    public ArrayList<Dealership> getDealership() {
        ArrayList<Dealership> invList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            boolean firstLineRead = false;
            String input;
            while ((input = bufReader.readLine()) != null) {
                if (!firstLineRead) {
                    firstLineRead = true;
                    String[] infoList = input.split("[|]");
                    invList.add(new Dealership(infoList[0], infoList[1], infoList[2]));

                }
                //String[] infoList = input.split("[|]");
                //invList.add(new Vehicle(Integer.parseInt(infoList[0]), Integer.parseInt(infoList[1]), infoList[2], infoList[3], infoList[4], infoList[5], Integer.parseInt(infoList[6]), Double.parseDouble(infoList[7])));
            }
        } catch (IOException e) {
            System.out.println("Something when wrong when loading the vehicle, please contact a dev to fix this");
        }

        return invList;
    }

    public void saveDealership(String dealership) {

    }

}
