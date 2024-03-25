package br.com.alura.screenmatchFrases.service;

import br.com.alura.screenmatchFrases.dto.FraseDTO;
import br.com.alura.screenmatchFrases.model.Frase;
import br.com.alura.screenmatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}