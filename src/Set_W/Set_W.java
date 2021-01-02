package Set_W;

import DataStore.DataStore;
/*
This class is the parent abstract class for Set W action strategy.
The classes implementing this class will be having definition of the class
This class have one method to perform the action that will take a datastore object and type of payment as an argument

 */
public abstract class Set_W {
    
    public abstract void SetW(DataStore d, int i);
}
