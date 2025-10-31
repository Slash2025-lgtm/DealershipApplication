package com.pluralsight.dataholders;

import java.io.*;
import java.util.ArrayList;

public class DealershipFileManager {
    public static final String fileName = "src/main/resources/inventory.csv";

    public ArrayList<Dealership> getDealership() {
        ArrayList<Dealership> invList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
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

    public void saveDealership(Dealership dealership) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName, false));
            bufWriter.write(String.format("%s|%s|s", dealership.getName(), dealership.getAddress(), dealership.getPhone()));
            bufWriter.newLine();

            for (Vehicle v: dealership.getAllVehicles()) {
                bufWriter.write(String.format("%d|%d|%s|%s|%s|%s|%d|%.2f", v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getMileage(), v.getPrice()));
                bufWriter.newLine();
            }

            bufWriter.close(); //Saves file
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
