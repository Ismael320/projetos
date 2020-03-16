/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import Regrasdenogocio.Impostos;

/**
 *
 * @author 021623
 */
public class Pagante_Energia extends Usuario implements Impostos {

	public Pagante_Energia() {
		super();
	}

	public Pagante_Energia(int consumo) {
		super(consumo);
	}

	@Override
	public float getPIS() {
		return getValorBase() * PIS; // PIS - A1-A2-B1-D
	}

	@Override
	public float getPIS1() {
		return getValorBase() * PIS1; // PIS - B2-C1-E
	}

	@Override
	public float getPIS2() {
		return getValorBase() * PIS2; // PIS - C2
	}

	@Override
	public float getCOFINS() {
		return getValorBase() * COFINS; // COFINS - A1-A2-B1
	}

	@Override
	public float getCOFINS1() {
		return getValorBase() * COFINS1; // COFINS - B2-C1-E
	}

	@Override
	public float getCOFINS2() {
		return getValorBase() * COFINS2; // COFINS - C2
	}

	@Override
	public float getCOSIP() {
		return COSIP; // COSIP - A1-B1-B2
	}

	@Override
	public float getCOSIP1() {
		return COSIP1; // COSIP - C1-C2-E
	}

	@Override
	public float getTotalImpostos() {
		return getPIS() + getCOFINS() + getCOSIP();
	}

	public float getTotalApagar() {
		return getValorBase() + getTotalImpostos();
	}

	public float getTotalImpostosbr() {
		return getPIS() + getCOFINS();
	}

	public float getTotalApagarbr() {
		return getValorBase() + getTotalImpostosbr();
	}

	public float getTotalImpostos1() {
		return getPIS1() + getCOFINS1() + getCOSIP();
	}

	public float getTotalApagar1() {
		return getValorBase() + getTotalImpostos1();
	}

	public float getTotalImpostos2() {
		return getPIS1() + getCOFINS1() + getCOSIP1();
	}

	public float getTotalApagar2() {
		return getValorBase() + getTotalImpostos2();
	}

	public float getTotalImpostos3() {
		return getPIS2() + getCOFINS2() + getCOSIP1();
	}

	public float getTotalApagar3() {
		return getValorBase() + getTotalImpostos3();
	}

	public float getTotalApagar4() {
		return getValorBase() + getPIS();
	}
}