package Set_InitialValues;

import DataStore.DataStore;
/*
*This class is the parent abstract class for Setting Initial Values action strategy.
*The classes implementing this class will be having definition of the class
*This class have one method to perform the action that will take a datastore object as an argument
 */
public abstract class Set_InitialValues {
    public abstract void SetInitialValues(DataStore d);
    
}
