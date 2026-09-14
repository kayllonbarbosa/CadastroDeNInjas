package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

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

      // adicionar ninja (creat)
        @PostMapping("/criar")
                public String criarNinja() {
            return "Ninja Criado";
        }

        // mostrar todos os ninjas (read)
        @GetMapping("/todos")
                public String mostrarTodosOsNinjas() {
            return "mostrar Ninja";
        }

      // mostrar ninja por id (read)
        @GetMapping("/todosID")
        public String mostrarTodosOsNinjasPorId() {
            return "mostrar Ninja por id";
        }

        // alterar dados dos ninjas (update)
        @PutMapping("/alterarID")
        public String alterarNinjaPorId() {
            return "alterar Ninja por id";
        }

      // deltar ninja (delete)
        @DeleteMapping("/deletarID")
                public String deletarNinjaPorID(){
            return "Ninja deletado por id";

        }
    }




}
