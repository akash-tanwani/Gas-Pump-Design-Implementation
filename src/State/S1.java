package State;

import MDA_EFSM.MDA_EFSM;

public class S1 extends State {

    public S1(MDA_EFSM mda_EFSM) {
        super(mda_EFSM);
    }

	@Override
	public void Activate() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void Start() {
		System.out.println("This opreation is not Valid on current state");
	}
    
    @Override
    public void PayCredit() {
    	//this method simply change state to 3
		if (m.getObject().S == m.getObject().LS[2]) {
			m.getObject().change_state(3);
			System.out.println("AUTHENTICATING CREDIT CARD. You can Proceed ...");// If credit is selected set this state
			System.out.println(" Press (3) to reject the transaction else press (5) to Approve it");
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
    }
    
    @Override
    public void PayCash() {
    	//this method calls EnterPinMsg() and StorePin() meta actions from Output Processer(i.e., OP),
		// reset the value of number of attempts to enter pin(k) to 0 and change state to 5.
		if (m.getObject().S == m.getObject().LS[2]) {
            m.getObject().p.StoreCash();
            m.getObject().p.DisplayMenu();
            m.getObject().p.SetW(0);
			m.getObject().change_state(4);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
    }
    
    @Override
    public void PayDebit() {
    	//this method calls StoreCash(), DisplayMenu(), SetW() meta actions from Output Processer(i.e., OP) and change state to 4.
		if (m.getObject().S == m.getObject().LS[2]) {
			m.getObject().p.StorePin();
            m.getObject().p.EnterPinMsg();
			m.getObject().setK(0);
			m.getObject().change_state(5);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	@Override
	public void Reject() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void Approved() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void Cancel() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void SelectGas(int g) {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void StartPump() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void CorrectPin() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void InCorrectPin(int max) {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void Pump() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void StopPump() {
		System.out.println("This opreation is not Valid on current state");
	}
}
