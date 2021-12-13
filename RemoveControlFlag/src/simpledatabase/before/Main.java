package simpledatabase.before;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		SimpleDataBase simpleDatabase = new SimpleDataBase(new FileReader("datafile.txt"));
		
		Iterator<String> ir = simpleDatabase.iterator();
		
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.println("key:" + key);
			System.out.println("value :" + simpleDatabase.getValue(key));
		}

	}

}
