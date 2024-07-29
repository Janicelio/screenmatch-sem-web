package br.com.janicelio.scrennmatch_sem_web;


import br.com.janicelio.scrennmatch_sem_web.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrennmatchSemWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScrennmatchSemWebApplication.class, args);
	}

	// CommandLineRunner: é executada apenas na inicialização da aplicação
	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();

	}



}
