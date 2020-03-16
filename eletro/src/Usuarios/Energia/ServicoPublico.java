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
public class ServicoPublico extends Pagante_Energia {
    
    public ServicoPublico(int consumo){
        super(consumo);
        super.setTarifa(Tarifa.GOVERNO);
    }
    
    @Override
    public String toString(){
        return 
            "   CONTA DE LUZ GOVERNO\n"+
            "\nConsumo " + getConsumo()+ "Kwh\n"+
            String.format("\nTUSD (Uso do Sistema de Distribuição)")+
            String.format("\n TUSD-R$%.2f -> R$ %.2f",tarifa.getTUSD(),getTUSDD())+
            String.format("\nTE (Energia) ")+
            String.format("\n TE-R$ %.2f -> R$ %.2f",tarifa.getTE(),getTEE())+
            String.format("\n            Valor sem impostos R$ %.2f%n",getValorBase())+
            String.format("\nPIS (%.2f%%) -> R$ %.2f",PIS*100,getPIS())+
            String.format("\nTotal R$ %.2f%n",getTotalApagar4());
           
    
}
}
