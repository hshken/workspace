package edu.fju.exam;

public class main {

	public static void main(String[] args) {
		ArrayList&lt;Employee&gt; employees = new ArrayList&lt;&gt;();
		ArrayList&lt;Employee&gt; employees = new ArrayList&lt;&gt;();
		employees.add(new Employee("Jack", 25000));
		employees.add(new Employee("Mary", 28000));
		employees.add(new Manager("Eddie", 40000));
		employees.add(new Director("Teddy", 50000, 3000));
		employees.add(new Employee("Danny", 31000));
		employees.add(new Manager("Andy", 47000));
		employees.add(new Director("Frank", 70000, 9000));
		for (int i=0; i&lt;employees.size(); i++){
		   employees.get(i).print();
		}

	}

}
