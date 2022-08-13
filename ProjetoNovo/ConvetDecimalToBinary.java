package entities;

public class ConvetDecimalToBinary {
	
	private String myDecimalValue;
	

	public void setMyDecimalValue(String myDecimalValue) {
		this.myDecimalValue = myDecimalValue;
	}


	public String convert() {
		int myBinaryValue = Integer.parseInt(myDecimalValue,10);
		return Integer.toBinaryString(myBinaryValue);
	}

}
