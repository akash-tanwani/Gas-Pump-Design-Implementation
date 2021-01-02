package Reject_Msg;

import DataStore.DataStore;
/*
*This class is abstract class for Reject message action strategy.
*The classes implementing this class will be having definition of the class
*This class have one abstract method to perform the action that will take a datastore object as an argument
*/
public abstract class Reject_Msg {
    
    public abstract void RejectMsg(DataStore d);
}
