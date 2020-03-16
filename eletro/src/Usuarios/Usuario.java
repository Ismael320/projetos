/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Regrasdenogocio.Cobranca;
import Regrasdenogocio.Tarifa;

/**
 *
 * @author 021623
 */
public abstract class Usuario implements Cobranca {

	public int consumo;
	public Tarifa tarifa;

	public Usuario() {
		this.consumo = MINIMO;
	}

	public Usuario(int consumo) {
		this.consumo = (consumo > MINIMO) ? consumo : MINIMO;
	}

	public int getConsumo() {
		return this.consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;

	}

	public float getTEE() {
		return getConsumo() * (tarifa.getTE());
	}

	public float getTUSDD() {
		return getConsumo() * (+tarifa.getTUSD());
	}

	@Override
	public float getValorBase() {
		return getConsumo() * (tarifa.getTE() + tarifa.getTUSD());
	}
}
