package corona.server;

import java.util.ArrayList;

import corona.vo.Hospital;
import corona.vo.Infectee;
import corona.vo.Person;
import corona.vo.Place;

public interface DatabaseTemplate {
	// �߰�
	void addPeople(Person p) ;
	void addInfectee(Person p); // corona19�� 1�� infectee ����
	
	// �Ϲ� ��ȸ
	Person searchPeople(int ssn);
	// ���� ��ȸ
	String searchForeigner(int ssn);
	// Ȯ���� ��ȸ
	Person searchAInfectee(String address1, String address2, int num);
	Person searchAInfectee(int ssn);//
	ArrayList<Person> searchAllInfectee();
	// Ȯ���� �� �ܱ��� ��ȸ
	ArrayList<Person> searchAllForeignInfectee();
	// ���� ��ȸ
	ArrayList<Place> searchAllTrace(String address1, String address2, int num);
	ArrayList<Place> searchAllTrace(int ssn);
	// ���� ��ȸ
	int searchAHosipitalCode(String name);
	// ���� �� Ȯ���� ��ȸ
	Hospital whereIsAInfectee(Infectee infectee); 
    ArrayList<Person> searchAllInfecteeInHospital();
    // n�� ȯ�ڰ� ������Ų ������� ��ȸ
    ArrayList<Person> searchInfectedPeopleByCertainPerson(Person p);
    
	// =============== ��Ȳ������, =================
	// ��ġ 
    void treatedInfectee(int ssn);
    // �ݸ�����
    void NoMoreIsolation(int ssn);
    
    // =============== �ļ���ġ =============================
    // �濪�ϱ�
    
    // �Կ� ó��
    
    
    
}