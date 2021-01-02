package Return_Cash;

import DataStore.DataStore;
/*
*This class is abstract class for Return Cash action strategy.
*The classes implementing this class will be having definition of the class
*This class have one method to perform the action that will take a datastore object as an argument

 */

public abstract class Return_Cash {
    public abstract void ReturnCash(DataStore d);
    
}
