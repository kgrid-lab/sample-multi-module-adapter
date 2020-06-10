package org.kgrid.adaptergateway;

import org.kgrid.multiadapter.adapterapi.AdapterApi;
import org.kgrid.multiadapter.adaptertwo.Adapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdapterGatewayApplication implements ApplicationRunner {

  private Logger logger = LoggerFactory.getLogger(AdapterGatewayApplication.class);
  @Autowired private AdapterApi adapter;

  public static void main(String[] args) {
    SpringApplication.run(AdapterGatewayApplication.class, args);
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    logger.info(adapter.status().toString());
  }

  @Bean AdapterApi pickAnAdapter() {
    return new Adapter();
  }
}
