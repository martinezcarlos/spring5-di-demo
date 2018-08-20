package guru.springframework;

import guru.springframework.beans.FakeDatasource;
import guru.springframework.beans.FakeJmsBroker;
import guru.springframework.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

  public static void main(final String[] args) {
    final ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

    final MyController controller = (MyController) ctx.getBean("myController");

    final FakeDatasource fakeDatasource = ctx.getBean(FakeDatasource.class);
    System.out.println("user: " + fakeDatasource.getUser());

    final FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
    System.out.println("user: " + fakeJmsBroker.getUsername());
  }
}
