
public class Trainee {
    int Id;
    String Name;
    int Age;
    String Designation;

    Trainee()
    {
        Id = 1;
        Name = "ABC";
        Age = 11;
        Designation = "QA" ;
    }

    void PutData()
    {
        System.out.print("\n\tTrainee Id     : "+Id);
        System.out.print("\n\tTrainee Name   : "+Name);
        System.out.print("\n\tTrainee Age    : "+Age);
        System.out.print("\n\tTrainee Salary : "+Designation);
    }

    public static void main(String args[])
    {

        Trainee T = new Trainee();

        T.PutData();

    }
}

