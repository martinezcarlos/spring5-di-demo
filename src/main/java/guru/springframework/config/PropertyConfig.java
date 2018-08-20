package guru.springframework.config;

import guru.springframework.beans.FakeDatasource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by carlosmartinez on 18/8/18 18:01
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

  @Value("${guru.user}")
  private String user;
  @Value("${guru.password}")
  private String password;
  @Value("${guru.dburl}")
  private String dburl;

  /*@Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer
        = new PropertySourcesPlaceholderConfigurer();
    return propertySourcesPlaceholderConfigurer;
  }*/

  @Bean
  public FakeDatasource FakeDatasource() {
    final FakeDatasource fakeDatasource = new FakeDatasource();
    fakeDatasource.setUser(this.user);
    fakeDatasource.setPassword(this.password);
    fakeDatasource.setUrl(this.dburl);
    return fakeDatasource;
  }
}
