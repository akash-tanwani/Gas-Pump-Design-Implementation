package AbstractFactory;

import Display_Menu.Display_Menu;
import Eject_Card.Eject_Card;
import EnterPin_Msg.EnterPin_Msg;
import GasPumped_Msg.GasPumped_Msg;
import Initialize_Data.Initialize_Data;
import Pay_Msg.Pay_Msg;
import Print_Receipt.Print_Receipt;
import Pump_GasUnit.Pump_GasUnit;
import Reject_Msg.Reject_Msg;
import Return_Cash.Return_Cash;
import Set_InitialValues.Set_InitialValues;
import Set_Price.Set_Price;
import Set_W.Set_W;
import Store_Cash.Store_Cash;
import Store_Pin.Store_Pin;
import Store_Prices.Store_Prices;
import WrongPin_Msg.WrongPin_Msg;
import Cancel_Msg.Cancel_Msg;

/* 
 * This class group both Concretefactory1 and Concretefactory2 classes.
 * This class is Abstract class.
 * This class defined methods that need to implement by Concretefatory1 and concretefactory2 and
 *  return gasPump specific components.
 *  OP class have object of this class as it help this class to connect with all action of gasPump_1 and gasPump_2.
 *  */

public abstract class AbstractFactory {

    public abstract Store_Prices CreateStorePrices();
    public abstract Pay_Msg CreatePayMsg();
    public abstract Store_Cash CreateStoreCash();
    public abstract Display_Menu CreateDisplayMenu();
    public abstract Reject_Msg CreateRejectMsg();
    public abstract Set_Price CreateSetPrice();
    public abstract Set_InitialValues CreateSetInitialValues();
    public abstract Pump_GasUnit CreatePumpGasUnit();
    public abstract GasPumped_Msg CreateGasPumpedMsg();
    public abstract Print_Receipt CreatePrintReceipt();
    public abstract Cancel_Msg CreateCancelMsg();
    public abstract Return_Cash CreateReturnCash();
    public abstract Store_Pin CreateStorePin();
    public abstract EnterPin_Msg CreateEnterPinMsg();
    public abstract WrongPin_Msg CreateWrongPinMsg();
    public abstract Initialize_Data CreateInitializeData();
    public abstract Set_W CreateSetW();
    public abstract Eject_Card CreateEjectCard();


}