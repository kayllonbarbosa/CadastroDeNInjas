package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {


    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // listar todos os meus ninjas
    public List<NinjaModel> ListarNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar todos os meus ninjas por id
     public NinjaModel ListarNinjasPorId(Long id) {
         Optional<NinjaModel> ninjaporId = ninjaRepository.findById(id);
         return ninjaporId.orElse(null);
     }




}
