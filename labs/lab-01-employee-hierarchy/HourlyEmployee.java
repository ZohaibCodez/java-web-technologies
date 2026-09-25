public class HourlyEmployee extends Employee{
    private double wages;
    private int hours;

    HourlyEmployee(String _first_name, String _last_name, String _SSN, double _wages, int _hours){
        super(_first_name,_last_name,_SSN);
        setWages(_wages);
        setHours(_hours);
    }

    public double getWages(){
        return this.wages;
    }
    public void setWages(double _wages){
        this.wages = _wages;
    }

    public int getHours(){
        return this.hours;
    }
    public void setHours(int _hours){
        this.hours = _hours;
    }

    @Override
    public double earnings(){
        if (this.hours <= 40)
            return this.wages*this.hours;
        else
            return 40*wages + (hours-40)* wages*1.5;
    }

    @Override
    public String toString(){
        return ("Hourly Employee: " + get_first_name() + " " + get_last_name() + " " + get_SSN() + " " + this.wages + " " + this.hours);
    }
}