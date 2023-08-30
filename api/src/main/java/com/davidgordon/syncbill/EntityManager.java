package com.davidgordon.syncbill;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class EntityManager {

    @Autowired
    public String[] readcnnInfoStrings() {
      String[] cnnInfoStrings = new String[3];

      cnnInfoStrings[0] = Environment.getProperties().getProperty("spring.datasource.url");
      cnnInfoStrings[1] = Environment.getProperties().getProperty("spring.datasource.username");
      cnnInfoStrings[2] = Environment.getProperties().getProperty("spring.datasource.password");

      return cnnInfoStrings;
    }

}