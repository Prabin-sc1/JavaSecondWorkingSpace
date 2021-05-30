
public class Microprocessor {
	private ALU alu;
	private CU cu;
	private Register register;
	private Memory memory;

	public Microprocessor(ALU alu, CU cu, Register register, Memory memory) {
		super();
		this.alu = alu;
		this.cu = cu;
		this.register = register;
		this.memory = memory;
	}

	public void whichOperation() {
		getAlu().arithmeticOperation();
		controling();
		managing();
		storing();
		

	}
	public void controling() {
		
		getCu().control();
		
	}
	
	public void managing() {
		getRegister().manageInputOutput();
	}

	public void storing() {
		getMemory().storage();
		getMemory().getPrimary().store();
		getMemory().getSecondary().store();;
		
	}
	private ALU getAlu() {
		return alu;
	}

	private CU getCu() {
		return cu;
	}

	private Register getRegister() {
		return register;
	}

	private Memory getMemory() {
		return memory;
	}

}
