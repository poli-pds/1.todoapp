package co.com.poli.pds.todoapp.controller;

import co.com.poli.pds.todoapp.persistence.entity.Task;
import co.com.poli.pds.todoapp.persistence.entity.TaskStatus;
import co.com.poli.pds.todoapp.services.TaskService;
import co.com.poli.pds.todoapp.services.dto.TaskInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody TaskInDTO taskInDTO) {
        return this.taskService.createTask(taskInDTO);
    }

    @GetMapping
    public List<Task> findAll() {
        return this.taskService.findAll();
    }

    @GetMapping("/status/{status}")
    public List<Task> findAllByTaskStatus(@PathVariable("status") TaskStatus taskStatus) {
        return this.taskService.findAllByTaskStatus(taskStatus);
    }

    @PatchMapping("/mark_as_finished/{id}")
    public ResponseEntity<Void> markTaskAsFinished(@PathVariable("id") Long id) {
        this.taskService.markTaskAsFinished(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        this.taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
