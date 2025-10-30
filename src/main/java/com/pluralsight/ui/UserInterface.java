package com.pluralsight.ui;

import com.pluralsight.dataholders.Dealership;
import com.pluralsight.dataholders.DealershipFileManager;
import com.pluralsight.dataholders.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public String name = "";
    public String address = "";
    public String phoneNumber = "";

    DealershipFileManager dealershipFileManager = new DealershipFileManager();
    Dealership dealership = new Dealership(name, address, phoneNumber);

    List<Vehicle> vehicles = dealership.getAllVehicles();

    public UserInterface() {

    }


    private void init() {
        Scanner keyboard = new Scanner(System.in);
        String selected = keyboard.nextLine();

        switch (selected) {
            case "1" -> processGetByPriceRequest();
            case "2" -> processGetByMakeModelRequest();
            case "3" -> processGetByYearRequest();
            case "4" -> processGetByColorRequest();
            case "5" -> processGetByMileageRequest();
            case "6" -> processGetByVehicleTypeRequest();
            case "7" -> processGetAllVehiclesRequest();
            case "8" -> processAddVehicleRequest();
            case "9" -> processRemoveVehicleRequest();
        }
    }

    public int check = 0;

    public void display() {
        if (check == 0) {
            ArrayList<Dealership> dealershipList = dealershipFileManager.getDealership();
            String[] infoHolder = String.valueOf(dealershipList.get(0)).split("[,]");
            name = infoHolder[0];
            address = infoHolder[1];
            phoneNumber = infoHolder[2];

            System.out.printf("Welcome to %s located %s, call us if you have any errors at %s\n", name, address, phoneNumber);

            check ++;
        }

        String messageStart = "] Find Vehicle by";
        System.out.println("=============== Menu ===============");
        System.out.println("\t[1" + messageStart + " Price");
        System.out.println("\t[2" + messageStart + " Make Model");
        System.out.println("\t[3" + messageStart + " Year");
        System.out.println("\t[4" + messageStart + " Color");
        System.out.println("\t[5" + messageStart + " Mileage");
        System.out.println("\t[6" + messageStart + " Type");
        System.out.println("\t[7] See All Vehicles");
        System.out.println("\t[8] Add Vehicle");
        System.out.println("\t[9] Remove Vehicle");
        System.out.print("Please enter one of the options above: ");
        init();

    }

    private void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetByPriceRequest() {
        System.out.print("Please Enter the lowest Price for your vehicle: ");
        String answer1 = getScanner().nextLine();
        int lowest = Integer.parseInt(answer1);

        System.out.print("Please Enter the highest Price for your vehicle: ");
        String answer2 = getScanner().nextLine();
        int highest = Integer.parseInt(answer2);

        messageFormat("Vehicles with price from " + lowest + " to " + highest);

        boolean found = false;
        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getPrice() >= lowest && vehicle.getPrice() <= highest) {
                    System.out.println(vehicle);
                    found = true;
                }
            }
        }
        notFound(found);
    }

    public void processGetByMakeModelRequest() {
        System.out.print("Please Enter the Make Model you are look for: ");
        String makeModel = getScanner().nextLine();

        messageFormat("Vehicles that are " + makeModel.toLowerCase());

        boolean found = false;

        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getMake().equalsIgnoreCase(makeModel)) {
                    System.out.println(vehicle);
                    found = true;

                }
            }
        }
        notFound(found);
    }

    public void processGetByYearRequest() {
        System.out.print("Please Enter the the year for your vehicle: ");
        String year = getScanner().nextLine();
        int seachedYear = Integer.parseInt(year);

        messageFormat("Vehicles in the year of " + year);

        boolean found = false;
        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getYear() == seachedYear) {
                    System.out.println(vehicle);
                    found = true;
                }
            }
        }
        notFound(found);
    }

    public void processGetByColorRequest() {
        System.out.print("Please Enter the color you are look for: ");
        String color = getScanner().nextLine();

        messageFormat("Vehicles that are " + color.toLowerCase());

        boolean found = false;

        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getColor().equalsIgnoreCase(color)) {
                    System.out.println(vehicle);
                    found = true;
                }
            }
        }
        notFound(found);
    }

    public void processGetByMileageRequest() {
        System.out.print("Please Enter the lowest Mileage for your vehicle: ");
        String answer1 = getScanner().nextLine();
        int lowest = Integer.parseInt(answer1);

        System.out.print("Please Enter the highest Mileage for your vehicle: ");
        String answer2 = getScanner().nextLine();
        int highest = Integer.parseInt(answer2);

        messageFormat("Vehicles with miles ranging from " + lowest + " to " + highest);

        boolean found = false;
        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getMileage() >= lowest && vehicle.getMileage() <= highest) {
                    System.out.println(vehicle);
                    found = true;
                }
            }
        }
        notFound(found);
    }

    public void processGetByVehicleTypeRequest() {
        System.out.print("Please Enter the Vehicle Type you are look for: ");
        String vehicleType = getScanner().nextLine();

        messageFormat("Vehicles that are " + vehicleType.toLowerCase());

        boolean found = false;

        if (vehicles.isEmpty()) {
            System.out.println("Error");
        } else {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                    System.out.println(vehicle);
                    found = true;
                }
            }
        }
        notFound(found);
    }

    public void processGetAllVehiclesRequest() {
        messageFormat("All Vehicles");
        displayVehicles();
    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }
    public void messageFormat(String heading) {
        System.out.println("\n=============== " + heading + " ===============");
    }

    public Scanner getScanner() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard;
    }

    public void notFound(boolean type) {
        if (!type) {
            System.out.print("Searched but not found... please click Enter to continue...");
            getScanner().nextLine();
            System.out.println();
        }
    }
}
