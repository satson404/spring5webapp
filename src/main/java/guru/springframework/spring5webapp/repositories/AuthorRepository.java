package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Łukasz Pelowski
 * @copyright Blue Media SA
 */
public interface AuthorRepository extends CrudRepository<Book, Long> {
}
