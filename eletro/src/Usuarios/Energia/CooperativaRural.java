/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.Energia;

import Regrasdenogocio.Tarifa;
import Usuarios.Pagante_Energia;

/**
 *
 * @author 021623
 */
public class CooperativaRural extends Pagante_Energia{
    
    public CooperativaRural(int consumo){
        super(consumo);
        super.setTarifa(Tarifa.COOPERATIVA);
    }
    
    @Override
    public String toString(){
        return 
            "   CONTA DE LUZ COOPERATIVO\n"+
            "\nConsumo " + getConsumo()+ "Kwh\n"+
            String.format("\nTUSD (Uso do Sistema de Distribuição)")+
            String.format("\n TUSD-R$%.2f -> R$ %.2f",tarifa.getTUSD(),getTUSDD())+
            String.format("\nTE (Energia) ")+
            String.format("\n TE-R$ %.2f -> R$ %.2f",tarifa.getTE(),getTEE())+
            String.format("\n            Valor sem impostos R$ %.2f%n",getValorBase())+
            String.format("\nPIS (%.2f%%) -> R$ %.2f",PIS1*100,getPIS1())+
            String.format("\nCOFINS (%.2f%%) -> R$ %.2f", COFINS1*100,getCOFINS1())+
            String.format("\nCOSIP -> R$ %.2f",getCOSIP())+
            String.format("\n            Total dos Impostos R$ %.2f%n",getTotalImpostos1())+
            String.format("\nTotal R$ %.2f%n",getTotalApagar1());
 }
}
