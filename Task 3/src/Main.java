import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        ArrayList<Person> persons = new ArrayList<>();

        Student s1 = new Student("Ingrid", new ArrayList(Arrays.asList("Java 1.0", "Python")));
        Student s2 = new Student("Yolo", new ArrayList(Arrays.asList("Java 1.0", "Python")));
        Student s3 = new Student("Signe", new ArrayList(Arrays.asList("Java 1.0", "Math")));
        Student s4 = new Student("Ailin", new ArrayList(Arrays.asList("Java 1.0", "Dansk")));

        Teacher t1 = new Teacher("Signe", new ArrayList(Arrays.asList("Java 1.0", "Python")));
        Teacher t2 = new Teacher("Alex", new ArrayList(Arrays.asList("Math", "Dansk")));
        Teacher t3 = new Teacher("Tess", new ArrayList(Arrays.asList("Java 1.0", "Python")));
        Teacher t4 = new Teacher("Sarah", new ArrayList(Arrays.asList("Dansk", "Math")));

        //Tilføj alle objekter i persons arrayliste

        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);
        persons.add(t4);


        for(int i = 0; i < persons.size(); i++){
            if(persons.get(i).addCourse("Java 1.0")) {
            }else{
                if(persons.get(i) instanceof Student){
                    System.out.println(persons.get(i).getName() + " har bestået");
                }
                if(persons.get(i) instanceof Teacher){
                    System.out.println(persons.get(i).getName() + " kan ikke undervise i dette fag");
                }
            }
        }

    }
}
