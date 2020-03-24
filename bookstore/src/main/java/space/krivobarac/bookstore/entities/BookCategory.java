package space.krivobarac.bookstore.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@ToString
public class BookCategory {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	private Long id;
	@Getter @Setter
	private String categoryName;
	@Getter
	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	private Set<Book> books;
}
