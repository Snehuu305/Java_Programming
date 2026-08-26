import java.util.Scanner;

class Employee{
    public String name;
    public int salary;

   public Employee(String Name, int Salary) {
          this.name = Name;
          this.salary = Salary;    
    }
}

class Manager extends Employee{
    public int bonus = 0;
//    public Manager()
//    {
//        super(name);
//        super(salary);
//    }

   public void Bonus() {
      if(super.salary > 50000) {
        bonus = 5000;
        salary = bonus + salary;
        System.out.println("Approved bonus is " + bonus + " and total Salary is " + salary);
              System.out.println();
      }
      
      else {
            bonus = 2000;
            salary = bonus + salary;
           System.out.println("Approved bonus is " + bonus + " and total Salary is " + salary);
                 System.out.println();
        }

   }
}


class EmployeesBonus
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        for(int i = 1; i < 4; i++){
           System.out.println("Enter the name and salary of Employee : ");
           int Salary = sobj.nextInt();
           String Name = sobj.nextLine();

           Manager mobj = new Manager(Name, Salary);
            mobj.Bonus();   
        }

    }
}
