package co.com.poli.pds.todoapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    @Column(name = "create_date")
    private LocalDateTime createdDate;
    private boolean finished;
    @Column(name = "task_status")
    private TaskStatus taskStatus;

}
