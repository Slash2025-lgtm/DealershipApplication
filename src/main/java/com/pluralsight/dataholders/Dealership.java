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

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();
        for (Vehicle v: inventory) {
            if (v.getMake().equalsIgnoreCase(make) || v.getModel().equalsIgnoreCase(model)) {
                filtered.add(v);
            }
        }
        return filtered;
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();
        for (Vehicle v: inventory) {
            if (v.getYear() > min && v.getYear() < max) {
                filtered.add(v);
            }
        }
        return filtered;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();
        for (Vehicle v: inventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                filtered.add(v);
            }
        }
        return filtered;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();
        for (Vehicle v: inventory) {
            if (v.getMileage() > min && v.getMileage() < max) {
                filtered.add(v);
            }
        }
        return filtered;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> filtered = new ArrayList<Vehicle>();
        for (Vehicle v: inventory) {
            if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {
                filtered.add(v);
            }
        }
        return filtered;
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

    public Vehicle getVehicleByVin(int vin) {
        Vehicle filtered = null;
        for (Vehicle v: inventory) {
            if (v.getVin() == vin) {
                filtered = v;
            }
        }
        return filtered;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void addVehicle(Vehicle v) {
        this.inventory.add(v);
    }

    public void removeVehicle(Vehicle v) {
        this.inventory.remove(v);
    }

    public String toString() {
        return name + "," + address + "," + phoneNumber;
    }
}
