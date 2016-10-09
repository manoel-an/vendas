package lab.rest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Produtos extends CrudRepository<Produto, Long> {
	List<Produto> findAll();

}