package PolymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BaseLogger[] baseLogger = new BaseLogger[] {new EmailLogger(),new
		 * FileLogger(),new DatabaseLogger(),new ConsoleLogger() }; for(BaseLogger
		 * logger:baseLogger) { logger.Log("Log mesajı"); }
		 */

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();
	}

}
