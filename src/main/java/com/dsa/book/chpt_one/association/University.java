package main.java.com.dsa.book.chpt_one.association;

import java.util.*;

public class University {
    private static class Department {
        private final String name;
        private Set<Professor> members;

        public Department(String name) {
            this.name = name;
            members = new HashSet<>();
        }

        public void add(Professor professor) {
            members.add(professor);
        }
    }

    private final String name;
    Map<String, Department> departments;

    public University(String name) {
        this.name = name;
        departments = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public Set<String> getDepartments() {
        return departments.keySet();
    }

    public void addDepartment(String name, Set<Professor> members) {
        Department department = new Department(name);
        departments.put(name, department);
        department.members.addAll(members);
    }

    public void add(Professor professor, String depName) {
        Department department = departments.get(depName);
        if (department == null) {
            throw new RuntimeException(depName + " does not exist.");
        }
        department.add(professor);
    }
}
