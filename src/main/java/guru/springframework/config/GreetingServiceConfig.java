package guru.springframework.config;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by carlosmartinez on 12/8/18 22:03
 */
@Configuration
public class GreetingServiceConfig {

  @Bean
  GreetingServiceFactory greetingServiceFactory(final GreetingRepository greetingRepository) {
    return new GreetingServiceFactory(greetingRepository);
  }

  @Bean
  @Primary
  @Profile({"en", "default"})
  GreetingService primaryGreetingService(final GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.getGreetingService("en");
  }

  @Bean
  @Primary
  @Profile({"es"})
  GreetingService primarySpanishGreetingService(
      final GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.getGreetingService("es");
  }

  @Bean
  @Primary
  @Profile({"de"})
  GreetingService primaryGermanGreetingService(
      final GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.getGreetingService("de");
  }
}
