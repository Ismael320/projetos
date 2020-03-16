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
public class Pagante_Agua extends UsuarioAE implements Impostos {

	public Pagante_Agua() {
		super();
	}

	public Pagante_Agua(int consumo) {
		super(consumo);
	}

	@Override
	public float getPIS() {
		return getValorBaseAE() * PIS; // PIS - A1-A2-B1-D
	}

	@Override
	public float getPIS1() {
		return getValorBaseAE() * PIS1; // PIS - B2-C1-E
	}

	@Override
	public float getPIS2() {
		return getValorBaseAE() * PIS2; // PIS - C2
	}

	@Override
	public float getCOFINS() {
		return getValorBaseAE() * COFINS; // COFINS - A1-A2-B1
	}

	@Override
	public float getCOFINS1() {
		return getValorBaseAE() * COFINS1; // COFINS - B2-C1-E
	}

	@Override
	public float getCOFINS2() {
		return getValorBaseAE() * COFINS2; // COFINS - C2
	}

	@Override
	public float getTotalImpostos() {
		return getPIS() + getCOFINS();
	}

	public float getTotalApagar() {
		return getValorBaseAE() + getTotalImpostos();
	}

	public float getTotalImpostosbr() {
		return getPIS() + getCOFINS();
	}

	public float getTotalApagarbr() {
		return getValorBaseAE() + getTotalImpostosbr();
	}

	public float getTotalImpostos1() {
		return getPIS1() + getCOFINS1();
	}

	public float getTotalApagar1() {
		return getValorBaseAE() + getTotalImpostos1();
	}

	public float getTotalImpostos2() {
		return getPIS1() + getCOFINS1();
	}

	public float getTotalApagar2() {
		return getValorBaseAE() + getTotalImpostos2();
	}

	public float getTotalImpostos3() {
		return getPIS2() + getCOFINS2();
	}

	public float getTotalApagar3() {
		return getValorBaseAE() + getTotalImpostos3();
	}

	public float getTotalApagar4() {
		return getValorBaseAE() + getPIS();
	}

	@Override
	public float getCOSIP() {
		return 0;
	}

	@Override
	public float getCOSIP1() {
		return 0;
	}

	@Override
	public float getValorBase() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}
}