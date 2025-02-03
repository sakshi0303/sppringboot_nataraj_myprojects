package com.nt.config;
import java.util.HashMap;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(basePackages = "com.nt.repository.product",entityManagerFactoryRef = "oracleEMF",transactionManagerRef = "oracletxmgr" )
@EnableTransactionManagement
public class OracleDBConfig{
	
	@Bean(name="oracleds")
	@ConfigurationProperties(prefix = "oracle.datasource")
	public DataSource createoracleds() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="oracleEMF")
	public LocalContainerEntityManagerFactoryBean createoracleEMF(EntityManagerFactoryBuilder builder) {
		
		HashMap<String, String> props=new HashMap<String, String>();
		props.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.show_sql", "true");

		return builder.dataSource(createoracleds())
				.packages("com.nt.entity.product")
				.properties(props)
				.build();
	}
	
	
	@Bean(name="oracletxmgr")
	public PlatformTransactionManager createoracletxmgr(EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}
	
}