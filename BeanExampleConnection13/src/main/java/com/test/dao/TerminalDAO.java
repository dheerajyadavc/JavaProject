package com.test.dao;

import com.test.util.Terminal;

public interface TerminalDAO {

	public void insert(Terminal terminal);

	public Terminal findByCustomerNumber(int termnum);

}
