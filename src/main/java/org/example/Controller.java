package org.example;

import java.util.List;

/**
 * Передадим Training_Group_Service в конструктор Controller вместо создания
 * нового экземпляра внутри конструктора с помощью инверсии управления (IoC).
 * Это позволит контролировать, какой экземпляр Training_Group_Service
 * используется в Controller
 *
 * public Controller(Training_Group_Service training_group_service) {
 *         this.training_group_service = training_group_service;
 *     }
 *     ВМЕСТО
 *
 * public Controller() {
 * training_group_service = new Training_Group_Service();
 *     }
 */

@Component
class Controller {
    private final Training_Group_Service training_group_service;

    public Controller() {
        training_group_service = new Training_Group_Service();
    }

    public Study_Group add_group(Teacher teacher, List<Student> students) {
        return training_group_service.createGroup_Service(teacher, students);
    }
}

