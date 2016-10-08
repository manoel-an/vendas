package lab.rest;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	List<Produto> produtos = new ArrayList<>();

	public ProdutoController() {
		produtos.add(new Produto(1, "Arroz"));
		produtos.add(new Produto(2, "Feijão"));
		produtos.add(new Produto(3, "Carne"));
		produtos.add(new Produto(4, "Tomate"));
	}

	@RequestMapping("/consultar")
	public Produto consultar() {
		return new Produto(1, "Arroz");
	}

	@RequestMapping("/listar")
	public List<Produto> listar() {
		return produtos;
	}

	@RequestMapping(value = "/novo", method = POST)
	public Produto novo(@RequestBody Produto produto) {
		produtos.add(produto);
		return produto;
	}

}