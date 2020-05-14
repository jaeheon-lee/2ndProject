package corona.server;

import java.util.ArrayList;

import corona.vo.Hospital;
import corona.vo.Infectee;
import corona.vo.Person;
import corona.vo.Place;

public interface DatabaseTemplate {
	// 추가
	void addPeople(Person p) ;
	void addInfectee(Person p); // corona19를 1로 infectee 생성
	
	// 일반 조회
	Person searchPeople(int ssn);
	// 국적 조회
	String searchForeigner(int ssn);
	// 확진자 조회
	Person searchAInfectee(String address1, String address2, int num);
	Person searchAInfectee(int ssn);//
	ArrayList<Person> searchAllInfectee();
	// 확진자 중 외국인 조회
	ArrayList<Person> searchAllForeignInfectee();
	// 동선 조회
	ArrayList<Place> searchAllTrace(String address1, String address2, int num);
	ArrayList<Place> searchAllTrace(int ssn);
	// 병원 조회
	int searchAHosipitalCode(String name);
	// 병원 내 확진자 조회
	Hospital whereIsAInfectee(Infectee infectee); 
    ArrayList<Person> searchAllInfecteeInHospital();
    // n번 환자가 감염시킨 사람들을 조회
    ArrayList<Person> searchInfectedPeopleByCertainPerson(Person p);
    
	// =============== 현황업데잍, =================
	// 완치 
    void treatedInfectee(int ssn);
    // 격리해제
    void NoMoreIsolation(int ssn);
    
    // =============== 후속조치 =============================
    // 방역하기
    
    // 입원 처리
    
    
    
}