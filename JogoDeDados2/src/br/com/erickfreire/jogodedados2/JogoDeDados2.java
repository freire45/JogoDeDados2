package br.com.erickfreire.jogodedados2;

import java.security.SecureRandom;

/**
 * Programa em Java que simula um jogo de dados com vetores
 * @author Erick Freire
 * @version 1 - Criado em 24-05-2021 as 14:48
 */

public class JogoDeDados2 {

	public static void main(String[] args) {
		
		SecureRandom numerosAleatorios = new SecureRandom();
		int[] frequencia = new int[7];
		
		for(int jogada = 1; jogada < 6000000; jogada++)
			++frequencia[1 + numerosAleatorios.nextInt(6)];
		
		System.out.printf("%s%10s%n", "Face", "Frequência");
		
		for(int face = 1; face < frequencia.length; face++)
			System.out.printf("%4d%10s%n", face, frequencia[face]);

	}

}
