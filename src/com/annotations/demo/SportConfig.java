package com.annotations.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// this class demonstrates spring configuration without any xml file

@Configuration
@ComponentScan("com.annotations.demo")
public class SportConfig {

}
