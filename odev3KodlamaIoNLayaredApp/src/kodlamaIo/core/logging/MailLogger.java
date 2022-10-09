package kodlamaIo.core.logging;

import kodlamaIo.abstracts.core.logging.ILogger;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Mail loglandı " + data);
	}

}
