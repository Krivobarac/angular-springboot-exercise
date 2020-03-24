package space.krivobarac.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import space.krivobarac.bookstore.entities.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
