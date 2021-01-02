package Set_Price;

import DataStore.DataStore;
/*
*This class is the parent abstract class for Set Price action strategy.
*The classes implementing this class will be having definition of the class
*This class have one abstract method to perform the action that will take a datastore object and type of gas selected by user as an argument
* */
public abstract class Set_Price {
    public abstract void SetPrice(DataStore d, int g);
}
