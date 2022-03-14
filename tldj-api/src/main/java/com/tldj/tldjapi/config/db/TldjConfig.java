package com.tldj.tldjapi.config.db;

import javax.sql.DataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.tldj.tldjapi.trackList.repository")
@RequiredArgsConstructor
public class TldjConfig {

  private final Environment env;

  @Bean
  public DataSource tldjDataSource() {

    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(env.getProperty("spring.tldj.datasource.driver-class-name"));
    dataSource.setUrl(env.getProperty("spring.tldj.datasource.url"));
    dataSource.setUsername(env.getProperty("spring.tldj.datasource.username"));
    dataSource.setPassword(env.getProperty("spring.tldj.datasource.password"));

    return dataSource;
  }

}
