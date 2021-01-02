package AbstractFactory;

import Display_Menu.*;
import Eject_Card.*;
import EnterPin_Msg.*;
import GasPumped_Msg.*;
import Initialize_Data.*;
import Pay_Msg.*;
import Print_Receipt.*;
import Pump_GasUnit.*;
import Reject_Msg.*;
import Return_Cash.*;
import Set_InitialValues.*;
import Set_Price.*;
import Set_W.*;
import Store_Cash.*;
import Store_Pin.*;
import Store_Prices.*;
import WrongPin_Msg.*;
import Cancel_Msg.*;

/*
 * ConcreteFactory_2
 * Concrete Factory 2
 * Child of Abstract Factory
 * This will create required Output Class objects to use Gas Pump2
 *
 */

public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public Store_Prices CreateStorePrices() {
        // Create and returns object of storePrices_2 class that will store data as per user input for GasPump_2
        return new Store_Prices2();
    }
    
    @Override
    public Pay_Msg CreatePayMsg(){
        // Create and returns object of Pay_Msg2 class that will display different payment methods available for GasPump_2
        return new Pay_Msg2();
    }
    
    @Override
    public Store_Cash CreateStoreCash(){
        //this will not return anything as we don't have option of cash payment for GasPump_2
        return new Store_Cash2();
    }
    
    @Override
    public  Display_Menu CreateDisplayMenu(){
        // Create and returns object of Display_Menu2 class that will display different kinds of gas types available for GasPump_2
	    return new Display_Menu2(); 
	}
    
    @Override
    public Reject_Msg CreateRejectMsg(){
        //Create and returns object of Reject_Msg2 class to display rejected message of credit card transaction for GasPump_2
        return new Reject_Msg2();
    }
    
    @Override
    public Set_Price CreateSetPrice(){
        // Create and returns object of Set_Price2 class that will set the value of price based on the gas type selected by the user for GasPump_2
        return new Set_Price2();
    }
    
    @Override
    public Set_InitialValues CreateSetInitialValues(){
        //Creates object of Set_InitialValues2 class that will set the total price and number of Gallons pumped to 0 for GasPump_2
        return new Set_InitialValues2();
    }
    
    @Override
    public Pump_GasUnit CreatePumpGasUnit(){
        // Create and returns object of Pump_GasUnit2 class that returns total unit of gas pumped for GasPump_2
        return new Pump_GasUnit2();
    }
    
    @Override
    public GasPumped_Msg CreateGasPumpedMsg(){
        // Creates and return object of GasPumped_Msg2 class that displays number of gallons gas pumped for GasPump_2
        return new GasPumped_Msg2();
    }
    
    @Override
    public Print_Receipt CreatePrintReceipt(){
        // Create and return object of class Print_Receipt2 class that will display the total bill of the transaction along with number of gallons gas pumped for GasPump_2
        return new Print_Receipt2();
    }

    @Override
    public Cancel_Msg CreateCancelMsg()
    {
        // Create and returns the object of Cancel_Msg2 class that will cancel the current transaction and displays the same for GasPump_2
        return new Cancel_Msg2();
    }
    
    @Override
    public Return_Cash CreateReturnCash(){
        //this will not return anything as we don't have cash payment option for GasPump_2
        return new Return_Cash2();
    }

    @Override
    public WrongPin_Msg CreateWrongPinMsg(){
        // Creates and return object of class WrongPin_Msg1 to display the wrong pin message in case when user selects debit card payment option for GasPump_1
        return new WrongPin_Msg2();
    }
    
    
    @Override
    public Store_Pin CreateStorePin(){
        // Creates and return object of Store_Pin2 class that will store the pin in case of debit card payment for GasPump_2
        return new Store_Pin2();
    }
    
    @Override
    public EnterPin_Msg CreateEnterPinMsg(){
        // Creates and return object of class EnterPin_Msg2 that will ask the user to enter the pin for authentication for GasPump_2
        return new EnterPin_Msg2();
    }
    
    @Override
    public Initialize_Data CreateInitializeData(){
        // Creates and return object of class Initialize_Data2 that will set the value of price to 0
        return new Initialize_Data2();
    }
    
    @Override
    public Set_W CreateSetW(){
        //this will not return anything as we don't have cash payment option for GasPump_2
        return new Set_W2();
    }
    
    @Override
    public Eject_Card CreateEjectCard(){
        // Creates and return object of Eject_Card2 class that will Display Eject Card message for any card transaction for GasPump_2
        return new Eject_Card2();
    }

    
}

    
