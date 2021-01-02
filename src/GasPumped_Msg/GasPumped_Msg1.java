package GasPumped_Msg;

import DataStore.DataStore;

/*
 * This method showing detail message about total no. of Liters pumped by fetching data from DS_1 class .
 */

public class GasPumped_Msg1 extends GasPumped_Msg{

    @Override
    public void GasPumpedMsg(DataStore d) {
        // TODO Auto-generated method stub
        System.out.println("Pumped 1 Liter of gasoline ");
        System.out.println("Total NO. of Liter's pumped is: " + d.getL());
        System.out.println("\tPress (8) for continue pumping \n\tPress (9) for stop pumping");
    }
    
}
