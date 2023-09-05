const People = require('./people');
//import People from './people.js';

class Employee extends People {
  constructor(name, address, phone, DOB, position, salary) {
    super(name, address, phone, DOB);
    this.position = position;
    this.salary = salary;
  }
}

module.exports = Employee;