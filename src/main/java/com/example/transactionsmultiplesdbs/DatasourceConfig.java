package com.example.transactionsmultiplesdbs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DatasourceConfig {
  @Primary
  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource springDS() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  @ConfigurationProperties(prefix = "app.datasource")
  public DataSource appDS() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  public PlatformTransactionManager transactionManagerApp(@Qualifier("appDS") DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }
}
