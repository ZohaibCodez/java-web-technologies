public class CommissionEmployee extends Employee{
    private int grossSales;
    private double commissionRate;

    CommissionEmployee(String _first_name, String _last_name, String _SSN, int _grossSales, double _commissionRate){
        super(_first_name,_last_name,_SSN);
        set_grossSales(_grossSales);
        set_commissionRate(_commissionRate);
    }

    public int get_grossSales(){
        return this.grossSales;
    }
    public void set_grossSales(int _grossSales){
        this.grossSales = _grossSales;
    }

    public double get_CommissionRate(){
        return this.commissionRate;
    }
    public void set_commissionRate(double _commissionRate){
        this.commissionRate = _commissionRate;
    }

    @Override
    public double earnings(){
        return commissionRate*grossSales;
    }

    @Override
    public String toString(){
        return ("CommissionEmployee Employee: " + get_first_name() + " " + get_last_name() + " " + get_SSN() + " " + this.commissionRate + " " + this.grossSales);
    }
}