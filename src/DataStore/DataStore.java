package DataStore;

/*
 * DataStore
 * DataStore class is used to store data
 * This is a parent DataStore class
 * This will have list of all methods that are defined in both data stores
 * just the null definition. this will not have an impact
 * This class is connected to GasPump_1, GasPump_2 and OP
 * THe child DataStore Classes are connected to Child abstract factory classes according to the version
 */
 
public class DataStore {

    /*
     * Methods for DATA STORE 1
     *
     */

    public float getCash() { // this method is just parent definition for child class, it does nothing here but it will get value of cash variable, return type float
        return 0;
    }

    public void setCash(float cash) {// this method is just parent definition for child class, it does nothing here but it will set value of cash variables, type float
    }

    public int getTotal() {// this method is just parent definition for child class, it does nothing here but it will get value of total variables, return type int
        return 0;
    }

    public void setTotal(int total) {// this method is just parent definition for child class, it does nothing here but it will set value of total variables, type int
    }

    public int getL() {// this method is just parent definition for child class, it does nothing here but it will get value of L variable(i.e, number ot liters pumped), return type int
        return 0;
    }

    public void setL(int l) {// this method is just parent definition for child class, it does nothing here but it will set value of L variableL variable(i.e, number ot liters pumped), type int
    }

    public int getPrice() {// this method is just parent definition for child class, it does nothing here but it will get value of price variables, return type int
        return 0;
    }

    public void setPrice(int price) {// this method is just parent definition for child class, it does nothing here but it will set value of price variables, type int
    }

    public int getW() {// this method is just parent definition for child class, it does nothing here but it will get value of W variable(i.e, to check the payment type is cash or card), return type int
        return 0;
    }

    public void setW(int w) {// this method is just parent definition for child class, it does nothing here but it will set value of W variable(i.e, to check the payment type is cash or card), type int
    }

    public int getTemp_a() {// this method is just parent definition for child class, it does nothing here but it will get value of temp_a variables, return type int
        return 0;
    }

    public void setTemp_a(int temp_a) {// this method is just parent definition for child class, it does nothing here but it will set value of temp_a variables, type int
    }

    public float getTemp_c() {// this method is just parent definition for child class, it does nothing here but it will get value of temp_c variables, return type float
        return 0;
    }

    public void setTemp_c(float temp_a) {// this method is just parent definition for child class, it does nothing here but it will set value of temp_c variables, type float
    }

    /*
     * Methods for DATA STORE 2
     *
     */

    public String getPin() {// this method is just parent definition for child class, it does nothing here but it will get value of Pin variables, return type String
        return "";
    }

    public void setPin(String pin) {// this method is just parent definition for child class, it does nothing here but it will set value of Pin variables, type String
    }

    public float getFloatPrice() {// this method is just parent definition for child class, it does nothing here but it will get value of price variables, return type float
        return 0;
    }

    public void setFloatPrice(float price) {// this method is just parent definition for child class, it does nothing here but it will set value of price variables, type float
    }

    public int getG() {// this method is just parent definition for child class, it does nothing here but it will get value of G variable(i.e, number ot Gallons pumped), return type int
        return 0;
    }

    public void setG(int g) {// this method is just parent definition for child class, it does nothing here but it will set value of G variable(i.e, number ot Gallons pumped), type int
    }

    public float getFloatTotal() {// this method is just parent definition for child class, it does nothing here but it will get value of total variables, return type float
        return 0;
    }

    public void setFloatTotal(float total) {// this method is just parent definition for child class, it does nothing here but it will set value of total variables, type float
    }

    public float getRprice() {// this method is just parent definition for child class, it does nothing here but it will get value of RPrice variable, return type float
        return 0;
    }

    public void setRprice(float rprice) {// this method is just parent definition for child class, it does nothing here but it will set value of RPrice variables, type float
    }

    public float getDprice() {// this method is just parent definition for child class, it does nothing here but it will get value of DPrice variables, return type float
        return 0;
    }

    public void setDprice(float dprice) {// this method is just parent definition for child class, it does nothing here but it will set value of DPrice variables, type float
    }

    public float getSprice() {// this method is just parent definition for child class, it does nothing here but it will get value of SPrice variables, return type float
        return 0;
    }

    public void setSprice(float sprice) {// this method is just parent definition for child class, it does nothing here but it will set value of SPrice variables, type float
    }

    public float getFloatTemp_a() {// this method is just parent definition for child class, it does nothing here but it will get value of temp_a variables, return type float
        return 0;
    }

    public void setFloatTemp_a(float temp_a) {// this method is just parent definition for child class, it does nothing here but it will set value of temp_a variables, type float
    }

    public float getFloatTemp_b() {// this method is just parent definition for child class, it does nothing here but it will get value of temp_b variables, return type float
        return 0;
    }

    public void setFloatTemp_b(float temp_b) {// this method is just parent definition for child class, it does nothing here but it will set value of temp_b variables, type float
    }

    public float getFloatTemp_c() {// this method is just parent definition for child class, it does nothing here but it will get value of temp_c variables, return type int
        return 0;
    }

    public void setFloatTemp_c(float temp_c) {// this method is just parent definition for child class, it does nothing here but it will set value of temp_c variables, type float
    }

    public String getTemp_p() {// this method is just parent definition for child class, it does nothing here but it will get value of temp_p variables, return type String
        return "";
    }

    public void setTemp_p(String temp_p) {// this method is just parent definition for child class, it does nothing here but it will set value of temp_p variables, type String
    }

}