package corona.vo;

import java.util.ArrayList;

public class Infectee extends Person {
	private int num;
	private String infectionRoute; // ������� : �ؿܳ�, ����
	private String in_hospital; // �Կ� ��¥
	private int infecter; // �� ������Ų ���
	private int condition; // �������? ġ�� ��=0, ��ġ = 1, ��� = 2
	private ArrayList<Place> allTrace;  // ���� ������
	
	
	public Infectee() {
		
	}
	
}
