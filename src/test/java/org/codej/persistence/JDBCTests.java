package org.codej.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testConnection() {
		try(Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/bookex?serverTimezone=Asia/Seoul",
				"codeJ",
				"yjy^^46232891")){
			log.info(connection);
			
		}catch (Exception e) {
			fail(e.getMessage());
		}
		
	}

}
