package Pump_GasUnit;

import DataStore.DataStore;

public class Pump_GasUnit2 extends Pump_GasUnit {

    @Override
    public void PumpGasUnit(DataStore d) {
        // TODO Auto-generated method stub
        //It will increase the value of G by 1 (i.e., number of Gallons pumped by 1) and also add the price of 1 gallon of selected gas to the total amount.
        d.setG(d.getG()+1);
        d.setFloatTotal(d.getFloatPrice() * d.getG());
    }
    
}
