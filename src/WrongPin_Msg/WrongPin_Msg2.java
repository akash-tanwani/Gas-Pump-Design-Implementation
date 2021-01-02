package WrongPin_Msg;
import DataStore.DataStore;
/*
It will display the Wrong Pin message just in case user selected debit card payment option and enters the wrong pin.
 */
public class WrongPin_Msg2 extends WrongPin_Msg{

    @Override
    public void WrongPinMsg(DataStore d) {
        // TODO Auto-generated method stub
        System.out.println("You Entered Wrong Pin!...");

    }
    
}
