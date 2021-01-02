package com.khaled.mongoDB.SpringbootMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.khaled.mongoDB.SpringbootMongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
