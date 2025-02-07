package com.mj.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.mj.sbeans")
@PropertySource("com/mj/commons/Info.properties")
public class AppConfig 
{

}
