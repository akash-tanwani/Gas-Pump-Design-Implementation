package Initialize_Data;

import DataStore.DataStore;
/*
 * This Class will will reset the value of price to 0 for DS_2 class
 */
public class Initialize_Data2 extends Initialize_Data {

    @Override
    public void InitializeData(DataStore d) {
        // TODO Auto-generated method stub
        d.setFloatPrice(0);
    }
    
}
