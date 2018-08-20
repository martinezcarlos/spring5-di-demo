package guru.springframework.beans;

/**
 * Created by carlosmartinez on 20/8/18 19:28
 */
public class FakeJmsBroker {

  private String username;
  private String password;
  private String url;

  public String getUsername() {
    return this.username;
  }

  public void setUsername(final String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(final String url) {
    this.url = url;
  }
}
