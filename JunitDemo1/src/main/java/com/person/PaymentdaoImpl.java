package com.person;

public class PaymentdaoImpl implements PaymentDao {

	@Override
	public boolean payToPerson(String name) {
		if (name.length() > 3)
			return true;
		else
			return false;
	}

}
