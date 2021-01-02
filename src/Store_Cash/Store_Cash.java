package Store_Cash;

import DataStore.DataStore;
/*
* This class is abstract class for Store Cash action strategy.
*The classes implementing this class will be having definition of the class
*This class have one abstract  method to perform the action that will take a datastore object as an argument
 */
public abstract class Store_Cash {
    
    public abstract void StoreCash(DataStore d);
    
}
