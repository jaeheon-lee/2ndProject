package corona.vo;

public class Infectee {
	private int ssn;
	private int num;
	private String infectionRoute;
	private String in_hospital;
	private int infecter;
	
	public Infectee() {
		
	}

	public Infectee(int ssn, int num, String infectionRoute, String in_hospital) {
		super();
		this.ssn = ssn;
		this.num = num;
		this.in_hospital = in_hospital;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getIn_hospital() {
		return in_hospital;
	}

	public void setIn_hospital(String in_hospital) {
		this.in_hospital = in_hospital;
	}

	public String getInfectionRoute() {
		return infectionRoute;
	}

	public void setInfectionRoute(String infectionRoute) {
		this.infectionRoute = infectionRoute;
	}

	@Override
	public String toString() {
		return "Infectee [ssn=" + ssn + ", num=" + num + ", infectionRoute=" + infectionRoute + ", in_hospital="
				+ in_hospital + "]";
	}


	
	

	
}
