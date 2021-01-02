package Store_Cash;

import DataStore.DataStore;

public class Store_Cash1 extends Store_Cash{

    public void StoreCash (DataStore d) 
    {
        d.setCash(d.getTemp_c());// store the cash in cash variable of DS_1 class
        System.out.println("Amount of cash inserted: $" + d.getCash());
    }
    
}
