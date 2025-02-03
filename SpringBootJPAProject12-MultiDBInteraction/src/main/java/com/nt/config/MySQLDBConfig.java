package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;
@Configuration
// datasoruce obj is linked with entityManagerFactory obj which is linked with Transaction manager obj
// now it should be linked to there own repository
@EnableJpaRepositories(basePackages = "com.nt.repository.offer",entityManagerFactoryRef = "mysqlEMF"
						,transactionManagerRef = "MySQLTxMgmr")
@EnableTransactionManagement// do all or nothing
public class MySQLDBConfig {
	
	@Bean(name="MySQLDS")
	@ConfigurationProperties(prefix = "mysql.datasource")
	@Primary // Does not take AutoConfiguration datasoruce, entitymanagerfactory, transactionmmanager obj
	//by default istead use this provides ambiguty
	public DataSource createMySQLDB(){
		return DataSourceBuilder.create().build(); 
	}
	
	@Bean(name = "mysqlEMF")
	@Primary // selfless factory bean does not return obj of its own, instead it gives resultant obj
	public LocalContainerEntityManagerFactoryBean createmysqlEMF( EntityManagerFactoryBuilder builder) {
		
		//create hibernatate map property
		Map<String, String> props=new HashMap<>();
		props.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto","update" );
		props.put("hibernate.show_sql","true");
		
        return builder.dataSource(createMySQLDB())
        		.packages("com.nt.entity.offer")
        		.properties(props)
        		.build();
        
       

	}

    @Bean(name = "MySQLTxMgmr")
    @Primary
    public PlatformTransactionManager createMySQLTxMgmr(@Qualifier("mysqlEMF") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}
    //base and sub class
}
