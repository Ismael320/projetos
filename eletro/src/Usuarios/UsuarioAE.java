/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Regrasdenogocio.Cobranca;
import Regrasdenogocio.TarifaAE;

/**
 *
 * @author 021623
 */
public abstract class UsuarioAE implements Cobranca {

	public int consumo;
	public TarifaAE tarifaa;

	public UsuarioAE() {
		this.consumo = MINIMOAE;
	}

	public UsuarioAE(int consumo) {
		this.consumo = (consumo > MINIMOAE) ? consumo : MINIMOAE;
	}

	public int getConsumo() {
		return this.consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public void setTarifa(TarifaAE tarifa) {
		this.tarifaa = tarifa;

	}

	public float getAGUAA() {
		return getConsumo() * (tarifaa.getAGUA());
	}

	public float getESGOTOO() {
		return getConsumo() * (tarifaa.getESGOTO());
	}

	public float getValorBaseAE() {
		return getConsumo() * (tarifaa.getAGUA() + tarifaa.getESGOTO());
	}
}