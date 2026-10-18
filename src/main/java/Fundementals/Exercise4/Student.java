package Fundementals.Exercise4;

public class Student
{

    private final String name;
    private final int grade;

    public Student(String name, int grade)
    {
        if(grade > 100 || grade < 0)
        {
            throw new IllegalArgumentException("Invalid grade! please enter one BETWEEN 0 and 100!");
        }
        this.name = name;
        this.grade = grade;
    }

    public int getGrade()
    {
        return grade;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Name (" + name + ") || Grade (" + grade + ")";
    }
}
