package day2;

public class Course {
    private Student[] students;
    private Faculty faculty;

    Course(Student[] _students,Faculty _faculty){
        students=_students;
        faculty=_faculty;
    }
    public void addStudent(Student student){

    }
    // setters
    public void setFaculty(Faculty _faculty){
            faculty=_faculty;
    }
    // getter
    public Faculty getFaculty(){
        return faculty;
    }
}