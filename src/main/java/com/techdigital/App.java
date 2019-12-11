package com.techdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan( basePackages = "com.techdigital")
//@EnableJpaRepositories(basePackages = "com.techdigital")
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
//    }
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
//        bean.setDatabase(Database.H2);
//        bean.setGenerateDdl(true);
//        bean.setShowSql(true);
//        return bean;
//    }
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,
//            JpaVendorAdapter jpaVendorAdapter) {
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setJpaVendorAdapter(jpaVendorAdapter);
//        bean.setPackagesToScan("jcg.zheng.demo.jpademo");
//        return bean;
//    }
//    @Bean
//    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
//        return new JpaTransactionManager(emf);
//    }
}
