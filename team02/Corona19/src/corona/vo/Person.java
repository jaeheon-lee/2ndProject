package corona.vo;

import java.util.ArrayList;

public class Person {
	private int ssn;
	private String name;
	private String address1;
	private String address2;
	private int age;
	private String gender;
	private String test_condition;
	private int corona19;
	private String isolation;
	private String country;
	
	//
	private Hospital hospital;
	private ArrayList<Place> visitedPlace;
	private Infectee infectee;
	
	public Person() {
		
	}
	public Person(int ssn, String name, String address1, String address2, int age, String gender) {
		this(ssn, name, address1, address2, age, gender, null, 0, 0, null, null,null,null,null);
	}
	public Person(int ssn, String name, String address1, String address2, int age, String gender, String test_condition,
			int corona19, int infecter, String isolation, String country, Hospital hospital,
			ArrayList<Place> visitedPlace,Infectee infectee) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.age = age;
		this.gender = gender;
		this.test_condition = test_condition;
		this.corona19 = corona19;
		this.infecter = infecter;
		this.isolation = isolation;
		this.country = country;
		this.hospital = hospital;
		this.visitedPlace = visitedPlace;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTest_condition() {
		return test_condition;
	}
	public void setTest_condition(String test_condition) {
		this.test_condition = test_condition;
	}
	public int getCorona19() {
		return corona19;
	}
	public void setCorona19(int corona19) {
		this.corona19 = corona19;
	}
	public int getInfecter() {
		return infecter;
	}
	public void setInfecter(int infecter) {
		this.infecter = infecter;
	}
	public String getIsolation() {
		return isolation;
	}
	public void setIsolation(String isolation) {
		this.isolation = isolation;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public ArrayList<Place> getVisitedPlace() {
		return visitedPlace;
	}
	public void setVisitedPlace(ArrayList<Place> visitedPlace) {
		this.visitedPlace = visitedPlace;
		
	}
	
	public Infectee getInfectee() {
		return infectee;
	}
	public void setInfectee(Infectee infectee) {
		this.infectee = infectee;
	}
	
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", address1=" + address1 + ", address2=" + address2 + ", age="
				+ age + ", gender=" + gender + ", test_condition=" + test_condition + ", corona19=" + corona19
				+ ", infecter=" + infecter + ", isolation=" + isolation + ", country=" + country + ", hospital="
				+ hospital + ", visitedPlace=" + visitedPlace + ", infectee=" + infectee + "]";
	}


	
}
