/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regrasdenogocio;

/**
 *
 * @author 021623
 */
public interface Cobranca {

	final int MINIMO = 40; // Consumo minimo de Energia 
	final int MINIMOAE = 10; // Consumo minimo de Agua e Esgoto

	public float getValorBase(); // custo sem impostos
	// public void emitirBoleto(); //Boleto de cobranca 

}
