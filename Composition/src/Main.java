
public class Main {

	public static void main(String[] args) {
		
		ALU theALU=new ALU("Potato12");
		CU theCU =new CU("cu12");
		Register theRegister=new Register("mhz", 1000);
		Primary thePrimary =new Primary("RAM","#F)");
		Secondary theSecondary =new Secondary("ROM","$JD");
        Memory theMemory=new Memory("mmmm",thePrimary,theSecondary);
        
        Microprocessor mpu=new Microprocessor(theALU, theCU, theRegister, theMemory);
        mpu.whichOperation();
        //theALU.arithmeticOperation();
       // mpu.getMemory().getModel();
        //mpu.getAlu().logicalOperation();
	}

}
