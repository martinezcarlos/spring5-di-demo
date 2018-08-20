package guru.springframework.config;

import guru.springframework.beans.FakeDatasource;
import guru.springframework.beans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by carlosmartinez on 18/8/18 18:01
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:jms.properties")
})
public class PropertiesConfig {

  @Value("${guru.user}")
  private String user;
  @Value("${guru.password}")
  private String password;
  @Value("${guru.dburl}")
  private String dburl;

  @Value("${guru.jms.username}")
  private String jmsUsername;
  @Value("${guru.jms.password}")
  private String jmsPassword;
  @Value("${guru.jms.url}")
  private String jmsUrl;

  /*@Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    final PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer
        = new PropertySourcesPlaceholderConfigurer();
    return propertySourcesPlaceholderConfigurer;
  }*/

  @Bean
  public FakeDatasource FakeDatasource() {
    final FakeDatasource fakeDatasource = new FakeDatasource();
    fakeDatasource.setUser(user);
    fakeDatasource.setPassword(password);
    fakeDatasource.setUrl(dburl);
    return fakeDatasource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker() {
    final FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUsername(jmsUsername);
    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    return fakeJmsBroker;
  }
}
