package tn.esprit.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Entity.Companie;
import tn.esprit.Repository.CompanieRepository;

@Service
public class CompanieService {
	@Autowired
	private CompanieRepository companieRepository;

	public Companie addCompanie(Companie companie) {
		return companieRepository.save(companie);
	}

	public List<Companie> getAllcompanies() {
		return companieRepository.findAll();
	}
	
	public Optional<Companie> getCompanieById(int id) {
		return companieRepository.findById(id);
	}

	public Companie updateCompanie(int id, Companie newCompanie) {
		if (companieRepository.findById(id).isPresent()) {
			Companie existingCompanie = companieRepository.findById(id).get();
			existingCompanie.setNom(newCompanie.getNom());
			existingCompanie.setAdresse(newCompanie.getAdresse());
			existingCompanie.setTelephone(newCompanie.getTelephone());
			existingCompanie.setPays(newCompanie.getPays());
			existingCompanie.setNomPDG(newCompanie.getNomPDG());
			existingCompanie.setNbrAvion(newCompanie.getNbrAvion());
			existingCompanie.setNbrEmployes(newCompanie.getNbrEmployes());

			return companieRepository.save(existingCompanie);
		} else
			return null;

	}

	public void deleteCompanie(int id) {
		if(companieRepository.findById(id).isPresent()){
			companieRepository.deleteById(id);
		}}
}
