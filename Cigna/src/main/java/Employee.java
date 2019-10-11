
/**
 * This class is used to model All Employee Resources API object for deserialization
 */
public class Employee  {

    private String id;
    private String empEmail;
    private String empName;
    private String salary;
    private String department;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail( String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary( String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
