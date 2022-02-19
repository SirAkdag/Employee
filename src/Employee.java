public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raiseSalary;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        System.out.println("Adi: " + this.name);
        System.out.println("Maas: " + this.salary);
        System.out.println("Haftalik Calisma Saati: " + this.workHours);
        System.out.println("Ise Giris Yili: " + this.hireYear);
    }

    void calculate() {
        if (this.salary < 1000) {
            this.tax = 0;
            System.out.println("Vergi: " + this.tax);
        } else {
            this.tax = this.salary * 0.03;
            System.out.println("Vergi: " + this.tax);
        }
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
            System.out.println("Bonus: " + this.bonus);
        }
        if (2021 - this.hireYear < 10) {
            this.raiseSalary = this.salary * 0.05;
            System.out.println("Maas Artisi: " + this.raiseSalary);
        } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 20) {
            this.raiseSalary = this.salary * 0.10;
            System.out.println("Maas Artisi: " + this.raiseSalary);
        } else if (2021 - this.hireYear >= 20) {
            this.raiseSalary = this.salary * 0.15;
            System.out.println("Maas Artisi: " + this.raiseSalary);
        }
        System.out.println("Vergi ve Bonuslarla Birlikte Maas: " + (this.salary + (this.tax - this.bonus)));
        System.out.println("Toplam Maas: " + (this.salary + this.raiseSalary));
    }
}



