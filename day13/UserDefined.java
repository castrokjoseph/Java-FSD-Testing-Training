package day13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	   private String title;
	   private Integer salary;

	   public Employee(String title, Integer salary) {
	      this.title = title;
	      this.salary = salary;
	   }

	   public String getTitle() {
	      return title;
	   }

	   public void setTitle(String title) {
	      this.title = title;
	   }

	   public Integer getSalary() {
	      return salary;
	   }

	   public void setSalary(Integer salary) {
	      this.salary = salary;
	   }

	   @Override
	   public String toString() {
	      return "{" +
	      "title='" + title + '\'' +
	      ", salary=" + salary +
	      '}';
	   }
}
public class UserDefined {

	
	public static void main(String[] args) {
		ArrayList<Employee> resource = new ArrayList<Employee>();
	      resource.add(new Employee("Manager", 2500000));
	      resource.add(new Employee("Team Lead", 1500000));
	      resource.add(new Employee("Engineer", 1000000));
	      resource.add(new Employee("Trainee", 500000));

	      System.out.println("Employee List before sorting: " + resource);

	      // Sort by salary
	      resource.sort((source, target) -> {return (source.getSalary() - target.getSalary());});

	      // A more compact approach
	      resource.sort(Comparator.comparingInt(Employee::getSalary));

	      System.out.println("Sorted List by salary : " + resource);

	      // Substitute method
	      Collections.sort(resource, Comparator.comparing(Employee::getTitle));
	      System.out.println("Sorted List by title : " + resource);
	   }
}
