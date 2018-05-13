package Model;

public class Payroll {

    private float hourlyRate;
    private float shiftHours;
    private float totalMonthlyPay;

    public Payroll(float hourlyRate, float hours) {
        this.hourlyRate = hourlyRate;
        this.shiftHours = hours;
        
    }

    public float getRate() {
        return hourlyRate;
    }

    public float getHours() {
        return shiftHours;
    }

    public float calculatePay(float shiftHours, float hourlyRate) {

        if (shiftHours<= 40){
            totalMonthlyPay = this.shiftHours * this.hourlyRate;
        }


        return totalMonthlyPay;
    }
    public float displaySalary(float totalMonthlyPay)
    {
        System.out.print("The Salary is "+ totalMonthlyPay);
        return totalMonthlyPay;
    }


}
