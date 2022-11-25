package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	private String authorName;
	private int NoOfCopies;
}
