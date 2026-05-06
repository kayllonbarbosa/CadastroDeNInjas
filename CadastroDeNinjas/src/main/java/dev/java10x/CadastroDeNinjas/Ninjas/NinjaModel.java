package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do banco de dados.
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id // tornar o atributo em id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// passar um estrategia de como gerar id
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne// um ninja tem uma unica missão
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrageira
    private MissoesModel missoes;




}
