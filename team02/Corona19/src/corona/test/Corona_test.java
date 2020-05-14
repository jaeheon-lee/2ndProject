package corona.test;

import java.sql.SQLException;

import corona.dao.Database;
import corona.exception.DuplicateSSNException;
import corona.exception.RecordNotFoundException;
import corona.vo.Person;

public class Corona_test {

	public static void main(String[] args) throws Exception {
		Database db = new Database("127.0.0.1");
		db.addPeople(new Person(1818, "주00", "제주", "서귀포시", 27, "m", 0, "2020-05-18", "2020-05-18", "중국"));
	}

}
