package corona.test;

import java.sql.SQLException;
import java.util.ArrayList;

import corona.dao.Database;
import corona.exception.DuplicateSSNException;
import corona.vo.Visit;
import corona.dao.Database;
import corona.exception.DuplicateSSNException;
import corona.exception.RecordNotFoundException;
import corona.vo.Person;

public class Corona_test {

	public static void main(String[] args) throws Exception {
		Database db = new Database("127.0.0.1");
		db.addInfectee(222, 101, "지역");
	}

}
