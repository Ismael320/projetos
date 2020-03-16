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
public interface Impostos {

	final float PIS = 0.0107f; // 1.07% do valor
	final float PIS1 = 0.0165f; // 1.65% do valor
	final float PIS2 = 0.0065f; // 0.65% do valor

	final float COFINS = 0.0491f; // 4,91% do valor
	final float COFINS1 = 0.0760f; // 7,60% do valor
	final float COFINS2 = 0.0300f; // 3,00% do valor

	final float COSIP = 8.19f; // 8,19 valor fixo
	final float COSIP1 = 25.78f; // 25,78 valor fixo
 
	public float getPIS();

	public float getCOFINS();

	public float getCOSIP();

	public float getPIS1();

	public float getCOFINS1();

	public float getCOSIP1();

	public float getPIS2();

	public float getCOFINS2();

	public float getTotalImpostos();
}
