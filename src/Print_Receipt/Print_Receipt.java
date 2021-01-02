package Print_Receipt;

import DataStore.DataStore;
/*
 * Print_Receipt Class
 * This class represents the meta action of Payment Receipt
 * This is a parent abstract class having one abstract method of Print_Receipt()
 * The child classes will be having different implementations or versions of this action based on what what kind of gasoline is available on gaspump
 */
public abstract class Print_Receipt {
    public abstract void PrintReceipt(DataStore d);
    
}
