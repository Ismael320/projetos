/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios.Agua;

import Regrasdenogocio.TarifaAE;
import Usuarios.Pagante_Agua;

/**
*
* @author 021623
*/
public class ComercioLocalAE extends Pagante_Agua{
    public ComercioLocalAE(int consumo){
        super(consumo);
        setTarifaComercioComum();
        
    }
        
    private void setTarifaComercioComum(){
            int faixa = getConsumo();
            if (faixa <=10){
                super.setTarifa(TarifaAE.COMERCIO_0_A_10);
            }
            else if ((faixa >=11) && (faixa <=20)){
                super.setTarifa(TarifaAE.COMERCIO_11_A_20);
            }
            else if ((faixa >=21)&&(faixa <=30)){
                 super.setTarifa(TarifaAE.COMERCIO_21_A_30);
            }
            else if ((faixa >=31 )&&(faixa <=50)){
                 super.setTarifa(TarifaAE.COMERCIO_31_A_50);
            }
            else 
                super.setTarifa(TarifaAE.COMERCIO_51);
        }
   @Override
     public String toString(){
        return 
            "   CONTA DE AGUA COMERCIAL\n"+
            "\nConsumo " + getConsumo()+ "M³\n"+
            String.format("\nAGUA R$%.2f -> R$ %.2f",tarifaa.getAGUA(),getAGUAA() )+
            String.format("\nESGOTO R$%.2f -> R$ %.2f",tarifaa.getESGOTO(),getESGOTOO())+
            String.format("\n            Valor sem impostos R$ %.2f%n",getValorBaseAE())+
            String.format("\nPIS (%.2f%%) -> R$ %.2f",PIS1*100,getPIS1())+
            String.format("\nCOFINS (%.2f%%) -> R$ %.2f", COFINS1*100,getCOFINS1())+
            String.format("\n            Total dos Impostos R$ %.2f%n",getTotalImpostos1())+
            String.format("\nValor a pagar R$:%.2f%n",getTotalApagar1());
}
}