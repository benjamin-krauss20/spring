package org.example.tp01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

    @Autowired // Injection automatique du bean BavardService par Spring
    private BavardService bavardService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

    // Premier point d'entrée du TP 01 [cite: 114, 115]
    @GetMapping("hello")
    public String hello() {
        return "Bonjour, monde";
    }

    // Nouveau point d'entrée du TP 02 pour tester l'injection
    @GetMapping("/blabla")
    public String blabla() {
        // Appelle la méthode parler() du service injecté
        return bavardService.parler();
    }
}