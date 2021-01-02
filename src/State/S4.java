package State;

import MDA_EFSM.MDA_EFSM;

public class S4 extends State {

    public S4(MDA_EFSM mda_EFSM) {
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
    	//This method calls DisplayMenu() and EjectCard() meta actions from Output Processer(i.e., OP) and change state to 4
		if (m.getObject().S == m.getObject().LS[5]) {
            m.getObject().p.DisplayMenu();
            m.getObject().p.EjectCard();
			m.getObject().change_state(4);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
    }
    
    @Override
    public void InCorrectPin(int max) {
		//this method first check the value of k (i.e, number of attempts to enter pin) if the value is less than or equals to the max variable
		// then it will call WrongPinMSg() meta action from Output Processer(i.e., OP) and will not change the state otherwise
		// it will call WrongPinMSg() and EjectCard() meta actions from Output Processer(i.e., OP) and change state to 1
		if (m.getObject().S == m.getObject().LS[5]) {
			if(m.getObject().getK()<=max){
				m.getObject().p.WrongPinMsg();
				m.getObject().setK(m.getObject().getK()+1);
			}
			else{
				m.getObject().p.WrongPinMsg();
				m.getObject().p.EjectCard();
				m.getObject().change_state(1);
			}
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
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
