package corona.test;

import java.sql.SQLException;
<<<<<<< HEAD
import java.util.ArrayList;

import corona.dao.Database;
import corona.exception.DuplicateSSNException;
import corona.vo.Visit;

public class Corona_test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, DuplicateSSNException {
		Database db = new Database("127.0.0.1");
		
		db.addInfectee(111, 101);
		
		/*ArrayList<Visit> temp = db.isCleaned();
		for(Visit v : temp) System.out.println(v);*/
		
=======

import corona.dao.Database;
import corona.exception.DuplicateSSNException;
import corona.exception.RecordNotFoundException;
import corona.vo.Person;

public class Corona_test {

	public static void main(String[] args) throws Exception {
		Database db = new Database("127.0.0.1");
		db.addPeople(new Person(1818, "주00", "제주", "서귀포시", 27, "m", 0, "2020-05-18", "2020-05-18", "중국"));
>>>>>>> dae865ed23708d367500c3d04da5ee634002501f
	}

}
