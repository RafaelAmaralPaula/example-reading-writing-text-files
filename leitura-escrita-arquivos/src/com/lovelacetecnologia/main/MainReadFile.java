package com.lovelacetecnologia.main;

import java.io.IOException;
import java.util.List;

import com.lovelacetecnologia.service.impl.ArquivoImplements;

public class MainReadFile {
	
	public static void main(String[] args) throws IOException {
			
		ArquivoImplements i = new ArquivoImplements();
		
		List<String> lista = i.ler();
		
		//int numerecaoCamisa = 10;
		
//		for(String nome : lista){
//			numerecaoCamisa += 10; 
//			System.out.println("Nome Jogador - > " + nome + " , numero da camisa - > " + numerecaoCamisa);
//		}
		
		
		for(String nome : lista){
		
		System.out.println(nome);
	}
		
	}

}
