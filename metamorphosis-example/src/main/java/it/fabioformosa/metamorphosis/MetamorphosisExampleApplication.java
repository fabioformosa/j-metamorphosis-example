package it.fabioformosa.metamorphosis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetamorphosisExampleApplication {

  private static final Logger log = LoggerFactory.getLogger(MetamorphosisExampleApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(MetamorphosisExampleApplication.class, args);
    log.info("This is a webapp! To test it, open this URL: http://localhost:8080/test");
  }
}
