package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan({"repositories"})
public class MyConfig {
@Bean("conn")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		String jdbcUrl = "jdbc:mysql://localhost/provaspring";
		dataSource.setUrl(jdbcUrl);
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource ;
	}
@Bean
public JdbcTemplate jdbcTemplate() {
	return new JdbcTemplate(dataSource());
}

	
}
