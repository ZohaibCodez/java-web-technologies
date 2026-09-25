public class Employee{
    private String first_name;
    private String last_name;
    private String SSN;

    public Employee(String _first_name,String _last_name,String _SSN){
        this.first_name = _first_name;
        this.last_name = _last_name;
        this.SSN = _SSN;
    }

    public String get_first_name() { return first_name; }
    public void set_first_name(String _first_name) {
        this.first_name = _first_name;
    }

    public String get_last_name() { return last_name; }
    public void set_last_name(String _last_name) {
        this.last_name = _last_name;
    }

    public String get_SSN() { return SSN; }
    public void set_SSN(String _SSN) {
        this.SSN = _SSN;
    }

    public String toString(){
        return ("Base Employee: " + this.first_name + " " + this.last_name + " " + this.SSN);
    }

    public double earnings(){
        System.out.println("Employee's Earning");
        return 0.0;
    }
}