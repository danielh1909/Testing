public class GrenzwertReihe {
 
                public static void main(String[] args) {
                              
                	 double genauigK=0.0001;
                	 double result = berechneGrenzwert(genauigK);                                    
                }
 
                public static double berechneGrenzwert(double genauigkeit){
                              
                               double zahlBeginn=1.0;
                               double vWert=0.0;
                               int counterN=0;
                               double aWert=vWert + (zahlBeginn/Math.pow( 2,counterN ));
               
                               counterN++;
                               System.out.println(aWert);
                              
                               while(aWert - vWert > genauigkeit){
                                               vWert=aWert;
                                               aWert=vWert + (zahlBeginn/Math.pow( 2,counterN ));
                                               counterN++;
                                               System.out.println(aWert);
                               }
                               return aWert;
                }
}