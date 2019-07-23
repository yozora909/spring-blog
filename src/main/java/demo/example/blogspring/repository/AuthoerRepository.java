package demo.example.blogspring.repository;

import demo.example.blogspring.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoerRepository extends JpaRepository<Author,Long> {
}
