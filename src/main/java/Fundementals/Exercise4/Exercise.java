package Fundementals.Exercise4;

public class Exercise
{
    static void main()
    {
        Classroom classroom = new Classroom();

        Student s1 = new Student("Jack", 23);
        Student s2 = new Student("Mary", 95);
        Student s3 = new Student("Alex", 70);

        classroom.add(s1);
        classroom.add(s2);
        classroom.add(s3);

        System.out.println("The top student is: " + classroom.getTopStudent());

        System.out.println("The average grade is: " + classroom.getAverage());

        classroom.printAll();

        Student s4 = new Student("Niall", -1000);



    }

}
