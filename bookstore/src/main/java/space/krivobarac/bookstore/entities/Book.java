package space.krivobarac.bookstore.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@ToString
public class Book {
	@Getter
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter @Setter
	@Column(length = 255, unique = true)
	private String sku;
	@Getter @Setter
	@Column(length = 255)
	private String name;
	@Getter @Setter
	@Column(length = 255)
	private String description;
	@Getter @Setter
	@Column(precision = 13)
	private BigDecimal unitPrice;
	@Getter @Setter
	@Column(length = 255)
	private String imageUrl;
	@Getter @Setter
	private Boolean active;
	@Getter @Setter
	@Column(length = 11)
	private Integer unitsInStock;
	@Getter @Setter
	@DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime createdDate;
	@Getter @Setter
	@DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime updatedDate;
	@Getter @Setter
	@ManyToOne @JoinColumn(name = "category_id", nullable = false)
	private BookCategory bookCategory;
}
