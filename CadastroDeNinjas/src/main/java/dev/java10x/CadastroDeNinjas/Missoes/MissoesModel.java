package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // anotação Lombok - construtor automatico sem argumento
@AllArgsConstructor // anotação Lombok - construtor automatico com argumento e acrescenta automaticamente
@Data // anotação Lombok - cria getts e setts automaticamente
public class MissoesModel {

    // @OneToMany - uma missão pode ter varios ninjas
    // @ManyToOne - um ninja tem uma unica missão

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // uma missão pode ter varios ninjas
    private List<NinjaModel> ninja;




}
