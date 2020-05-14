package corona.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;

import config.ServerInfo;
import corona.exception.DuplicateSSNException;
import corona.exception.RecordNotFoundException;
import corona.vo.Hospital;
import corona.vo.Infectee;
import corona.vo.Person;
import corona.vo.Place;
import corona.vo.Visit;

public class Database implements DatabaseTemplate {
	public Database(String serverIp) throws ClassNotFoundException {
		Class.forName(ServerInfo.DRIVER_NAME);
		System.out.println("Drive Loading Success..");
	}
	
	@Override
	public Connection getConnect() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
		System.out.println("Database Connection......");
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		closeAll(ps, conn);
		if(rs!=null) rs.close();
	}
	
	@Override
	public void addPeople(Person p) throws SQLException, DuplicateSSNException {
		// 추가
		Connection conn = getConnect();
		PreparedStatement ps = null;
		String sql ="SELECT ssn FROM person WHERE ssn=?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getSsn());
		ResultSet rs = ps.executeQuery();
		try {
		if(!rs.next()) {
			sql = "INSERT INTO person(ssn, name, address1, address2, age, gender, test_condition, isolation, country) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getSsn());
			ps.setString(2, p.getName());
			ps.setString(3, p.getAddress1());
			ps.setString(4, p.getAddress2());
			ps.setInt(5, p.getAge());
			ps.setString(6, p.getGender());
			ps.setString(7, p.getTest_condition());
			ps.setString(8, p.getIsolation());
			ps.setString(9, p.getCountry());
			System.out.println(ps.executeUpdate() + "명 추가되었습니다.");
		}
		else {
			throw new DuplicateSSNException();
		}
		}finally {
			closeAll(rs, ps, conn);
		}
	}

	@Override
	public int todayInfectee() {
		// 일일확진자수
		return 0;
	}

	@Override
	public int todayTreated() {
		// 일일완치자수
		return 0;
	}

	@Override
	public int todayDeath() {
		// 일일사망자
		return 0;
	}

	@Override
	public int totalInfectee() {
		// 누적확진자
		return 0;
	}

	@Override
	public int totalTreated() {
		// 누적완치자
		return 0;
	}

	@Override
	public int totalDeath() {
		// 누적사망자
		return 0;
	}

	@Override
	public int totalDeathRate() {
		// 누적사망률
		return 0;
	}

	@Override
	public int Treating() {
		// 치료중인원수
		return 0;
	}

	@Override
	public int totalTest() {
		// 누적검사수
		return 0;
	}

	@Override
	public int totalTestDone() {
		// 누적검사완료수 : if(today()-검사일자 == 2day)
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
	public ArrayList<Infectee> searchAllInfectee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Infectee> searchAllForeignInfectee() {
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
	public ArrayList<Infectee> searchAllInfecteeInHospital() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Infectee> searchInfectedPeopleByCertainPerson(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Visit> isCleaned(String address) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		conn = getConnect();
		String query = "SELECT ";
		return null;
		}catch(SQLException e) {
			System.out.println();
		}
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

	@Override
	public ArrayList<Visit> getTrace(int ssn) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
