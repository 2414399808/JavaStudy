package javabean;

public class User {
    private String username;
    private double height;
    private double salary;

    public User() {
    }

    public User(String username, double height, double salary) {
        this.username = username;
        this.height = height;
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
