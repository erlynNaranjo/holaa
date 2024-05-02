package pelicula.erlyn.ec.primerejercicio.service.imlp;

import pelicula.erlyn.ec.primerejercicio.model.entity.PeliculaSala;
import pelicula.erlyn.ec.primerejercicio.model.dao.peliculaSalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaSalaService {

    @Autowired
    private peliculaSalaRepository peliculaSalaRepository;

    public List<PeliculaSala> findAll() {
        return peliculaSalaRepository.findAll();
    }

    public PeliculaSala findById(Integer id) {
        return peliculaSalaRepository.findById(id).orElse(null);
    }

    public PeliculaSala save(PeliculaSala peliculaSala) {
        return peliculaSalaRepository.save(peliculaSala);
    }

    public void deleteById(Integer id) {
        peliculaSalaRepository.deleteById(id);
    }
}
