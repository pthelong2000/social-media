package app.postservice.repository;


import app.postservice.entity.Post_Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post_Article, Long> {

}
