package EnterPin_Msg;

import DataStore.DataStore;

/*
 * EnterPin_Msg Class
 * This class represents the meta action of Enter Pin Message
 * This is a parent abstract class having one abstract method of EnterPinMsg()
 * The child classes will be having different implementations or versions of this action
 */

public abstract class EnterPin_Msg {
    public abstract void EnterPinMsg(DataStore d); 
}
