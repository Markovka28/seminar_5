package org.example;

import java.util.List;

/**
 * Внедрены зависимости, путем использования фреймворка, Spring,
 * для автоматического создания экземпляров Training_Group_Service и передачи их в Controller.
 * Для контроля, какой экземпляр Training_Group_Service используется в Controller
 */

@Service
class Training_Group_Service {
    public Study_Group createGroup_Service(Teacher teacher, List<Student> students) {
        return new Study_Group(teacher, students);
    }
}
