package com.termfrequency.api.beeblapi.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppPropertiesConfig.class)
public class BeeblConfig {
}
