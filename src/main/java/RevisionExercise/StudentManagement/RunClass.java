package RevisionExercise.StudentManagement;

public class RunClass
{
    static void main()
    {
        int marksA[] = {1,6,3,54,81};
        int marksB[] = {-5,0,0,0,0};
        int marksC[] = {100,80,81,92,32};
        int marksD[] = {12,55,62,43,55};
        int marksE[] = {60,62,64,66,68};
        int marksF[] = {105,110,-1000,100,100};

        Student studentA = new Student(555, "Red John", marksC);
        Student studentB = new Student(264,"Gary",marksB);
        Student studentC = new Student(5757,"Turtle",marksD);
        Student studentD = new Student(1111, "Wooly",marksD);
        Student studentE = new Student(4444,"Fanta",marksE);
        Student studentF = new Student(10,"Nepotism Bear", marksF);

        System.out.println(studentA.displayStudent());
        System.out.println(studentC.displayStudent());

        System.out.println("Average: " + studentE.calculateAverage() + "; " + studentE.getGrade());


        System.out.println(studentF.displayStudent());
        System.out.println("Nepotism Average:  " + studentF.calculateAverage() + "'; " + studentF.getGrade());


    }
}
