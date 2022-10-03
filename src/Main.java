public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Ertuğrul Altıngöz", 2000, 50, 2000);

        System.out.println(employee);
        System.out.println("\nVergi:" + employee.tax() + " " + "\nBonus:" + employee.bonus() + " " + "\nMaaş Zammı:"
                + employee.riseSalary() + " " + "Toplam Maaş:" + (employee.salary + employee.riseSalary()) + " "
                + "\nMaaş ve Toplam maaş:" + employee.salary + ", " + (employee.salary + employee.riseSalary()));
    }

}