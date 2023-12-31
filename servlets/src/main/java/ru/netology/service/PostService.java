package src.main.java.ru.netology.service;

import org.springframework.stereotype.Service;
import src.main.java.ru.netology.exception.NotFoundException;
import src.main.java.ru.netology.model.Post;
import src.main.java.ru.netology.repository.PostRepository;

import java.util.List;

//Service - бизнес логика

@Service
public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> all() {
        return repository.all();
    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public void removeById(long id) {
        repository.removeById(id);
    }
}

