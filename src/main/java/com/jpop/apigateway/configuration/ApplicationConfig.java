package com.jpop.apigateway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jpop.apigateway.filter.PreFilter;

@Configuration
public class ApplicationConfig {

  @Bean
  public PreFilter preFilter() {
    return new PreFilter();
  }
}
