package pelicula.erlyn.ec.primerejercicio.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pelicula.erlyn.ec.primerejercicio.model.entity.PeliculaSala;

public interface peliculaSalaRepository extends JpaRepository<PeliculaSala, Integer> {
    // Aquí puedes agregar métodos adicionales específicos de consulta si los necesitas
}
