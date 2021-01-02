package GasPumped_Msg;

import DataStore.DataStore;

/*
 * This method showing detail message about total no. of gallon pumped by fetching data from DS_2 class .
 */

public class GasPumped_Msg2 extends GasPumped_Msg{

    @Override
    public void GasPumpedMsg(DataStore d) {
        // TODO Auto-generated method stub

        System.out.println("Pumped 1 Gallon of gasoline ");
        System.out.println("Total NO. of Gallon's pumped is: " + d.getG());
        System.out.println("\tPress (12) for continue pumping \n\t Press (13) for stop pumping \n\t Press (14) for Fulltank");
    }
    
}
