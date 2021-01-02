package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import GasPump.*;

public class Driver {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\nSelect type of GasPump: ");
        System.out.println("1. GasPump1");
        System.out.println("2. GasPump2");
        System.out.print("> ");

        int pump_type;
        String input = "initial";
        try {
            pump_type = Integer.parseInt(scan.readLine()); // read input from user
            /*
             * Below we check condition which help us to ask user again and again until user
             * entered output 0 or 1 to start the program.
             */
            do {
                System.out.println("you selected gaspump: " + pump_type);
                if (pump_type != 1 && pump_type != 2) {
                    System.out.println("Invalid Input!");
                    System.out.println("please Select GasPump (1) or (2) ");
                    System.out.println("Press (1) for  GasPump1");
                    System.out.println("Press (2) for  GasPump2");
                    System.out.print("> ");
                    pump_type = Integer.parseInt(scan.readLine());
                }
            } while (pump_type != 1 && pump_type != 2);
            System.out.println("Thanks for Choosing right Option!");
            System.out.println("you selected gaspump: " + pump_type);
            switch (pump_type) {
                case 1: {
                    GasPump_1 gp1 = new GasPump_1(); // Create Gspump_1 object as user select 1 .
                    System.out.println("\n-----------------------------------"
                            + "\nMENU of Operations for GasPump-1: "
                            + "\n-----------------------------------"
                            + "\n(0) Activate(int a) " 
                            + "\n(1) Start "
                            + "\n(2) PayCredit " 
                            + "\n(3) Reject" 
                            + "\n(4) Cancel " 
                            + "\n(5) Approved "
                            + "\n(6) PayCash" 
                            + "\n(7) StartPump " 
                            + "\n(8) PumpLiter " 
                            + "\n(9) StopPump"
                            + "\n{q} Quit the program" + "\n-----------------------------------");
                    while (!input.equals("q")) {
                        gp1.print_Operations();
                        input = scan.readLine(); // read user input and perform operation as per case stated below.
                        switch (input) {
                            case "0": // if user press 0 then we read user's input and call activate method of
                                      // gaspump_1.
                            {
                                int a;
                                System.out.println("Enter the price of Gas: ");
                                try {
                                    a = Integer.parseInt(scan.readLine());
                                    gp1.Activate(a);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be an integer.");
                                }
                                break;
                            }
                            case "1": // if user press 1 then call start method of gaspump_1.
                            {
                                gp1.Start();
                                break;
                            }
                            case "2": // if user press 2 then call payCredit method of gaspump_1.
                            {
                                gp1.PayCredit();
                                break;
                            }

                            case "3": // if user press 4 then call Reject method of gaspump_1.
                            {
                                gp1.Reject();
                                break;
                            }
                            case "4": // if user press 4 then call Reject method of gaspump_1.
                            {
                                gp1.Cancel();
                                break;
                            }
                            case "5": // if user press 3 then call Approve method of gaspump_1.
                            {
                                gp1.Approved();
                                break;
                            }
                            case "6": // if user press 5 then call Regular method of gaspump_1.
                            {
                                float c;
                                System.out.println("Enter cash (enter $ amount):");
                                try {
                                    c = Float.parseFloat(scan.readLine());
                                    gp1.PayCash(c);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be an integer.");
                                }
                                break;
                            }
                            case "7": // if user press 8 then call StartPump method of gaspump_1.
                            {
                                gp1.StartPump();
                                break;
                            }
                            case "8": // if user press 9 then call Pumpgallon method of gaspump_1.
                            {
                                gp1.PumpLiter();
                                break;
                            }
                            case "9": // if user press 9 then call Pumpgallon method of gaspump_1.
                            {
                                gp1.StopPump();
                                break;
                            }
                            case "q": // if user press 'q' then break from here.
                            {
                                break;
                            }
                            default: {
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please select a valid operation");
                                break;
                            }
                        }
                    } // End while loop
                    System.out.println("Quitting ...");
                    break;
                } // End pump_type = 1 case
                case 2: {
                    GasPump_2 gp2 = new GasPump_2(); // Create Gspump_2 object as user select 2
                    System.out.println("\n-----------------------------------" + "\nMENU of Operations for GasPump-2: "
                            + "\n-----------------------------------"
                            + "\n(0) Activate (float a, float b, float c)"
                            + "\n(1) Start" 
                            + "\n(2) PayCredit " 
                            + "\n(3) Reject "
                            + "\n(4) Cancel"
                            + "\n(5) Approved"
                            + "\n(6) PayDebit"
                            + "\n(7) Pin"
                            + "\n(8) Diesel " 
                            + "\n(9) Regular" 
                            + "\n(10) Super "
                            + "\n(11) StartPump" 
                            + "\n(12) PumpGallon" 
                            + "\n(13) StopPump" 
                            + "\n(14) FullTank "
                            + "\n(q) Quit the program" + "\n-----------------------------------");
                    while (!input.equals("q")) {
                        gp2.print_Operations();
                        input = scan.readLine(); // read user input and perform operation as per case stated below.
                        switch (input) {
                            case "0":// if user press 0 then we read user's input and call activate method of
                                     // gaspump_2.
                            {
                                float a, b, c;
                                System.out.println("Enter the price of Regular Gas: ");
                                try {
                                    a = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price of Super Gas: ");
                                    b = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price of Diesel Gas: ");
                                    c = Float.parseFloat(scan.readLine());
                                    gp2.Activate(a, b, c);
                                } catch (NumberFormatException e) {
                                    System.out.println("Type mismatch. Price must be an integer.");
                                }
                                break;
                            }
                            case "1": // if user press 1 then call start method of gaspump_2.
                            {
                                gp2.Start();
                                break;
                            }
                            case "2": // if user press 2 then call payCredit method of gaspump_1.
                            {
                                gp2.PayCredit();
                                break;
                            }

                            case "3": // if user press 4 then call Reject method of gaspump_1.
                            {
                                gp2.Reject();
                                break;
                            }

                            case "4": // if user press 4 then call Reject method of gaspump_1.
                            {
                                gp2.Cancel();
                                break;
                            }
                            case "5": // if user press 3 then call Approve method of gaspump_1.
                            {
                                gp2.Approved();
                                break;
                            }

                            case "6": // if user press 2 then call payCash method of gaspump_2.
                            {
                                String p;
                                System.out.println("Enter the Pin parameter p: ");
                                p = scan.readLine();
                                gp2.PayDebit(p);
                                break;
                            }
                            case "7": // if user press 2 then call payCash method of gaspump_2.
                            {
                                String x;
                                System.out.println("Enter the Pin: ");
                                x = scan.readLine();
                                gp2.Pin(x);
                                break;
                            }

                            case "8": // if user press 3 then call Regular method of gaspump_2.
                            {
                                System.out.println(" Diesel Gas Selected");
                                gp2.Diesel();
                                break;
                            }
                            case "9": // if user press 5 then call Premium method of gaspump_2.
                            {
                                System.out.println(" Regular Gas Selected");
                                gp2.Regular();
                                break;
                            }
                            case "10": // if user press 4 then call super method of gaspump_2.
                            {
                                System.out.println(" Super Gas Selected");
                                gp2.Super();
                                break;
                            }

                            case "11": // if user press 7 then call StartPump method of gaspump_2.
                            {
                                gp2.StartPump();
                                break;
                            }
                            case "12": // if user press 8 then call PumpLiter method of gaspump_2.
                            {
                                gp2.PumpGallon();
                                break;
                            }
                            case "13": // if user press 9 then call stop method of gaspump_2.
                            {
                                gp2.StopPump();
                                break;
                            }
                            case "14": // if user press 9 then call stop method of gaspump_2.
                            {
                                gp2.FullTank();
                                break;
                            }
                            case "q": // If user press 'q' break the program here.
                            {
                                break;
                            }
                            default: {
                                System.out.println("Unknown operation: '" + input + "'");
                                System.out.println("Please enter a valid operation");
                                break;
                            }
                        }
                    } // End while loop
                    System.out.println("Quitting ...");
                    break;
                } // end pump_type = 2 case
                default: {
                    System.out.println("Unknown GasPump selection. Terminating ...");

                }
            }
        } catch (IOException ioe) {
            System.out.println("IO Error. Terminating ...");
            System.exit(1);
        }
        
    }
}
