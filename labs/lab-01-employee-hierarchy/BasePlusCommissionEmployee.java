public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    BasePlusCommissionEmployee(String _first_name, String _last_name, String _SSN, int _grossSales, double _commissionRate, double _baseSalary){
        super(_first_name,_last_name,_SSN,_grossSales, _commissionRate);
        setBaseSalary(_baseSalary);
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }
    public void setBaseSalary(double _baseSalary){
        this.baseSalary = _baseSalary;
    }

    @Override
    public double earnings(){
        return ((get_CommissionRate()*get_grossSales()) + baseSalary);
    }

    @Override
    public String toString(){
        return ("BasePlusCommissionEmployee Employee: " + get_first_name() + " " + get_last_name() + " " + get_SSN() + " " + get_CommissionRate() + " " + get_grossSales() + " " + this.baseSalary);
    }
}