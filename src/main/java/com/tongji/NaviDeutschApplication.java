package com.tongji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class NaviDeutschApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(NaviDeutschApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("Successfully connected to the database!");
		} catch (SQLException e) {
			System.err.println("Failed to connect to the database.");
			e.printStackTrace();
		}
	}
}
