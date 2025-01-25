package com.eishapilkhwal.journalApp.entity;


import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

@Document(collection = "users")
@Data
public class User {

    @Id
    private ObjectId id;
    @Indexed(unique = true)        // Searching for userName will be fast and userName should be unique
    @NonNull
    private String userName;
    @NonNull
    private String password;

    @DBRef                          // Reference is created in user of journal_entries
    private List<JournalEntry> journalEntries = new ArrayList<>();
}
