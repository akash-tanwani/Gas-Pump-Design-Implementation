package State;

import MDA_EFSM.MDA_EFSM;

public class S3 extends State {

    public S3(MDA_EFSM mda_EFSM) {
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
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void PayCash() {
		System.out.println("This opreation is not Valid on current state");
	}

	@Override
	public void PayDebit() {
		System.out.println("This opreation is not Valid on current state");
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
		//This method calls CancelMsg() and ReturnCash meta action from Output Processer(i.e., OP) and change state to 1.
		if (m.getObject().S == m.getObject().LS[4]) {
            m.getObject().p.CancelMsg();
            m.getObject().p.ReturnCash();
			m.getObject().change_state(1);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
    }
    
    @Override
    public void SelectGas(int g) {
    	//This method calls SetPrice(g) meta action from Output Processer(i.e., OP) and change state to 4
		if (m.getObject().S == m.getObject().LS[4]) {
			m.getObject().p.SetPrice(g);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
    }
    
    @Override
    public void StartPump() {
    	//This method calls SetInitialvalues() meta action from Output Processer(i.e., OP) and change state to 6.
		if (m.getObject().S == m.getObject().LS[4]) {
			m.getObject().p.SetInitialValues();
			m.getObject().change_state(6);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
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
