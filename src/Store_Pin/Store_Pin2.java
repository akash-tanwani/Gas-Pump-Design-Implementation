package Store_Pin;

import DataStore.DataStore;
/*
It will store the Pin into DS_2 class just in case user selected debit card payment option.
 */
public class Store_Pin2 extends Store_Pin {

    @Override
    public void StorePin(DataStore d) {
        // TODO Auto-generated method stub
            d.setPin(d.getTemp_p());
    }
    
}
