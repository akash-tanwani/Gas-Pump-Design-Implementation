package DataStore;

public class DS_2 extends DataStore{
    public String pin;
    public float price;
    public int G;
    public float total;
    public float Rprice;
    public float Dprice;
    public float Sprice;
    
    //temporary variables
    public float temp_a;
    public float temp_b;
    public float temp_c;
    public String temp_p;

    @Override
    public String getPin() {
        return pin;// get value of pin variable, return type String
    }

    @Override
    public void setPin(String pin) {//set value of pin variables, type String
        this.pin = pin;
    }

    @Override
    public float getFloatPrice() {
        return price;// get value of price variable, return type float
    }

    @Override
    public void setFloatPrice(float price) {
        this.price = price;//set value of price variables, type float
    }

    @Override
    public int getG() {
        return G;// get value of G variable, return type int
    }

    @Override
    public void setG(int g) {
        G = g;//set value of G variables, type int
    }

    @Override
    public float getFloatTotal() {
        return total;// get value of total variable, return type float
    }

    @Override
    public void setFloatTotal(float total) {
        this.total = total;//set value of total variables, type float
    }

    @Override
    public float getRprice() {
        return Rprice;// get value of Rprice variable, return type float
    }

    @Override
    public void setRprice(float rprice) {
        Rprice = rprice;//set value of Rprice variables, type float
    }

    @Override
    public float getDprice() {
        return Dprice;// get value of Dprice variable, return type float
    }

    @Override
    public void setDprice(float dprice) {
        Dprice = dprice;//set value of dprice variables, type float
    }

    @Override
    public float getSprice() {
        return Sprice;// get value of Sprice variable, return type float
    }

    @Override
    public void setSprice(float sprice) {
        Sprice = sprice;//set value of Sprice variables, type float
    }

    @Override
    public float getFloatTemp_a() {
        return temp_a;// get value of temp_a variable, return type float
    }

    @Override
    public void setFloatTemp_a(float temp_a) {
        this.temp_a = temp_a;//set value of temp_a variables, type float
    }

    @Override
    public float getFloatTemp_b() {
        return temp_b;// get value of temp_b variable, return type float
    }

    @Override
    public void setFloatTemp_b(float temp_b) {
        this.temp_b = temp_b;//set value of temp_b variables, type float
    }

    @Override
    public float getFloatTemp_c() {
        return temp_c;// get value of temp_c variable, return type float
    }

    @Override
    public void setFloatTemp_c(float temp_c) {
        this.temp_c = temp_c;//set value of temp_c variables, type float
    }

    @Override
    public String getTemp_p() {
        return temp_p;// get value of temp_p variable, return type String
    }

    @Override
    public void setTemp_p(String temp_p) {
        this.temp_p = temp_p;//set value of temp_p variables, type String
    }

}
