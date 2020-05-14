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
	// 공통 로직 ###################################################
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn)throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException;	
	
	
	
	
	// 비지니스로직 ###################################################
	/* =========================================== 추가 ============================================*/
	void addPeople(Person p) ;
	
	
	/* =========================================== 조회 ==============================================*/
	/* ----------------- 일반 유저 조회 -----------------------------*/
	// 일일확진자수
	int todayInfectee();
	// 일일완치자수
	int todayTreated();
	// 일일사망자
	int todayDeath();
	// 누적확진자
	int totalInfectee();
	// 누적완치자
	int totalTreated();
	// 누적사망자
	int totalDeath();
	// 누적사망률
	int totalDeathRate();
	// 치료중인원수
	int Treating();
	// 누적검사수
	int totalTest();
	// 누적검사완료수 : if(today()-검사일자 == 2day)
	int totalTestDone();
	// 누적확진률 : 누적확진수/누적검사수 * 100
	int totalInfecteeRate();
	// 지역발생확진자  where country = 대한민국 and 확진
	int localInfectee();
	// 해외발생확진자수
	int foreignInfectee();
	// 시도별확진자 : address1 and 2
	int infecteeInCertainCity(String address1);
	int infecteeInCertainCity(String address1, String address2);
	// 특정지역확진자 or 특정환자 동선 검색
	ArrayList<Visit> searchAllTrace(String address1, String address2, int num); // 특정 환자 
	ArrayList<Visit> searchAllTrace(String address1, String address2); // 특정지역환자
	// 방역이 필요한 장소 중에 방역여부조회
	ArrayList<Visit> isCleaned(); // 모든 방역 내역
	ArrayList<Visit> isCleaned(int ssn); // 특정 확진자가 간 곳 
	
	
	/* ---------------- 직원 고유 조회 -----------------------------------*/
	
	// 일반 조회
	Person searchPeople(int ssn);
	// 국적 조회
	String searchForeigner(int ssn);
	// 특정확진자 조회
	Person searchAInfectee(String address1, String address2, int num);
	Person searchAInfectee(int ssn);//
	// 전체확진자
	ArrayList<Person> searchAllInfectee();
	// 해외발생확진자 where country = ?
	ArrayList<Person> searchAllForeignInfectee();
	// 동선 조회
	ArrayList<Place> searchAllTrace(int ssn);
	
	// 병원 코드 조회
	int searchAHosipitalCode(String name);
	// 병원 별 확진자 조회
	Hospital whereIsAInfectee(Infectee infectee); // 특정 환자가 입원한 병원
    ArrayList<Person> searchAllInfecteeInHospital(); // 한 병원의 모든 환자
    // n번 환자가 감염시킨 사람들을 조회
    ArrayList<Person> searchInfectedPeopleByCertainPerson(Person p);
    
    // 방역여부 조회
    ArrayList<Visit> isCleaned(String address); // 특정 확진자가 간 곳 
    
	// =============== 현황업데이트 =================
    // 일반정보수정
    void updatePerson(Person p);
    // 확진자 추가 + 입원 처리 + 방역도 : 입원날짜 넣기 
    void addInfectee(Infectee inf); // corona19를 1로 infectee 생성
	// 완치 
    void treatedInfectee(int ssn);
    // 격리해제
    void NoMoreIsolation(int ssn);
    // 사망
    void setDeath(int ssn);
    // 동선
    void updateTrace(int ssn);
    // =============== 후속조치 =============================
    // 방역하기 : visit, place clean 모든 바꾸되 트랜잭션 적용
    void doClean(int ssn, String address);
    
    // ssn 변환
    int returnSsn(String address1, String address2, int num);
}