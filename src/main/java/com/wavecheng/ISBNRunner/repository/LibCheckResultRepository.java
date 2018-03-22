package com.wavecheng.ISBNRunner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wavecheng.ISBNRunner.entity.LibraryCheckResult;

@Repository
public interface LibCheckResultRepository extends JpaRepository<LibraryCheckResult, Integer> {

}
