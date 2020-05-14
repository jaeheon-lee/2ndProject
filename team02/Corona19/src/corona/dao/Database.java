package corona.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;
import corona.exception.DuplicateSSNException;
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
	public void addPeople(Person p) throws SQLException {
		Connection conn = getConnect();
		String sql = "INSERT INTO person() VALUES()";
		PreparedStatement ps = conn.prepareStatement(sql);
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
		ArrayList<Visit> v = new ArrayList<Visit>();
		
		try {
		conn = getConnect();
		String query = "SELECT cleanDate From visits WHERE address = ?";
		ps = conn.prepareStatement(query);
		
		ps.setString(1, address);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			v.add(new Visit(rs.getString("cleanDate")));
		}
		}catch(SQLException e) {
			
		}finally{
			closeAll(rs, ps, conn);
		}
		return v;
	}

	@Override
	public void updatePerson(Person p) {
		
		
	}
	
	public boolean isExistinInfectee(int ssn, Connection conn)throws SQLException {
		//있는지 없는지 존재유무 확인...
		
		String sql ="SELECT Person_ssn FROM infectee WHERE Person_ssn=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1,ssn);
		ResultSet rs = ps.executeQuery();
		return rs.next();
	}	

	@Override
	public void addInfectee(int ssn, int code) throws SQLException, DuplicateSSNException {
		Connection conn = null;
		PreparedStatement ps =null;
		
		try {
			conn = getConnect();
			
			if(!isExistinInfectee(ssn, conn)) {
				String query = "INSERT INTO infectee(Person_ssn, in_hospital, Hospital_code) VALUES(?, curdate(), ?)";
				ps = conn.prepareStatement(query);
				
				ps.setInt(1, ssn);
				ps.setInt(2, code);
				
				System.out.println(ps.executeUpdate()+" 명 추가 ok...");
			}else {
				throw new DuplicateSSNException("이미 확진자 명단에 있습니다.");
			}
		}finally {
			closeAll(ps, conn);
		}
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
