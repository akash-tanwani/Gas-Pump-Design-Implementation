package DataStore;

public class DS_1 extends DataStore{
    public float cash;
    public int total;
    public int L;
    public int price;
    public int W;

    //temporary variables
    public int temp_a;
    public float temp_c;

    @Override
    public float getCash() {
        return cash;// get value of cash variable, return type float
    }

    @Override
    public void setCash(float cash) {
        this.cash = cash;//set value of cash variables, type float
    }

    @Override
    public int getTotal() {
        return total;// get value of total variable, return type int
    }

    @Override
    public void setTotal(int total) {
        this.total = total;//set value of total variables, type int
    }

    @Override
    public int getL() {
        return L;// get value of L variable, return type int
    }

    @Override
    public void setL(int l) {
        L = l;//set value of L variables, type int
    }

    @Override
    public int getPrice() {
        return price;// get value of price variable, return type int
    }

    @Override
    public void setPrice(int price) {
        this.price = price;//set value of price variables, type int
    }

    @Override
    public int getW() {
        return W;// get value of W variable, return type int
    }

    @Override
    public void setW(int w) {
        W = w;//set value of W variables, type int
    }

    @Override
    public int getTemp_a() {
        return temp_a;// get value of temp_a variable, return type int
    }

    @Override
    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;//set value of temp_a variables, type int
    }

    @Override
    public float getTemp_c() {
        return temp_c;// get value of temp_c variable, return type float
    }

    @Override
    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;//set value of temp_c variables, type float
    }
    
}
