package EmployeeList;
import java.util.ArrayList;
import EmployeeList.employee;

public class TestEmp {


		public TestEmp(String string, int i, int j) {
			// TODO Auto-generated constructor stub
		}

		   public static void main(String args[]){
			   ArrayList<employee>lst_emp= new ArrayList<>();
		      employee empOne = new employee("Pooja",10000,23);
		      employee empTwo= new employee("priya",3000,24);
		      employee empThree= new employee("sonam",100,25);     
		    lst_emp.add(empOne);
		    lst_emp.add(empTwo);
		    lst_emp.add(empThree);
		    
		System.out.println(lst_emp.stream().filter(x->x.Sal==10000).findFirst().get().name);
		//System.out.println(lst_emp.stream().filter(o->o.name.equals("Pooja")).findFirst().get().name);
		      
		      
		 /*     for(Object object: lst_emp) {
		    	  employee e=(employee)object;
		    	  if(e.Sal==10000)
		    	  System.out.println(e.name);
		    	  break; 
		    	  
		      }   */
		   }
		   
	}
		