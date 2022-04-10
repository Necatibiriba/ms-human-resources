package com.neca.hrworker.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.neca.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
