package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public String name = "";
    public String address = "";
    public String phoneNumber = "";

    DealershipFileManager dealershipFileManager = new DealershipFileManager();
    Dealership dealership = new Dealership("","","");
    public UserInterface() {

    }

    private void init() {
        Scanner keyboard = new Scanner(System.in);
        String selected = keyboard.nextLine();

        switch (selected) {
            case "1":
                processGetByPriceRequest();
            case "2":
                processGetByMakeModelRequest();
            case "3":
                processGetByYearRequest();
            case "4":
                processGetByColorRequest();
            case "5":
                processGetByMileageRequest();
            case "6":
                processGetByVehicleTypeRequest();
            case "7":
                processGetAllVehiclesRequest();
            case "8":
                processAddVehicleRequest();
            case "9":
                processRemoveVehicleRequest();
        }
    }

    public void display() {
        ArrayList<Dealership> dealershipList = dealershipFileManager.getDealership();
        String[] infoHolder = String.valueOf(dealershipList.get(0)).split("[,]");
        System.out.printf("Welcome to %s located %s, call us if you have any errors at %s\n", infoHolder[0], infoHolder[1], infoHolder[2]);

        String messageStart = "] Find Vehicle by";
        System.out.println("=== Menu ===");
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

    public void processGetByPriceRequest() {
        dealerships.get
    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }
}
