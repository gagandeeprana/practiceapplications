package com.cloudsmartz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ "com.cloudsmartz.config", "com.cloudsmartz.seq",
		"com.cloudsmartz.hosting" })
@Import({ MongoConfig.class })
public class AppConfig {
}
