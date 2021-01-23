package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.repositories.AuthorRepo;
import org.springframework.stereotype.Component;

@Component
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void authorOperations() {

        Author a1 = new Author();
        a1.setName("Tolstoy");

       
        authorRepo.save(a1);

        System.out.println(a1);
    }
}

