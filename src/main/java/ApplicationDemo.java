import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author shiqing
 * @data 18/5/17
 */
@SpringBootApplication
public class ApplicationDemo {

  public static void main(String[] args) throws Exception {
    System.out.println(" springApplication run !");
    SpringApplication.run(ApplicationDemo.class, args);
  }
}