package com.drizera.CadastroDeNinjas.Missoes;

import com.drizera.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //Uma missao para muitos ninjas
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;


}
