package Weihnachtsbaum;


public class Baum
{
    private Quadrat q1;
    private Quadrat q2;
    private Quadrat q3;
    private Dreieck d1;
    private Dreieck d2;
    private Dreieck d3;
    private Dreieck dD;
    private Dreieck ddd;
    private Quadrat q4;
    private Kreis k1;
    private Kreis k2 ;
    private Kreis k3;
    private Kreis k4;

    public Baum()
    {
    }

    public void zeichne()
    {
        q2= new Quadrat();
        q2.farbeAendern("braun");
        q2.horizontalBewegen(-350);
        q2.vertikalBewegen(90);
        q2.groesseAendern(600);
        q2.sichtbarMachen();

        q1 = new Quadrat();
        q1.farbeAendern("rot");
        q1.horizontalBewegen(-25);
        q1.vertikalBewegen(70);
        q1.groesseAendern(30);
        q1.sichtbarMachen();
        
        q3= new Quadrat();
        q3.farbeAendern("blau");
        q3.horizontalBewegen(-175);
        q3.vertikalBewegen(70);
        q3.groesseAendern(30);
        q3.sichtbarMachen();
        
        q4= new Quadrat();
        q4.farbeAendern("vollbraun");
        q4.horizontalBewegen(-100);
        q4.vertikalBewegen(60);
        q4.groesseAendern(40);
        q4.sichtbarMachen();
        
        d1 = new Dreieck();  
        d1.groesseAendern(60, 135);
        d1.horizontalBewegen(20);
        d1.vertikalBewegen(-5);
        d1.sichtbarMachen();
        
        d2 = new Dreieck();  
        d2.groesseAendern(55, 110);
        d2.horizontalBewegen(0);
        d2.vertikalBewegen(-15);
        d2.sichtbarMachen();

        d3 = new Dreieck();  
        d3.groesseAendern(50, 75);
        d3.horizontalBewegen(20);
        d3.vertikalBewegen(-75);
        d3.sichtbarMachen();

        dD = new Dreieck();  
        dD.groesseAendern(60, 90);
        dD.horizontalBewegen(20);
        dD.vertikalBewegen(-25);
        dD.sichtbarMachen();                                                                                                                                                    
            
        ddd = new Dreieck();  
        ddd.groesseAendern(60, 90);
        ddd.horizontalBewegen(20);
        ddd.vertikalBewegen(-25);
        ddd.sichtbarMachen();                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                     
        k1 = new Kreis();
        k1.farbeAendern("weiﬂ");
        k1.horizontalBewegen(100);
        d2.horizontalBewegen(20);
        d2.vertikalBewegen(-25);
        d2.sichtbarMachen();

        k2 = new Kreis();
        k2.farbeAendern("rot");
        k2.horizontalBewegen(-15);
        k2.vertikalBewegen(40);
        k2.groesseAendern(15);
        k2.sichtbarMachen();
        
        k1 = new Kreis();
        k1.farbeAendern("gelb");
        k1.horizontalBewegen(6);
        k1.vertikalBewegen(-106);
        k1.groesseAendern(15);
        k1.sichtbarMachen();
       
        k1.langsamVertikalBewegen(108);
       
        k2.langsamVertikalBewegen(108);
        k2.unsichtbarMachen();
    }
}

