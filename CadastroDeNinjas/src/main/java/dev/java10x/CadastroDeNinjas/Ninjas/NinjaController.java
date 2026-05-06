package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    /*
    GetMapping - puxar informaçoes
    PostMapping - mandar informações
    PutMapping - alterar informações
    PatchMapping - altera informações
    Deletemapping - deleta informações
     */

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }




}
