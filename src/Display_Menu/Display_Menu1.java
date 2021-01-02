package Display_Menu;

import DataStore.DataStore;


public class Display_Menu1 extends Display_Menu {

    @Override
    public void DisplayMenu(DataStore d) {
        //It will just display money received message as we have only multiple options to select gas type
        System.out.println("Money Received !..");
        System.out.println("Press (7) to Start the Pump");
        System.out.println("If you want to cancel, Press (4) to cancel process");
    }
}
