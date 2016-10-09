package lab.rest;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private CadastroProdutoService cadastroProdutoService;

	@Autowired
	private Produtos produto;

	List<Produto> produtos = new ArrayList<>();

	@RequestMapping("/consultar")
	public Produto consultar() {
		return new Produto(1, "Arroz");
	}

	@RequestMapping("/listar")
	public List<Produto> listar() {
		return produto.findAll();
	}

	@RequestMapping(value = "/salvar", method = POST)
	public Produto salvar(@RequestBody Produto produto) {
		this.cadastroProdutoService.salvar(produto);
		return produto;
	}

}