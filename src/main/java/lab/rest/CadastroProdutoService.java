package lab.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroProdutoService {

	@Autowired
	private Produtos produtos;

	public void salvar(Produto produto) {
		produtos.save(produto);
	}

}
