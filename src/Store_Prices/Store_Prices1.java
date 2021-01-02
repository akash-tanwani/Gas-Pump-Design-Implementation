package Store_Prices;

import DataStore.DataStore;
/*
 * Store price of types of gasoline in DS_1 class for future use.
 */
public class Store_Prices1 extends Store_Prices {

    @Override
    public void StorePrices(DataStore d) {
        //This will set the value of price using DS_1 class as we have only one type of gas available for GasPump_1
        d.setPrice(d.getTemp_a());
        System.out.println("Gaspump1 Activated");
	    System.out.println("\n\tPress (1) to start the pump");

    }
    
}
