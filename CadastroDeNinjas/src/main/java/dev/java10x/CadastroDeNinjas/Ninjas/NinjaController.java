package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    /*
    GetMapping - puxar informaçoes
    PostMapping - mandar informações
    PutMapping - alterar informações
    PatchMapping - altera informações
    Deletemapping - deleta informações
     */

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

      // adicionar ninja (creat)
        @PostMapping("/criar")
                public String criarNinja() {
            return "Ninja Criado";
        }

        // mostrar todos os ninjas (read)
        @GetMapping("/listar")
                public List<NinjaModel> mostrarTodosOsNinjas() {
            return ninjaService.ListarNinjas() ;
        }

      // mostrar ninja por id (read)
        @GetMapping("/listarID")
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





