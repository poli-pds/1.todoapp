package co.com.poli.pds.todoapp.persistence.repository;

import co.com.poli.pds.todoapp.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

}
