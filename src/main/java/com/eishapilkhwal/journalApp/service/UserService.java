package com.eishapilkhwal.journalApp.service;

import com.eishapilkhwal.journalApp.entity.JournalEntry;
import com.eishapilkhwal.journalApp.entity.User;
import com.eishapilkhwal.journalApp.repository.JournalEntryRepository;
import com.eishapilkhwal.journalApp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class UserService {

    // logic to crate entry in db
    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User user){
        try{

            userRepository.save(user);
        } catch (Exception e) {
            log.error("Exception ", e);

        }
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }

//    public void deleteByUserName(String userName){
//        userRepository.deleteByUserName(userName);
//    }
}
