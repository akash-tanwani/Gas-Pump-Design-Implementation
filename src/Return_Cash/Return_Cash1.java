package Return_Cash;

import DataStore.DataStore;

/*
 * It will return the cash just in case user will cancel the transaction. It will display the returning amount.
 */

public class Return_Cash1 extends Return_Cash{
    
    public void ReturnCash(DataStore d) 
	{
	    if(d.getW()==0)
        {
            System.out.println("Returning amount of  $" + d.getCash());
        }
    }
    
}
