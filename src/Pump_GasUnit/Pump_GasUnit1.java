package Pump_GasUnit;

import DataStore.DataStore;

public class Pump_GasUnit1 extends Pump_GasUnit {

    @Override
    public void PumpGasUnit(DataStore d) {
        //It will increase the value of L by 1 (i.e., number of liters pumped by 1) and also add the price of gas to the total amount.
        // TODO Auto-generated method stub
        d.setL(d.getL()+1);
        d.setTotal(d.getPrice() * d.getL());
    }
    
}
