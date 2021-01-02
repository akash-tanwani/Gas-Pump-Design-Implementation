package State;

import MDA_EFSM.MDA_EFSM;

/*
 * State Class
 * Generalized parent class to represent states for the GasPump system
 * have each state as child class
 * Follows "State Pattern" strategy with Decentralized approach
 * This Class is connected with MDA_EFSM and OP Class
 * This do not have any action to perform just used for generalization
 * each methods that are in each state is defined here with just a print statement as body
 * Here constructor will get MDA EFSM object for the actions in state class
 */

public class State{
    MDA_EFSM m;

    public State(MDA_EFSM mda_EFSM){
        m=mda_EFSM;
        
    }

    public void Activate() {
        System.out.println("In State Class");
	}

	public void Start() {
        System.out.println("In State Class");
	}


	public void Reject() {
        System.out.println("In State Class");
	}

	public void Cancel() {
        System.out.println("In State Class");
	}

	public void Approved() {
        System.out.println("In State Class");
	}

	public void StartPump() {
        System.out.println("In State Class");
	}

	public void Pump() {
        System.out.println("In State Class");
	}

	public void StopPump() {
        System.out.println("In State Class");
	}

	public void PayCredit() {
        System.out.println("In State Class");
	}

	public void SelectGas(int i) {
        System.out.println("In State Class");
	}

	public void PayDebit() {
        System.out.println("In State Class");
	}

	public void InCorrectPin(int i) {
        System.out.println("In State Class");
	}

	public void CorrectPin() {
        System.out.println("In State Class");
	}

	public void PayCash() {
        System.out.println("In State Class");
	}

}