package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab.rest.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}