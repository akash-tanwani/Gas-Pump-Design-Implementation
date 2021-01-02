package GasPump;

import AbstractFactory.*;
import DataStore.*;
import MDA_EFSM.MDA_EFSM;

/*
 * This class call all the operation of GasPump-1.
 */

public class GasPump_1 {
	DS_1 d1;
	AbstractFactory af;
	MDA_EFSM m;

    public GasPump_1()
    {
		// create client factory ConcreteFactory_1 object
		af = new ConcreteFactory1();
		// creates an CF1 object and returns its address
		d1 = new DS_1();
		m = new MDA_EFSM();
		m.intialize(af, d1);
		
    }


	 public void Activate(int a) 
	 {	//check the activate method's input parameter and if its positive and greater than zero than call the EFSM meta event activate().
	 	// If incorrect show error message.
	        if (a > 0 ) 
	        {
	            d1.setTemp_a(a); // store price 
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
	  
	  public void Cancel()
	  {
	        m.Cancel(); // call EFSM-model's meta event cancel().
	  }

	  public void Approved() 
      {
    	  m.Approved(); //  call EFSM-model's meta event approve().
      }

	  public void StartPump() 
      {
		  m.StartPump(); // call EFSM-model's meta event StartPump().	
	  }

	  public void PumpLiter() 
	  { 
		if (d1.getW() ==1 ) 
	        {
				m.Pump(); // call EFSM-model's meta event pump().
	        }
	        else if((d1.getCash() >0) && (d1.getCash() < d1.getPrice()*(d1.getL()+1)))
			{
				m.StopPump();// call EFSM-model's meta event stopPump().
			}
			else m.Pump();// call EFSM-model's meta event pump().
	   }  

	  public void StopPump() 
	  {
			m.StopPump(); // call EFSM-model's meta event stopPump().
	  }

	public void PayCash(float c) {
		if (c > 0 ) 
	        {
	            d1.setTemp_c(c); // store price 
	            m.PayCash();// call EFSM-model's meta event PayCash().
	        }
	        else
	        {
	            System.out.println("Not Activated!!!!!");
	            System.out.println("please Select Price again with value greater then zero");
	        }

	}

	public void print_Operations() {
		System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				+ "\nMENU of Operations for GasPump-1: "
				+ "\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
				+ "\n(0) Activate | "
				+ "(1) Start | "
				+ "(2) PayCredit | "
				+ "(3) Reject | "
				+ "(4) Cancel | "
				+ "(5) Approved | "
				+ "(6) PayCash | "
				+ "(7) StartPump | "
				+ "(8) PumpLiter | "
				+ "(9) StopPump | "
				+ "{q} Quit the program"
				+ "\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	 
}
