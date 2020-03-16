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
public class ResidencialSocial extends Pagante_Energia{
    
    public ResidencialSocial(int consumo){
        super.setConsumo(consumo);  // nao usa o minimo
        setTarifaSocial();
    }
        
    private void setTarifaSocial(){
            int faixa = getConsumo();
            if (faixa < 31)
            	
                super.setTarifa(Tarifa.SOCIAL_0_A_30);
            else if (faixa < 101)
                super.setTarifa(Tarifa.SOCIAL_31_A_100);
            else if (faixa < 221)
                 super.setTarifa(Tarifa.SOCIAL_101_A_220);
            else
                super.setTarifa(Tarifa.SOCIAL_221);
        }
 
    @Override
    public String toString(){
        return 
           "   CONTA DE LUZ BAIXA RENDA\n"+
            "\nConsumo " + getConsumo()+ "Kwh\n"+
            String.format("\nTUSD (Uso do Sistema de Distribuição)")+
            String.format("\n TUSD-R$%.2f -> R$ %.2f",tarifa.getTUSD(),getTUSDD())+
            String.format("\nTE (Energia) ")+
            String.format("\n TE-R$ %.2f -> R$ %.2f",tarifa.getTE(),getTEE())+
            String.format("\n            Valor sem impostos R$ %.2f%n",getValorBase())+
            String.format("\nPIS (%.2f%%) -> R$ %.2f",PIS*100,getPIS())+
            String.format("\nCOFINS (%.2f%%) -> R$ %.2f", COFINS*100,getCOFINS())+
            String.format("\nCOSIP -> R$ %.2f",getCOSIP())+
            String.format("\n            Total dos Impostos R$ %.2f%n",getTotalImpostos())+
            String.format("\nTotal R$ %.2f%n",getTotalApagarbr());   
 }
}