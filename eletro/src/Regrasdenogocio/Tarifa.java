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
public enum Tarifa {
    
    RESIDENCIAL       (0.00f,0.00f),
    SOCIAL_0_A_30     (0.70f,0.60f),
    SOCIAL_31_A_100   (0.50f,0.30f),
    SOCIAL_101_A_220  (0.25f,0.15f),
    SOCIAL_221        (0.12f,0.00f),
    
    RURAL             (0.20f,0.20f),
    COOPERATIVA       (0.40f,0.40f),
    
    COMERCIO          (0.00f,0.00f),
    TURISMO           (0.15f,0.00f),
    
    GOVERNO           (0.40f,0.40f),
    OUTRO             (0.00f,0.00f);
   
    
    Tarifa(float descontoTUSD,float descontoTE){
        TUSD = TUSD_PLENA - TUSD_PLENA*descontoTUSD;
        TE = TE_PLENA - TE_PLENA*descontoTE;
    }
    
    private final float TE_PLENA    = 0.23887f;
    private final float TUSD_PLENA  = 0.18074f;
    
    private final float TE;
    private final float TUSD;
    
    public float getTE(){
        return TE;
    }
    public float getTUSD(){
        return TUSD;
    }

    
}
