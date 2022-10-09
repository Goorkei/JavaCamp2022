package kodlamaIo.core.logging;

import kodlamaIo.abstracts.core.logging.ILogger;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Dosya loglandı " + data);
	}

}
