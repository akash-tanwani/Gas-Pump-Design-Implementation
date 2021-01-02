package MDA_EFSM;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;
import OP.OP;
import State.*;

/*
 * This class is MDa-EFSM class and connect with decentralized State design pattern.
 * State class perform action and state transition only.
 */
public class MDA_EFSM {

	public OP p;
	public int k;
	public State[] LS;
	public State S;

	public MDA_EFSM(){
		LS = new State[7];
		p = new OP();
		S = new State(this);
		LS[0] = new initial(this);
		LS[1] = new S0(this);
		LS[2] = new S1(this);
		LS[3] = new S2(this);
		LS[4] = new S3(this);
		LS[5] = new S4(this);
		LS[6] = new S5(this);
		change_state(0);
		k=0;
	}

	
	public void Activate() {
		change_state(0);
		S.Activate();
	}

	public void Start() {
		S.Start();
	}


	public void Reject() {
		S.Reject();
	}

	public void Cancel() {
		S.Cancel();
	}

	public void Approved() {
		S.Approved();
	}

	public void StartPump() {
		S.StartPump();
	}

	public void Pump() {
		S.Pump();
	}

	public void StopPump() {
		S.StopPump();
	}

	public void PayCredit() {
		S.PayCredit();
	}

	public void SelectGas(int i) {
		S.SelectGas(i);
	}

	public void PayDebit() {
		S.PayDebit();
	}

	public void InCorrectPin(int i) {
		S.InCorrectPin(i);
	}

	public void CorrectPin() {
		S.CorrectPin();
	}

	public void PayCash() {
		S.PayCash();
	}

	public void change_state(int i) {
		S=LS[i];
	}

	public void setK(int i) {
		k=i;
	}

	public int getK() {
		return k;
	}

	public void intialize(AbstractFactory af, DataStore d) {
		p.intialize(af,d);
	}


	public MDA_EFSM getObject() {
		// this method will return current MDA_EFSM object
		return this;
	}



}
