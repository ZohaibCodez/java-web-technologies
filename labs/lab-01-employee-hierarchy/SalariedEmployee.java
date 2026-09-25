public class SalariedEmployee extends Employee{
    private double weekly_salary;

    SalariedEmployee(String _first_name, String _last_name, String _SSN, double _weekly_salary){
        super(_first_name,_last_name,_SSN);
        setWeeklySalary(_weekly_salary);
    }

    public double getWeeklySalary(){
        return weekly_salary;
    }

    public void setWeeklySalary(double _weekly_salary){
        this.weekly_salary = _weekly_salary;
    }

    @Override
    public double earnings(){
        return this.weekly_salary;
    }

    @Override
    public String toString(){
        return ("Salaried Employee: " + get_first_name() + " " + get_last_name() + " " + get_SSN() + " " + this.weekly_salary);
    }
}