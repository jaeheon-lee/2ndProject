package corona.vo;

import java.util.ArrayList;

public class Infectee extends Person {
	private int num;
	private String infectionRoute; // 감염경로 : 해외냐, 지역
	private String in_hospital; // 입원 날짜
	private int infecter; // 날 감염시킨 사람
	private int condition; // 사망여부? 치료 중=0, 완치 = 1, 사망 = 2
	private ArrayList<Place> allTrace;  // 동선 껍데기
	
	
	public Infectee() {
		
	}
	
}
