package com.eishapilkhwal.journalApp.repository;

import com.eishapilkhwal.journalApp.entity.JournalEntry;
import com.eishapilkhwal.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);

//    void deleteByUserName(String username);
}
