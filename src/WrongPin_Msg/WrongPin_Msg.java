package WrongPin_Msg;
import DataStore.DataStore;
public abstract class WrongPin_Msg {
/*
This class is the parent abstract class for Wrong pin message action strategy.
The classes implementing this class will be having definition of the class
This class have one method to perform the action that will take a datastore object as an argument
 */
    public abstract void WrongPinMsg(DataStore d);
    
}
