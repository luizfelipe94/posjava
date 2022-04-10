package br.edu.infnet.posjava.ingresso.model.service;

import br.edu.infnet.posjava.ingresso.model.domain.Futebol;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class FutebolService {

    private static Map<Integer, Futebol> mapa = new HashMap<>();
    private static Integer key = 1;

    public Collection<Futebol> obterLista() {
        return mapa.values();
    }

    public void incluir(Futebol futebol){
        key++;
        futebol.setId(key);
        mapa.put(key, futebol);
    }

    public void excluir(Integer id){
        mapa.remove(id);
    }

    public Futebol obterPorId(Integer id){
        return mapa.get(id);
    }

}
