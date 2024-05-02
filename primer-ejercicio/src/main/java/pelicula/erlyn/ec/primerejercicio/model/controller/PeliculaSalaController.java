package pelicula.erlyn.ec.primerejercicio.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pelicula.erlyn.ec.primerejercicio.model.entity.PeliculaSala;
import pelicula.erlyn.ec.primerejercicio.service.imlp.PeliculaSalaService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pelicula-sala")
public class PeliculaSalaController  {

    @Autowired
    private PeliculaSalaService peliculaSalaService;

    @PostMapping
    public PeliculaSala create(@RequestBody PeliculaSala peliculaSala) {
        return peliculaSalaService.save(peliculaSala);
    }

    @PutMapping("/{id}")
    public PeliculaSala update(@PathVariable Integer id, @RequestBody PeliculaSala peliculaSala) {
        // Asignar el id al objeto antes de actualizar
        peliculaSala.setIdPeliculaSala(id);
        return peliculaSalaService.save(peliculaSala);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        peliculaSalaService.deleteById(id);
    }

    @GetMapping("/{id}")
    public PeliculaSala findById(@PathVariable Integer id) {
        return peliculaSalaService.findById(id);
    }

    @GetMapping
    public List<PeliculaSala> findAll() {
        return peliculaSalaService.findAll();
    }
}
