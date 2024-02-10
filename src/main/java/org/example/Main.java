package org.example;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy в HH час. mm мин. ss сек.");
        sdf.setCalendar(Calendar.getInstance(new Locale("ru")));
        Teacher teacher = new Teacher(1, "Валерием Крыловым");
        List<Student> students = List.of(
                new Student(1, "Stud 1"),
                new Student(2, "Stud 2"),
                new Student(3, "Stud 3"),
                new Student(4, "Stud 4"),
                new Student(5, "Stud 5")
        );
        Controller controller = new Controller();
        Study_Group group = controller.add_group(teacher, students);

        System.out.println("Класс с учителем " + group.teacher().name() + " и " +
                group.students().size() + " обучающимися образована: " + sdf.format(currentDate));
    }
}