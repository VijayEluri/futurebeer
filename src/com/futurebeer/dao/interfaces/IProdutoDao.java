package com.futurebeer.dao.interfaces;

import java.util.List;

import com.futurebeer.dto.ProdutoDTO;
import com.futurebeer.entity.Produto;
import com.futurebeer.exception.BaseException;

public interface IProdutoDao {
	public Produto findById(Integer idProduto) throws BaseException;
	
	public List<ProdutoDTO> getProdutos() throws BaseException;
	
	public Produto cadastrarProduto(ProdutoDTO produtoDTO) throws BaseException;
	
	public Produto atualizarProduto(ProdutoDTO produtoDTO) throws BaseException;
}
