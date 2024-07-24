package br.com.janicelio.scrennmatch_sem_web;


import br.com.janicelio.scrennmatch_sem_web.model.DadosSerie;
import br.com.janicelio.scrennmatch_sem_web.service.ConverteDados;
import br.com.janicelio.scrennmatch_sem_web.service.ConsumoApi;
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
		var consumoApi = new ConsumoApi();

		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=c4ee433");

		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

		System.out.println(dados);
	}


}
