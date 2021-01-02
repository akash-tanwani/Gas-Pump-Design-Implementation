package Set_InitialValues;

import DataStore.DataStore;

public class Set_InitialValues1 extends Set_InitialValues {

    @Override
    public void SetInitialValues(DataStore d) {
        //This will set the value of Liters pumped to zero and total bill amount to zero as well.
        d.setL(0);
        d.setTotal(0);
        System.out.println("Pump Started!!");
        System.out.println("######################################################################");
        System.out.println("ARE YOU READY TO DISPENSE FUEL?");
        System.out.println("######################################################################");
        System.out.println("Press (8) to dispense 1 Liter of gasoline");
        System.out.println("If you want to stop the pump, Press (9) to stop");
    }
    
}
