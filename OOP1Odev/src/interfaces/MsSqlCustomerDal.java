package interfaces;

public class MsSqlCustomerDal implements ICustomerDal {

	@Override
	public void Add() {
		System.out.println("MsSql Server eklendi");
	}

}
