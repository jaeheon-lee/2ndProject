package corona.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import corona.vo.Hospital;
import corona.vo.Infectee;
import corona.vo.Person;
import corona.vo.Place;
import corona.vo.Visit;

public interface DatabaseTemplate {
	// ���� ���� ###################################################
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn)throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException;	
	
	
	
	
	// �����Ͻ����� ###################################################
	/* =========================================== �߰� ============================================*/
	void addPeople(Person p) ;
	
	
	/* =========================================== ��ȸ ==============================================*/
	/* ----------------- �Ϲ� ���� ��ȸ -----------------------------*/
	// ����Ȯ���ڼ�
	int todayInfectee();
	// ���Ͽ�ġ�ڼ�
	int todayTreated();
	// ���ϻ����
	int todayDeath();
	// ����Ȯ����
	int totalInfectee();
	// ������ġ��
	int totalTreated();
	// ���������
	int totalDeath();
	// ���������
	int totalDeathRate();
	// ġ�����ο���
	int Treating();
	// �����˻��
	int totalTest();
	// �����˻�Ϸ�� : if(today()-�˻����� == 2day)
	int totalTestDone();
	// ����Ȯ���� : ����Ȯ����/�����˻�� * 100
	int totalInfecteeRate();
	// �����߻�Ȯ����  where country = ���ѹα� and Ȯ��
	int localInfectee();
	// �ؿܹ߻�Ȯ���ڼ�
	int foreignInfectee();
	// �õ���Ȯ���� : address1 and 2
	int infecteeInCertainCity(String address1);
	int infecteeInCertainCity(String address1, String address2);
	// Ư������Ȯ���� or Ư��ȯ�� ���� �˻�
	ArrayList<Visit> searchAllTrace(String address1, String address2, int num); // Ư�� ȯ�� 
	ArrayList<Visit> searchAllTrace(String address1, String address2); // Ư������ȯ��
	// �濪�� �ʿ��� ��� �߿� �濪������ȸ
	ArrayList<Visit> isCleaned(); // ��� �濪 ����
	ArrayList<Visit> isCleaned(int ssn); // Ư�� Ȯ���ڰ� �� �� 
	
	
	/* ---------------- ���� ���� ��ȸ -----------------------------------*/
	
	// �Ϲ� ��ȸ
	Person searchPeople(int ssn);
	// ���� ��ȸ
	String searchForeigner(int ssn);
	// Ư��Ȯ���� ��ȸ
	Person searchAInfectee(String address1, String address2, int num);
	Person searchAInfectee(int ssn);//
	// ��üȮ����
	ArrayList<Person> searchAllInfectee();
	// �ؿܹ߻�Ȯ���� where country = ?
	ArrayList<Person> searchAllForeignInfectee();
	// ���� ��ȸ
	ArrayList<Place> searchAllTrace(int ssn);
	
	// ���� �ڵ� ��ȸ
	int searchAHosipitalCode(String name);
	// ���� �� Ȯ���� ��ȸ
	Hospital whereIsAInfectee(Infectee infectee); // Ư�� ȯ�ڰ� �Կ��� ����
    ArrayList<Person> searchAllInfecteeInHospital(); // �� ������ ��� ȯ��
    // n�� ȯ�ڰ� ������Ų ������� ��ȸ
    ArrayList<Person> searchInfectedPeopleByCertainPerson(Person p);
    
    // �濪���� ��ȸ
    ArrayList<Visit> isCleaned(String address); // Ư�� Ȯ���ڰ� �� �� 
    
	// =============== ��Ȳ������Ʈ =================
    // �Ϲ���������
    void updatePerson(Person p);
    // Ȯ���� �߰� + �Կ� ó�� + �濪�� : �Կ���¥ �ֱ� 
    void addInfectee(Infectee inf); // corona19�� 1�� infectee ����
	// ��ġ 
    void treatedInfectee(int ssn);
    // �ݸ�����
    void NoMoreIsolation(int ssn);
    // ���
    void setDeath(int ssn);
    // ����
    void updateTrace(int ssn);
    // =============== �ļ���ġ =============================
    // �濪�ϱ� : visit, place clean ��� �ٲٵ� Ʈ����� ����
    void doClean(int ssn, String address);
    
    // ssn ��ȯ
    int returnSsn(String address1, String address2, int num);
}