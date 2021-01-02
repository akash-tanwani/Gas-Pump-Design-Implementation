package Pump_GasUnit;

import DataStore.DataStore;
/*
*This class is the parent abstract class for Pump Gas Unit action strategy.
*The classes implementing this class will be having definition of the class
*This class have one method to perform the action that will take a datastore object as an argument

 */
public abstract class Pump_GasUnit {
    public abstract void PumpGasUnit(DataStore d);
    
}
