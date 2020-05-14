package corona.test;

import java.sql.SQLException;
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
		
	}

}
