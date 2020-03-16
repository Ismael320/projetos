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
public enum TarifaAE {
    
    RESIDENCIAL_0_A_10  (2.415f,1.937f),
    RESIDENCIAL_11_A_20 (3.37f,2.66f),
    RESIDENCIAL_21_A_30 (5.18f,4.13f),
    RESIDENCIAL_31_A_50 (5.18f,4.13f),
    RESIDENCIAL_51      (6.19f,4.93f),
   
    SOCIAL_0_A_10       (0.819f,0.655f),
    SOCIAL_11_A_20      (1.27f,1.02f),
    SOCIAL_21_A_30      (2.77f,2.20f),
    SOCIAL_31_A_50      (3.94f,3.17f),
    SOCIAL_51           (4.69f,3.77f),
    
    RURAL_0_A_10        (2.415f,1.937f),
    RURAL_11_A_20       (3.37f,2.66f),
    RURAL_21_A_30       (5.18f,4.13f),
    RURAL_31_A_50       (5.18f,4.13f),
    RURAL_51            (6.19f,4.93f),
   
    COOPERATIVA_0_A_10   (0.819f,0.655f),
    COOPERATIVA_11_A_20  (1.27f,1.02f),
    COOPERATIVA_21_A_30  (2.77f,2.20f),
    COOPERATIVA_31_A_50  (3.94f,3.17f),
    COOPERATIVA_51       (4.69f,3.77f),
    
    COMERCIO_0_A_10    (3.634f,2.909f),
    COMERCIO_11_A_20   (4.28f,3.44f),
    COMERCIO_21_A_30   (7.16f,5.77f),
    COMERCIO_31_A_50   (7.16f,5.77f),
    COMERCIO_51        (9.11f,7.28f),
    
    TURISMO_0_A_10     (2.424f,1.939f),
    TURISMO_11_A_20    (2.89f,2.28f),
    TURISMO_21_A_30    (4.68f,3.74f),
    TURISMO_31_A_50    (4.68f,3.74f),
    TURISMO_51         (5.46f,4.35f),
    
    GOVERNO_0_A_10     (4.85f,3.878f),
    GOVERNO_11_A_20    (5.74f,4.56f),
    GOVERNO_21_A_30    (9.57f,7.66f),
    GOVERNO_31_A_50    (9.57f,7.66f),
    GOVERNO_51         (12.13f,9.67f),
    
    OUTRO_0_A_10       (4.85f,3.878f),
    OUTRO_11_A_20      (5.74f,4.56f),
    OUTRO_21_A_30      (9.57f,7.66f),
    OUTRO_31_A_50      (9.57f,7.66f),
    OUTRO_51           (12.13f,9.67f);
    
    
    TarifaAE(float descontoAGUA,float descontoESGOTO){
        AGUA = AGUA_A + AGUA_A+descontoAGUA;
        ESGOTO =ESGOTO_E + ESGOTO_E+descontoESGOTO;
        
    }
    
    private final float AGUA_A    = 0.000f;
    private final float ESGOTO_E  = 0.000f;
    
    private final float ESGOTO;
    private final float AGUA;
    
    
    public float getAGUA(){
        return AGUA;
    }
    public float getESGOTO(){
        return ESGOTO;
    }
}