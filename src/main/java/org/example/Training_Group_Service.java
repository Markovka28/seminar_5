package org.example;

import java.util.List;

class Training_Group_Service {
    public Study_Group createGroup_Service(Teacher teacher, List<Student> students) {
        return new Study_Group(teacher, students);
    }
}
