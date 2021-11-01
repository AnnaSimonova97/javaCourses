package lessonlesson1;

import java.util.ArrayList;
import java.util.HashMap;

public class University {
    private HashMap<Group, ArrayList<Student>> university = new HashMap<>();

    public void addGroup(Group group) {
        if (university.containsKey(group)) {
            System.out.println("Такая группа в университете уже есть!");
        } else {
            university.put(group, new ArrayList<Student>());
        }
    }

    public void addStudent(Student student, String groupName) {
        if (isUniversityHasGroup(groupName)) {
            Group group = getGroupByName(groupName);
            ArrayList<Student> students = university.get(group);
            students.add(student);
            university.put(group, students);

        } else {
            Group group = new Group(groupName);
            ArrayList<Student> students = new ArrayList<>();
            students.add(student);
            university.put(group, new ArrayList<Student>());
        }
    }

    private boolean isUniversityHasGroup(String groupName) {
        for (Group group : university.keySet()) {
            if (group.getName().equals(groupName)) {
                return true;
            }
        }
        return false;
    }

    private Group getGroupByName(String groupName) {
        for (Group group : university.keySet()) {
            if (group.getName().equals(groupName)) {
                return group;
            }
        }
        return null;
    }

}
