package com.Bridgelabz;

//   UC_1 - Check Employee is Present or Absent
public class EmpWage {
    public static void main(String[] args) {
        int isPresent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isPresent)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}

//    UC_2 - Calculate Daily Employee Wage

public class EmpWage {
    public static void main(String[] args) {
        int is_fulltime_present = 1;
        int daily_wage;
        int wage_per_hr = 20;
        int working_hr;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == is_fulltime_present) {
            System.out.println("Employee is Present");
            working_hr = 8;
        } else {
            System.out.println("Employee is Absent");
            working_hr = 0;
        }

        daily_wage = working_hr * wage_per_hr;
        System.out.println("Employee daily wage is :" + daily_wage);

    }
    }

//    UC_3 - Add Part time Employee & Wage

public class EmpWage {
    public static void main(String[] args) {
        int is_fulltime_present = 1;
        int is_parttime_present = 2;
        int daily_wage;
        int wage_per_hr = 20;
        int working_hr;
        int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;

        if( emp_check == is_fulltime_present )
        {
            System.out.println("Employee is full time Present");
            working_hr =8;
        }
        else if ( emp_check == is_parttime_present )
        {
            System.out.println("Employee is part time Present");
            working_hr = 4;
        }
        else
        {
            System.out.println("Employee is Absent");
            working_hr = 0;
        }

        daily_wage = working_hr * wage_per_hr;
        System.out.println("Employee daily wage is :" + daily_wage);
    }

}

//    UC_4 - Solving using Case Statement

public class EmpWage {
    public static void main(String[] args) {
        int is_fulltime_present = 1;
        int is_parttime_present = 2;
        int daily_wage;
        int wage_per_hr = 20;
        int workink_hr = 0;
        int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;

        switch (emp_check) {
            case 1:
                System.out.println("Employee is full time Present");
                workink_hr = 8;
                break;
            case 2:
                System.out.println("Employee is part time Present");
                workink_hr = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }

        daily_wage = workink_hr * wage_per_hr;
        System.out.println("Employee daily wage is :" + daily_wage);
    }
}

//    UC_5 - Calculating Wages for a Month assuming 20 Working Days in a Month

public class EmpWage {
    public static void main(String args[])
    {
        int is_fulltime_present = 1;
        int is_parttime_present = 2;
        int wage_per_hr = 20;
        int working_hr=0;
        int days_in_month=20;
        int monthly_total_wage = 0;
        int daily_wage_array[] = new int[20];
        for (int i=0; i<days_in_month; i++) {
            int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;
            switch (emp_check) {
                case 1:
                    working_hr = 8;
                    break;
                case 2:
                    working_hr = 4;
                    break;
                default:
                    working_hr = 0;
            }
            daily_wage_array[i] = working_hr * wage_per_hr;
        }

        for (int j=0; j<days_in_month; j++) {
            int day = j+1;
            System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
            monthly_total_wage = monthly_total_wage + daily_wage_array[j];
        }
        System.out.println("\nMonthly wage is :" + monthly_total_wage);
    }
}

//    UC_6 - Calculate Wages till a condition of total working hours of 100 or max days os 20 is reached for a month

public class EmpWage {
    public static void main(String args[])
        {
            int is_fulltime_present = 1;
            int is_parttime_present = 2;
            int wage_per_hr = 20;
            int working_hr = 0;
            int total_working_hr = 0;
            int days_in_month=20;
            int max_working_hrs = 100;
            int monthly_total_wage = 0;
            int daily_wage_array[] = new int[20];

            for (int i=0; i<days_in_month && total_working_hr<max_working_hrs; i++) {
                int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;

                switch (emp_check) {
                    case 1:
                        working_hr = 8;
                        break;
                    case 2:
                        working_hr = 4;
                        break;
                    default:
                        working_hr = 0;
        }

            total_working_hr += working_hr;
            daily_wage_array[i] = working_hr * wage_per_hr;
        }
            for (int j=0; j<days_in_month; j++) {
            int day = j+1;
            System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
            monthly_total_wage = monthly_total_wage + daily_wage_array[j];
        }

        System.out.println("\nMonthly wage is :" + monthly_total_wage);

        }
}



