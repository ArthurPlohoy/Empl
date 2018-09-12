package com.company.ent;
import com.company.enumer.Position;
import java.util.Objects;


public class Employee {
    private String name;
    private int hours;
    private double rate;
    private Position position;
    private static int Hours;
    private static double Salary;


    public Employee(String name, int hours, double rate, Position position){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.position = position;
        Hours += hours;
        Salary += rate;
    }
    public Employee(String name, double rate, Position position){
        this.name = name;
        this.rate = rate;
        this.position = position;
    }

    public Employee(){}


    public String getPosiiton(){
        return this.position.toString();
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public double fullSalary(){
        return rate * hours;
    }

    public double salaryBonus(double persentage){
        return fullSalary() * persentage;
    }

    @Override
    public String toString(){
        return "Name: " + name + "; " + "Rate: "+ rate + "; " + " Hours: " + hours + ";" ;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Employee employee = (Employee) object;
        if (rate != employee.rate)
            return false;
        if (hours != employee.hours)
            return false;
        if (name == null) {
            return false;
        } else if (!name.equals(employee.name))return false;
        return Objects.equals(employee.getPosiiton(), getPosiiton());
    }


    @Override
    public int hashCode(){
        return Objects.hash(name, hours, rate, position);
    }
    public static int getHours(){
        return Hours;
    }
    public static double getSalary(){
        return Salary;
    }


}