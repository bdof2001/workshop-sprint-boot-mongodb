package pt.nandes.workshopmongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.nandes.workshopmongo.domain.Post;
import pt.nandes.workshopmongo.repository.PostRepository;
import pt.nandes.workshopmongo.services.exception.ObjectNotFoundException;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}