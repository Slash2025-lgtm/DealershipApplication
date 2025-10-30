package com.pluralsight.dataholders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name, address, phoneNumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public List<Vehicle> getVehicleByPrice(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehicleByMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehicleByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehicleByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle>  getVehicleByType(String vehicleType) {
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> invList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine();
            String input;
            while ((input = bufReader.readLine()) != null) {
                String[] infoList = input.split("[|]");
                invList.add(new Vehicle(Integer.parseInt(infoList[0]), Integer.parseInt(infoList[1]), infoList[2], infoList[3], infoList[4], infoList[5], Integer.parseInt(infoList[6]), Double.parseDouble(infoList[7])));
            }
        } catch (IOException e) {
            System.out.println("Something when wrong when loading the vehicle, please contact a dev to fix this");
        }

        return invList;
    }

    public void addVehicle() {

    }

    public void removeVehicle() {

    }

    public String toString() {
        return name + "," + address + "," + phoneNumber;
    }
}
