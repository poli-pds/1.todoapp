package co.com.poli.pds.todoapp.services;

import co.com.poli.pds.todoapp.mapper.TaskInDtoToTask;
import co.com.poli.pds.todoapp.persistence.entity.Task;
import co.com.poli.pds.todoapp.persistence.repository.TaskRepository;
import co.com.poli.pds.todoapp.services.dto.TaskInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDtoToTask mapper;

    public Task createTask(TaskInDTO taskInDTO) {
        Task task = mapper.map(taskInDTO);
        return this.repository.save(task);
    }

}
