package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Łukasz Pelowski
 * @copyright Blue Media SA
 */
public interface BookRepository  extends CrudRepository<Author,Long> {
}
