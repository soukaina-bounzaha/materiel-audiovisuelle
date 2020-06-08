package org.audio.materielAudiovisuelleBackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "org.audio.materielAudiovisuelleBackend.dto" })
@EnableTransactionManagement

public class HibernateConfig {
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3308/audiovisuelle?serverTimezone=UTC";
	private final static String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQL5Dialect";
	private final static String DATABASE_USERNAME = "root";
	private final static String DATABASE_PASSWORD = "";

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();

		// providing database connection information

		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);

		return dataSource;
	}

	// sessionFactory Bean

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		// LocalSessionFactoryBuilder version must be the same version as hiibernate

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("org.audio.materielAudiovisuelleBackend.dto");

		return builder.buildSessionFactory();
	}
	
	// all Hibernate properties will be returned in this method

	private Properties getHibernateProperties() {

		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}
	
	// TransactionManager Bean

	@Bean
	public HibernateTransactionManager getTranTransactionManager(SessionFactory sessionFactory) {
		// HibernateTransactionManager version must be the same version as hibernate
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;

	}

}
