package org.example;

import java.util.List;

class Controller {
    private final Training_Group_Service training_group_service;

    public Controller() {
        training_group_service = new Training_Group_Service();
    }

    public Study_Group add_group(Teacher teacher, List<Student> students) {
        return training_group_service.createGroup_Service(teacher, students);
    }
}
