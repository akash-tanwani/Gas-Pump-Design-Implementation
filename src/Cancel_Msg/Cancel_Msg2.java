package Cancel_Msg;

import DataStore.DataStore;

// cancel message action to display cancel message for  gasPump_2

public class Cancel_Msg2 extends Cancel_Msg{

    public void CancelMsg(DataStore d){
        System.out.println("Cancelling transaction."); // print cancel message
        System.out.println("Please choose (1) Start for start processing again"); // Print some user instruction

    }
    
}
