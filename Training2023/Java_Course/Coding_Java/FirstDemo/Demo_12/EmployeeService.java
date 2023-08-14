package FirstDemo.Demo_12;

import FirstDemo.Demo_11.Gender;

public class EmployeeService {
    public Employee[] createEmployees(int n){
        return null;
    }

    public Employee createEmployee(){
        return null;
    }

    public double calculateTotalPAymentOfEmployee(Employee em){
        double payment = em.getSalary() + caluateBonus(em);
        return payment;
    }

    public double caluateBonus(Employee em){
        double bonus = 0.0;
        switch(em.getEmployeeType()){
            case FULL_TIME: bonus = em.getSalary() * 0.05; break;
            case PART_TIME: bonus = em.getSalary() * 0.03; break;
            case INTERNSHIP: bonus = em.getSalary() * 0.02; break;
        }
        
        return bonus;
    }

    public int countEmployeesByGender(Employee[] employees, Gender gender){
        int total =0;
        for(Employee n : employees){
            if(n.getGender() == gender){
                total++;
            }
        }
        return total;
    }

    /*
    public int countFemaleEmployees(Employee[] employees){
        int total =0;
        for(Employee n : employees){
            if(n.getGender() == Gender.FEMALE){
                total++;
            }
        }
        return total;
    }
    */
    /*
    public int countMaleEmployees(Employee[] employees){
        int total =0;
        for(Employee n : employees){
            if(n.getGender() == Gender.MALE){
                total++;
            }
        }
        return total;
    }
     */
    
}
