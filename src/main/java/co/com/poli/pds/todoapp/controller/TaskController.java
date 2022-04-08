package co.com.poli.pds.todoapp.controller;

import co.com.poli.pds.todoapp.persistence.entity.Task;
import co.com.poli.pds.todoapp.services.TaskService;
import co.com.poli.pds.todoapp.services.dto.TaskInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO) {
        return this.taskService.createTask(taskInDTO);
    }


}
