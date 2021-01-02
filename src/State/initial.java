package State;

import MDA_EFSM.MDA_EFSM;

public class initial extends State {

    public initial(MDA_EFSM mda_EFSM) {
        super(mda_EFSM);
    }

    @Override
    public void Activate() {
    	//this method calls StorePrices() meta action from Output Processer(i.e., OP) and change state to 1.
		if (m.getObject().S == m.getObject().LS[0]) {
			m.getObject().p.StorePrices();
			m.getObject().change_state(1);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
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
