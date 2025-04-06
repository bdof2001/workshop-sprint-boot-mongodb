package pt.nandes.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pt.nandes.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}