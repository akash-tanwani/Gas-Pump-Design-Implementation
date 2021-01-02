package Store_Prices;
/*
*This class is the parent abstract class for Store Prices action strategy.
*The classes implementing this class will be having definition of the class
*This class have one abstract method to perform the action that will take a datastore object as an argument
*/
import DataStore.DataStore;


public abstract class Store_Prices {

    public abstract void StorePrices(DataStore d);
    
}
