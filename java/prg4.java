import java.util.Scanner;

interface Loan{
  void calculateEMI(double LoanAmount, int months);
}

interface Insurance{
  void calculateInsurance(double vehiclePrice);
}

class vehicle implements Loan,Insurance;
{
  private String vehicleNumber;
  private String Brand;
  private double price;

  public void addVehicle(String vehicleNumber,String Brand,double price){
    this.vehicleNumber=vehicleNumber;
    this.Brand=brand;
    this.price=price;
  }

  public void calculateEMI(double loanAmount,int months){
    double interestRate=0.08;
  }
}
