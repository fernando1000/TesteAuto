package x10d;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteAutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteAutoApplication.class, args);
		
		System.out.println("A soma deu: "+ new Somador().soma(1, 2));
	}

}
