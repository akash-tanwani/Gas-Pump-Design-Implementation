package Cancel_Msg;
import DataStore.DataStore;
/*
 * This class is abstract class for cancel message action strategy.
 * The classes implementing this class will
 * be having definition of the class
 * This class have one method to perform the action that will take a datastore object as an argument
 */
public abstract class Cancel_Msg {
    public abstract void CancelMsg(DataStore d);
}
