package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
