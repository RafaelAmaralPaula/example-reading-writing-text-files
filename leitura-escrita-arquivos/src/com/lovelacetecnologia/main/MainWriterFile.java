package com.lovelacetecnologia.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.lovelacetecnologia.service.impl.ArquivoImplements;



public class MainWriterFile {

	public static void main(String[] args) throws IOException {

		ArquivoImplements arquivoImplements = new ArquivoImplements();

		List<String> nome = new ArrayList<>();

		nome.add("Rafael");
		nome.add("Filipe");
		nome.add("Thiago");
		nome.add("Normandes");
		nome.add("Alexandre");
		
		
		
		arquivoImplements.criar();
		arquivoImplements.escrever(nome);
		
		for (String name : nome) {
			
			arquivoImplements.ler();
			System.out.println("Escrevendo nome do aluno : " + name + " no arquivo !");

		}
		
		

	}

}
