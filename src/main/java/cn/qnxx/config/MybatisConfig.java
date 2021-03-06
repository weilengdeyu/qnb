package cn.qnxx.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Driver;

/**
 * @Classname MybatisConfig
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 16:03
 * @Created by Happy-微冷的雨
 */
@MapperScan("cn.*.*.*.mapper")
@Configuration
public class MybatisConfig {

    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource) throws IOException {
        MybatisSqlSessionFactoryBean bean = new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        MybatisConfiguration mybatisConfiguration = new MybatisConfiguration();
        mybatisConfiguration.setLogImpl(StdOutImpl.class);
        mybatisConfiguration.setCacheEnabled(true);
        bean.setConfiguration(mybatisConfiguration);
        bean.setPlugins(new Interceptor[]{paginationInterceptor()});
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageXMLConfigPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "/mapper/*/*.xml";
        bean.setMapperLocations(resolver.getResources(packageXMLConfigPath));
        return bean;
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor  paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }
    @Bean
    public DataSource dataSource()  {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("root");
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3306/big");
        return dataSource;
    }
}
