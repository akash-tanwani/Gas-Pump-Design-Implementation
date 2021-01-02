package Store_Cash;

import DataStore.DataStore;

public class Store_Cash2 extends Store_Cash {

	@Override
	public void StoreCash(DataStore d) {
		//display erroe message as cash payment is not available for GasPump_2
		System.out.println("Can not Store Cash as this cash payment option is not available");

	}
    
}
