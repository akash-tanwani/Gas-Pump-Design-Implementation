package Store_Pin;

import DataStore.DataStore;
/*
This class is the parent abstract class for Store Pin action strategy.
The classes implementing this class will be having definition of the class
This class have one method to perform the action that will take a datastore object as an argument

 */
public abstract class Store_Pin {

    public abstract void StorePin(DataStore d);
    
}
