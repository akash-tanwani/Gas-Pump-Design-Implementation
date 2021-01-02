package Cancel_Msg;

import DataStore.DataStore;

// cancel message action  to print cancel message for gasPump_1

public class Cancel_Msg1 extends Cancel_Msg{

    public void CancelMsg(DataStore d)
    {
        System.out.println("Cancelling transaction."); // print cancel message
        System.out.println("Please choose (1) Start for start processing again"); // Print some user instruction

    }
    
}
