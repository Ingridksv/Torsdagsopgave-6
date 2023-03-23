import java.util.ArrayList;

public class Teacher extends Person{

    public Teacher(String name, ArrayList canTeach){
        super(name);
        this.canTeach = canTeach;
        this.currentCourse = new ArrayList<>();
    }

    ArrayList<String>canTeach;

    ArrayList<String>currentCourse;

    @Override
    public boolean addCourse(String teach){
        for(int i = 0; i < canTeach.size();i++){
            if(teach.equals(canTeach.get(i))){
                return false;
            }
            currentCourse.add(teach);
            return true;
        }
        return false;
    }
}
