package comparingAndSorting;

import java.util.ArrayList;
import java.util.Collections;

class Course implements Comparable<Course> {
    public int courseId;
    public String courseName;

    public Course(int courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }
    @Override
    public int compareTo(Course otherCourse){
        return this.courseName.compareTo(otherCourse.courseName);
    }
    @Override
    public String toString(){
        return this.courseId +" "+this.courseName;
    }
}

public class ComparableInterface {
    public static void main(String[] args){
        ArrayList<Course> coursesList = new ArrayList<>();
        coursesList.add(new Course(320, "Angular"));
        coursesList.add(new Course(245, "Java"));
        coursesList.add(new Course(112, "React.js"));
        coursesList.add(new Course(890, "Boostrap"));
        coursesList.add(new Course(326, "CSS"));

        Collections.sort(coursesList);
        for(Course course : coursesList){
            System.out.println(course);
        }
    }
}
