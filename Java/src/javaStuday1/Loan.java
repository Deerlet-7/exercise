package javaStuday1;

/**
 * Created by Deerlet-7 on 2020/6/1 17:46
 */
public class Loan
{
    private static final int MONTHS_IN_YEAR=12;
    private double loanAmount;//贷款多少钱
    private double monthlyInterestRate;//月利率
    private int numberOfPayments;//每个月还多少钱

    //构造函数
    public Loan(double amount,double rate,int period)
    {
        setAmount(amount);
        setRate(rate);
        setPeriod(period);
    }
    public double getAmount()
    {
        return loanAmount;
    }
    public void setAmount(double amount) {
        loanAmount=amount;
    }
    public void setRate(double  annualRate)
    {
        monthlyInterestRate= annualRate/100.0/MONTHS_IN_YEAR;
    }
    public double getRate()
    {
        return monthlyInterestRate*100.0*MONTHS_IN_YEAR;
    }
    public void setPeriod(int periodInYear)
    {
        numberOfPayments=periodInYear*MONTHS_IN_YEAR;
    }
    public int getPeriod()
    {
        return numberOfPayments/MONTHS_IN_YEAR;
    }
    public double getMonthlyPayment()
    {
        double monthlyPayment;
        monthlyPayment=(loanAmount* monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
        return  monthlyPayment;
    }
    public double getTotalPayment()
    {
        double totalPayment;
        totalPayment=getMonthlyPayment()*numberOfPayments;
        return totalPayment;
    }
}

