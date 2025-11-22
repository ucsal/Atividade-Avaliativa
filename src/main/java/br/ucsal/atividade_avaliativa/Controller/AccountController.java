package br.ucsal.atividade_avaliativa.Controller;
import org.springframework.beans.factory.annotation.Value; 
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RefreshScope
@RequestMapping("/account")
public class AccountController {

    @Value("${custom.message:Mensagem Padrão}") 
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}