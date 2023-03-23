import java.util.ArrayList;

public class Student extends Person {

    public Student(String name, ArrayList passedCourse){
        super(name);
        this.passedCourse = passedCourse;
        this.currentCourse = new ArrayList<>();
    }

    ArrayList<String>passedCourse;
    ArrayList<String>currentCourse;

    @Override
    public boolean addCourse(String course) {
        for (int i = 0; i < passedCourse.size(); i++) {
            if (course.equals(passedCourse.get(i))) {
                return false;
            }
            currentCourse.add(course);
            return true;
        }
        return false;
    }



}
