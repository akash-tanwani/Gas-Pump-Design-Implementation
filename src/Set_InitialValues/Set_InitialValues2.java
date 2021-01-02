package Set_InitialValues;

import DataStore.DataStore;

public class Set_InitialValues2 extends Set_InitialValues {

    @Override
    public void SetInitialValues(DataStore d) {
        // TODO Auto-generated method stub
        //This will set the value of Gallons pumped to zero and total bill amount to zero as well.
        d.setG(0);
        d.setFloatTotal(0);
        System.out.println("Pump Started!!");
        System.out.println("######################################################################");
        System.out.println("ARE YOU READY TO DISPENSE FUEL?");
        System.out.println("######################################################################");
        System.out.println("Press (12) to dispense 1 Liter of gasoline");
        System.out.println("If you want to stop the pump, Press (13) to stop");

    }
    
}
