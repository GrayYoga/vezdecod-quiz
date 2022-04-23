package com.vezdecod.quiz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConf {


    @Bean(name = "entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory() {

        return new LocalSessionFactoryBean();
    }
}