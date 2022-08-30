package br.edu.ifsp.arq.dw2s6.exercicios.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.arq.dw2s6.exercicios.domain.model.Customer;
import br.edu.ifsp.arq.dw2s6.exercicios.repository.CustomerRepository;


@RestController
@RequestMapping("/clientes")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping
	public List<Customer> findAll(){

		return customerRepository.findAll();
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping("/{id}")
	public ResponseEntity<Customer> findById(@PathVariable Long id) {
		Optional<Customer> customer = customerRepository.findById(id);

		if(customer.isPresent()) {
			return ResponseEntity.ok(customer.get());
		}
		return null;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer create(@RequestBody Customer customer){

		return customerRepository.save(customer);
	}


}
