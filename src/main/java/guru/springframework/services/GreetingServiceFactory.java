package guru.springframework.services;

/**
 * Created by carlosmartinez on 12/8/18 21:59
 */
public class GreetingServiceFactory {

  private final GreetingRepository greetingRepository;

  public GreetingServiceFactory(final GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public GreetingService getGreetingService(final String lang) {
    switch (lang) {
      case "de":
        return new PrimaryGermanGreetingService(this.greetingRepository);
      case "es":
        return new PrimarySpanishGreetingService(this.greetingRepository);
      case "en":
      default:
        return new PrimaryGreetingService(this.greetingRepository);
    }
  }
}
