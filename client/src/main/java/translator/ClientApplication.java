package translator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import translator.client.Cliente;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner{
  public static void main(final String[] args) {
    SpringApplication.run(ClientApplication.class, args);
  }

  @Override
  public void run(String[] args){
    Cliente.main();
  }
}
