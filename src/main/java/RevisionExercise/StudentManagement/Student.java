package RevisionExercise.StudentManagement;

public class Student
{
    private int studentId;
    private String name;
    private int[] grades;

    public Student(int studentId, String name, int[] grades)
    {
        if(grades.length != 5)
        {
            throw new IllegalArgumentException("The grades array has to have 5 values, no more, no less!");
        }

        this.studentId = studentId;
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage()
    {
        int total = 0;

        for(int i = 0; i < grades.length; i++)
        {
            total = total + grades[i];
        }
        double average = total/grades.length;

        return average;
    }

    public String getGrade()
    {
        double average = calculateAverage();

        if(average >= 70 && average <= 100)
        {
            return "You got an A! Great job!";
        }
        else if (average <= 69 && average >= 60)
        {
            return "You got a B! Solid effort!";
        }
        else if (average <= 59 && average >= 50)
        {
            return "You got a C!";
        }
        else if (average <= 49 && average >= 40)
        {
            return "You got a D! Barely passed but sure lookit yknow yourself!";
        }
        else if(average <= 0 && average  >= 39)
        {
            return "You got an F. F is for failure, which is what you are! :3";
        }
        else if(average > 100)
        {
            return "You managed to somehow score above 100! That's honestly remarkable!";
        }
        else if (average < 0)
        {
            return "literally how";
        }
        return "";
    }


    public String displayStudent()
    {
        return "Student's Name: " + name + " || Student ID: " + studentId + " || Student's grades" + grades;
    }











}
