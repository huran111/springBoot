package demo.study01.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 13:39 2018/6/21
 * @Modified By:
 */
@ConfigurationProperties(prefix = "spring.mail")
public class MailProperties {
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String protocol = "smtp";
    private Charset defaultEncoding = DEFAULT_CHARSET;
    private Map<String, String> properties = new HashMap<String, String>();
    private String jndiName;
    private boolean testConnection;

    public static Charset getDefaultCharset() {
        return DEFAULT_CHARSET;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Charset getDefaultEncoding() {
        return defaultEncoding;
    }

    public void setDefaultEncoding(Charset defaultEncoding) {
        this.defaultEncoding = defaultEncoding;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    public boolean isTestConnection() {
        return testConnection;
    }

    public void setTestConnection(boolean testConnection) {
        this.testConnection = testConnection;
    }
}
