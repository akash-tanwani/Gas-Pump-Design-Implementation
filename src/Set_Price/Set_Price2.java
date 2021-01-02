package Set_Price;

import DataStore.DataStore;

public class Set_Price2 extends Set_Price {

    @Override
    public void SetPrice(DataStore d, int g) {
        // TODO Auto-generated method stub
        if (g == 3)
        {
            d.setFloatPrice(d.getDprice()); // Diesel gasoline selected

        }
        else if (g == 2)
        {
            d.setFloatPrice(d.getSprice()); // Super gasoline selected
        }
        else if (g == 1)
        {
            d.setFloatPrice(d.getRprice()); // Regular gasoline selected
        }
        System.out.println("gasoline selected at price of $" + d.getFloatPrice() + "/Gallon");
        System.out.println("Press (11) to start the pump");

    }
    
}
