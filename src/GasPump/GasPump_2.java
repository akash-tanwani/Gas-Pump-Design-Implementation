package GasPump;

import AbstractFactory.*;
import DataStore.*;
import MDA_EFSM.MDA_EFSM;

/*
 * This class call all the operation of GasPump-2.
 */

public class GasPump_2 {
    DS_2 d2;
	AbstractFactory af;
	MDA_EFSM m;

    public GasPump_2()
    {
		// create client factory CF1 object
		af = new ConcreteFactory2();
		// creates an CF1 object and returns its address
		d2 = new DS_2();
		m = new MDA_EFSM();
		m.intialize(af,d2);
		
    }

	public void Activate(float a, float b, float c) {
		//check the activate method's input parameter and if its positive and greater than zero than call the EFSM meta event activate().
		//If incorrect show error message.
		if ((a > 0)&&(b>0)&&(c>0)) 
	        {
				d2.setFloatTemp_a(a); // store price 
				d2.setFloatTemp_b(b);
				d2.setFloatTemp_c(c);
	            m.Activate();
	        }
	        else
	        {
	            System.out.println("Not Activated!!!!!");
	            System.out.println("please Select Price again with value greater then zero");
	        }
	}

	public void Start() 
	{
	    m.Start(); // call EFSM-model's meta event start().
	}

	public void PayCredit() 
	{
	    m.PayCredit(); // call EFSM-model's meta event payCredit().   
	}
	 
    public void Reject()
    {
    	m.Reject(); // call EFSM-model's meta event reject().
    }

	public void PayDebit(String p) {
		d2.setTemp_p(p);
		m.PayDebit();// call EFSM-model's meta event PayDebit().

	}

	public void Pin(String x) {
		if(d2.getPin().equals(x)){
			m.CorrectPin();// call EFSM-model's meta event CorrectPin().
		}
		else m.InCorrectPin(1);// call EFSM-model's meta event InCorrectPin().
	}

	public void Cancel()
	{
	    m.Cancel(); // call EFSM-model's meta event cancel().
	}

	public void Approved() 
    {
    	m.Approved(); //  call EFSM-model's meta event approved().
    }

	public void Diesel() {
		m.SelectGas(3);//  call EFSM-model's meta event SelectGas().
	}

	public void Regular() {
		m.SelectGas(1);//  call EFSM-model's meta event SelectGas().
	}
	
	public void Super() {
		m.SelectGas(2);//  call EFSM-model's meta event SelectGas().
	}

	public void StartPump() 
    {
		if(d2.getFloatPrice()>0){
			m.StartPump(); // call EFSM-model's meta event StartPump()
		}	
	}

	public void PumpGallon() {
		m.Pump();// call EFSM-model's meta event Pump()
	}

	public void StopPump() {
		m.StopPump();// call EFSM-model's meta event StopPump()
	}

	public void FullTank(){
		m.StopPump();// call EFSM-model's meta event FullTank()
	}

	public void print_Operations() {
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				+ "\nMENU of Operations for GasPump-2: "
				+ "\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				+ "\n(0) Activate |"
				+ "(1) Start |"
				+ "(2) PayCredit |"
				+ "(3) Reject |"
				+ "(4) Cancel |"
				+ "(5) Approved |"
				+ "(6) PayDebit |"
				+ "(7) Pin |"
				+ "(8) Diesel |"
				+ "(9) Regular |"
				+ "(10) Super |"
				+ "(11) StartPump |"
				+ "(12) PumpGallon |"
				+ "(13) StopPump |"
				+ "(14) FullTank |"
				+ "(q) Quit the program"
				+"\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
    
}
