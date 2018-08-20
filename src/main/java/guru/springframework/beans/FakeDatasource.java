package guru.springframework.beans;

/**
 * Created by carlosmartinez on 18/8/18 17:56
 */
public class FakeDatasource {

  private String user;
  private String password;
  private String url;

  public String getUser() {
    return this.user;
  }

  public void setUser(final String user) {
    this.user = user;
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
