package com.wavecheng.ISBNRunner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wavecheng.ISBNRunner.entity.CheckBatch;

@Repository
public interface CheckBatchRepository extends JpaRepository<CheckBatch, Integer> {

}
