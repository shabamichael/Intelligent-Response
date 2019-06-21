package com.intelligent.response.logic;

import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class PrimaryKeyGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object object) throws HibernateException {
		
		return String.format(format, LocalDate.now(),);
	}

}
