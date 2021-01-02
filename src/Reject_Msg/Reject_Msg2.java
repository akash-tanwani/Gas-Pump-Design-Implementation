package Reject_Msg;

import DataStore.DataStore;

public class Reject_Msg2 extends Reject_Msg{
    public void RejectMsg(DataStore d)
    {//This will display Credit card rejected and cancelling transaction message.
    System.out.println("CREDIT CARD REJECTED!!!!");
    System.out.println("Cancelling transaction.");
    System.out.println("Please choose (1) Start for start processing again"); // Print some user instruction
    }
    
}
