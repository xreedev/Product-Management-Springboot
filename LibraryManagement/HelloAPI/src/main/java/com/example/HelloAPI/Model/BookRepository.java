package com.example.HelloAPI.Model;

import com.example.HelloAPI.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

}
