package com.codesoom.project.domains;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Generated
@Entity
@Getter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private TaskStatus taskStatus = TaskStatus.TO_DO;
}
