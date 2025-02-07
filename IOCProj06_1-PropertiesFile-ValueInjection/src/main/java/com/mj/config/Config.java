package com.mj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages="com.mj.sbeans")
@PropertySource({"com/mj/commons/Info.Properties","com/mj/commons/Info.Properties1"})
public class Config 
{

}
