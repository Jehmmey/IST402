package psutask.dao;

import org.springframework.data.repository.CrudRepository;

import psutask.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
