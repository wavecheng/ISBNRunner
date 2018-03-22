package com.wavecheng.ISBNRunner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wavecheng.ISBNRunner.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
