import javax.swing.*;
//importing a Java package to include a simple GUI
public class Loan {
    double principal;
    private final double rate=13.5;
    private int time;
    Loan(){
        principal =0;

    }
    //Final Tests
    Loan(double principal, int time){
        this.principal = principal;
        this.time=time;
    }
    public double getPrincipal(){
        return principal;
    }
    public double getRate(){
        return rate;
    }
    public void setPrincipal(double principal){
        this.principal = principal;
    }
    public void setTime(int time){
        this.time=time;
    }
    public double Findinterest(){
        //Finding the interest
        double calc1= ((rate/100)+1);
        double calc2=Math.pow(calc1,time);
        return principal *calc2;
    }

    public static void main(String[] args) {
        Loan l1=new Loan();
        Double principle;
        principle =Double.parseDouble(JOptionPane.showInputDialog(null,"Enter amount you want to borrow: "));
        l1.setPrincipal(principle);
        int time=Integer.parseInt(JOptionPane.showInputDialog("Enter number of years you intend to settle the loan"));
        l1.setTime(time);
        //l1.Findinterest();
        JOptionPane.showMessageDialog(null,"Amounts to: "+Math.ceil(l1.Findinterest()));



    }
}
