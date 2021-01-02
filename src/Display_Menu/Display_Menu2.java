package Display_Menu;

import DataStore.DataStore;
/*
 * This class uses DS_2 class and fetch stored data for showing detail like price of Diesel, regular,super gasoline.
 */

public class Display_Menu2 extends Display_Menu{

    @Override
    public void DisplayMenu(DataStore d)
	 {
        System.out.println("Please select gas type by pressing number given below: ");
        System.out.println("\tPress (8) for Diesel Gas { Price of Diesel  Gas [$" + d.getDprice() + "/Gallon] }" +
                        "\n\tPress (9) for Regular Gas { Price of Regular Gas [$" + d.getRprice() + "/Gallon] }" +
                        "\n\tPress (10) for Super Gas { Price of Super Gas [$" + d.getSprice() + "/Gallon] }");
        
        System.out.println("\n\tPress (4) to cancel the process \n");
	    }
    
}
