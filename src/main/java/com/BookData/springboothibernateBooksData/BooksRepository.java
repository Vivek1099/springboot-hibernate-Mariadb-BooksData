package com.BookData.springboothibernateBooksData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer>
{

}
