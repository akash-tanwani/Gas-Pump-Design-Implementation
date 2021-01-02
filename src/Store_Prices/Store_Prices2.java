package Store_Prices;

import DataStore.DataStore;
/*
 * Store price of types of gasoline in DS_2 class for future use.
 */
public class Store_Prices2 extends Store_Prices{

    public void StorePrices(DataStore d) 
	 {
	 	//This will store the prices for diesel, regular and super gasoline in DS_2 class.
	 	 d.setRprice(d.getFloatTemp_a()); // Store price of regular gasoline
		 d.setSprice(d.getFloatTemp_b());// Store price of Super gasoline
		 d.setDprice(d.getFloatTemp_c());// Store price of Diesel gasoline
		 System.out.println("Gaspump2 Activated");
		 System.out.println("\n\t Press (1) to start the pump");
	        
     }
    
}
