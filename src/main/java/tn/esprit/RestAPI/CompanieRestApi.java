package tn.esprit.RestAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.Entity.Companie;
import tn.esprit.Service.CompanieService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/api/companie")
public class CompanieRestApi {
	@Autowired
	private CompanieService companieService;

	@GetMapping
	List<Companie> AllCompanie() {
		return companieService.getAllcompanies();
	}
	@CrossOrigin(origins="*")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Companie> createCompanie(@RequestBody Companie companie) {
		return new ResponseEntity<>(companieService.addCompanie(companie), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Companie> updateCompanie(@PathVariable(value = "id") int id, @RequestBody Companie companie) {
		return new ResponseEntity<>(companieService.updateCompanie(id, companie), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteCompanie(@PathVariable(value = "id") int id) {
		companieService.deleteCompanie(id);
	}
	
	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	Optional<Companie>  CompanieById(@PathVariable(value = "id") int id) {
		return companieService.getCompanieById(id);
	}

	

}
