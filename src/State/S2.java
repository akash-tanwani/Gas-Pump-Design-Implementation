package State;

import MDA_EFSM.MDA_EFSM;

public class S2 extends State {

    public S2(MDA_EFSM mda_EFSM) {
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
		//This method calls RejectMsg() and EjectCard() meta actions from Output Processer(i.e., OP) and change state to 1
		if (m.getObject().S == m.getObject().LS[3]) {
            m.getObject().p.RejectMsg();
            m.getObject().p.EjectCard();
			m.getObject().change_state(1);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
    }
    
    @Override
    public void Approved() {
    	//this method calls DisplayMenu and EjectCard() meta actions from Output Processer(i.e., OP) and change state to 4.
		if (m.getObject().S == m.getObject().LS[3]) {
			m.getObject().p.DisplayMenu();
            m.getObject().p.EjectCard();
			m.getObject().change_state(4);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
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
