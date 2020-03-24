package space.krivobarac.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import space.krivobarac.bookstore.entities.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {

}
