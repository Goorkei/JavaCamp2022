package kodlamaIo.core.logging;

import kodlamaIo.abstracts.core.logging.ILogger;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Database loglandı " + data);
	}

}
