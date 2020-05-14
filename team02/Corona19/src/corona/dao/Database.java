package corona.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;
import corona.vo.Hospital;
import corona.vo.Infectee;
import corona.vo.Person;
import corona.vo.Place;
import corona.vo.Visit;

public class Database implements DatabaseTemplate {
	public Database(String serverIp) throws ClassNotFoundException {
		Class.forName(ServerInfo.DRIVER_NAME);
		
	}
	
	@Override
	public Connection getConnect() throws SQLException {
		
		return null;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPeople(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int todayInfectee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int todayTreated() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int todayDeath() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalInfectee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTreated() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalDeath() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalDeathRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Treating() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalTestDone() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalInfecteeRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int localInfectee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int foreignInfectee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int infecteeInCertainCity(String address1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int infecteeInCertainCity(String address1, String address2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Visit> searchAllTrace(String address1, String address2, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Visit> searchAllTrace(String address1, String address2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Visit> isCleaned() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Visit> isCleaned(int ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person searchPeople(int ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchForeigner(int ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person searchAInfectee(String address1, String address2, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person searchAInfectee(int ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> searchAllInfectee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> searchAllForeignInfectee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Place> searchAllTrace(int ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int searchAHosipitalCode(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Hospital whereIsAInfectee(Infectee infectee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> searchAllInfecteeInHospital() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> searchInfectedPeopleByCertainPerson(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Visit> isCleaned(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInfectee(Infectee inf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void treatedInfectee(int ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoMoreIsolation(int ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDeath(int ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTrace(int ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doClean(int ssn, String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int returnSsn(String address1, String address2, int num) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
