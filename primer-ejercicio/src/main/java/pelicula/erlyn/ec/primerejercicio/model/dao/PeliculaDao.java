package pelicula.erlyn.ec.primerejercicio.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pelicula.erlyn.ec.primerejercicio.model.entity.Pelicula;

@Repository
public interface PeliculaDao extends JpaRepository<Pelicula, Integer> {
    // Aquí puedes definir métodos adicionales para operaciones específicas si lo necesitas
}
