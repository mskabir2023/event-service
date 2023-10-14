package com.example.assignment5and6.services;

import com.example.assignment5and6.models.Customer;
import com.example.assignment5and6.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ICustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    public ICustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {

        customer.getOrders().stream().forEach(order -> order.setCustomer(customer));
        return customerRepository.save(customer);
    }

    public  Customer updateCustomer(Customer customer){
//        customer.getOrders().stream().forEach(order -> order);
        return null;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findByFirstName(String firstname){
        return customerRepository.findByFirstNameContainsIgnoreCase(firstname);
    }
    @Override
    public List<Customer> findByLastName(String lastName){
        return customerRepository.findByLastNameContainsIgnoreCase(lastName);
    }
    @Override
    public List<Customer> findByFirstNameSearch(String firstname){
        return customerRepository.findCustomerByFirstNameContainingIgnoreCase(firstname);
    }

    @Override
    public Customer findUserByLastNameAndFirstName(String firstname, String lastname){
        System.out.println(firstname);
        System.out.println(lastname);
        List<Customer> coustList = customerRepository.findCustomerByFirstNameAndLastName(firstname, lastname);
        return coustList.size()>0?coustList.get(0):new Customer();
    }

    @Override
    public void deleteUser(Long customerId) throws Exception {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isPresent()){
            Customer customer = optionalCustomer.get();
            customerRepository.deleteById(customerId);
        }
    }


}

