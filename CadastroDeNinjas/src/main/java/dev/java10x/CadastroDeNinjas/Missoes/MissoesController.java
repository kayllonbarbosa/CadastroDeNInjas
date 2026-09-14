package dev.java10x.CadastroDeNinjas.Missoes;

// LOCALHOST:8080/

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- Mandar uma requisisao para mostrar as missoes
    @GetMapping("/listar")
    public String listarMissao(){
        return "missoes listadas com sucesso";
    }
    // POST -- mandar uam requisisao para criar as missoes
    @PostMapping("/criar")
    public String criarMissao() {
        return "missao criada com sucesso";
    }
    // PUT -- mandar uma requisisao para alterar as missoes
    @PutMapping("/altera")
    public String alteraMissao(){
        return "missao alterada com sucesso";
    }
    // DELETE -- mandar requisisao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletaMissao(){
        return "missao deletada com sucesso";
    }



}
