package com.lovelacetecnologia.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.lovelacetecnologia.service.ArquivoGenericService;

public class ArquivoImplements implements ArquivoGenericService<String> {

	private static final Path CAMINHO = Paths.get("arquivo/Sobre_Java.txt");

	@Override
	public void criar() throws IOException {

		CAMINHO.toFile().createNewFile();

	}

	public void escrever(List<String> lista) throws IOException {

		Files.write(CAMINHO, lista);

	}

	public List<String> ler() throws IOException {

		List<String> lista = Files.readAllLines(CAMINHO);

		return lista;
	}

}
