package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.rest.Produto;
import repository.Produtos;

@Service
public class CadastroProdutoService {

	@Autowired
	private Produtos produtos;

	public void salvar(Produto produto) {
		produtos.save(produto);
	}

}
