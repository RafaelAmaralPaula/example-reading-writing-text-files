package com.lovelacetecnologia.service;

import java.io.IOException;
import java.util.List;

public interface ArquivoGenericService <E>{
	
	public void criar() throws IOException;
	public void escrever(List<E> lista) throws IOException;
	public List<E> ler() throws IOException;
}
