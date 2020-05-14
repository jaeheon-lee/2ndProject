package corona.vo;

import java.util.ArrayList;

public class Infectee extends Person {
	private int num;
	private String infectionRoute; // 감염경로 : 해외냐, 지역
	private int infecter; // 날 감염시킨 사람
	private String in_hospital; // 입원 날짜
	private String treatDate; // 완치 날짜
	private String deathDate; // 사망 날짜
	private ArrayList<Place> allTrace;  // 동선 껍데기
	
	
	public Infectee() {
		
	}


	public Infectee(int ssn, String name, String address1, String address2, int age, String gender, String test_condition,
			String isolation, String country, int num, String infectionRoute, int infecter, String in_hospital, String treatDate,
			String deathDate, ArrayList<Place> allTrace) {
		super(ssn, name, address1, address2, age, gender, test_condition, isolation, country);
		this.num = num;
		this.infectionRoute = infectionRoute;
		this.infecter = infecter;
		this.in_hospital = in_hospital;
		this.treatDate = treatDate;
		this.deathDate = deathDate;
		this.allTrace = allTrace;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getInfectionRoute() {
		return infectionRoute;
	}


	public void setInfectionRoute(String infectionRoute) {
		this.infectionRoute = infectionRoute;
	}


	public int getInfecter() {
		return infecter;
	}


	public void setInfecter(int infecter) {
		this.infecter = infecter;
	}


	public String getIn_hospital() {
		return in_hospital;
	}


	public void setIn_hospital(String in_hospital) {
		this.in_hospital = in_hospital;
	}


	public String getTreatDate() {
		return treatDate;
	}


	public void setTreatDate(String treatDate) {
		this.treatDate = treatDate;
	}


	public String getDeathDate() {
		return deathDate;
	}


	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}


	public ArrayList<Place> getAllTrace() {
		return allTrace;
	}


	public void setAllTrace(ArrayList<Place> allTrace) {
		this.allTrace = allTrace;
	}


	@Override
	public String toString() {
		return "Infectee [num=" + num + ", infectionRoute=" + infectionRoute + ", infecter=" + infecter
				+ ", in_hospital=" + in_hospital + ", treatDate=" + treatDate + ", deathDate=" + deathDate
				+ ", allTrace=" + allTrace + "]";
	}
}
