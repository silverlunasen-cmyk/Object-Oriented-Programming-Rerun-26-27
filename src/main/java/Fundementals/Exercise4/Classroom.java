package Fundementals.Exercise4;

import java.util.ArrayList;
import java.util.List;


public class Classroom
{
    private final List<Student> students = new ArrayList<>();

    public Classroom()
    {

    }

    public void add(Student s) {
        if (s != null) {
            students.add(s);
        }
    }
    public Student getTopStudent()
    {
        int topGrade = Integer.MIN_VALUE;
        Student top = null;

        for (int i = 0; i < students.size(); i++)
        {
            if(topGrade < students.get(i).getGrade())
            {
                topGrade = students.get(i).getGrade();
                top = students.get(i);
            }
        }
        return top;
    }

    public Double getAverage()
    {
        int total = 0;
        double average = 0;

        for(int i = 0; i < students.size(); i++)
        {
            total += students.get(i).getGrade();
        }
        average = total/ students.size();

        return average;
    }

    public void printAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}