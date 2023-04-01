package com.usecase.leaves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecase.leaves.model.Leaves;

public interface Leaverepo extends JpaRepository<Leaves, Integer> {

}
