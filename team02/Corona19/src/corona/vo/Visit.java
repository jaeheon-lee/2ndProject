package corona.vo;

public class Visit {
	private int ssn;
	private String address;
	
	
	public Visit() {
		
	}
	public Visit(int ssn, String address) {
		super();
		this.ssn = ssn;
		this.address = address;
	}
	
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Visit [ssn=" + ssn + ", address=" + address + "]";
	}
	
	
}
