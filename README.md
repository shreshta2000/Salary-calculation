

# Employee Management System

This project is an Employee Management System implemented in Java. It allows for the management of different levels of employees within a company, including Managers, Supervisors, and Workers.

## Features

- **Employee Classes**: 
  - `Manager`: Manages employees and their salaries based on working hours.
  - `Supervisor`: Supervises a team and calculates salaries with consideration for overtime.
  - `Worker`: Performs tasks and earns wages with overtime pay.
- **Salary Calculation**:
  - Gross salary calculation based on working hours and hourly rates.
  - Tax deduction calculated at 30% of the gross salary.
  - Net salary computed as gross salary minus tax.

## How to Use

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/EmployeeManagementSystem.git
   ```

2. **Compile the Code**:
   ```bash
   javac Exam2.java
   ```

3. **Run the Program**:
   ```bash
   java Exam2
   ```

4. **View Output**:
   The program will display the company's total gross salary, total tax paid, and total net salary.

## Sample Output

```plaintext
Company Gross Salary: $XXXXX
Company Tax: $XXXXX
Company Net Salary: $XXXXX
```

## Contributors

- [Your Name](https://github.com/yourusername)
- [Contributor 1](https://github.com/contributor1)
- [Contributor 2](https://github.com/contributor2)

## License

This project is licensed under the [MIT License](LICENSE).
