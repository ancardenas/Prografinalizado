
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
/**
 *
 * @author Prometeo
 */
public class Tablet{
    private float pantalla;
    private boolean espacialesParaLectura;
    private String referencia;
    
    public Tablet(float pantalla, boolean especialesParaLectura,String referencia){
    setPantalla(pantalla);
    setEspecialesParaLectura(especialesParaLectura);
    setReferencia(referencia);
    }
    public Tablet(){
    setPantalla(-1);
    setEspecialesParaLectura(false);
    setReferencia("no se llenado el campo");
    }
    
    public void setPantalla(float pantalla){
    this.pantalla=pantalla;
    }
    public void setEspecialesParaLectura(boolean especialesparaLectura){
    this.espacialesParaLectura=especialesparaLectura;
    }
    public void setReferencia(String referencia){
    this.referencia=referencia;
    }
    public float getPantalla(){
    return this.pantalla;
    }
    public boolean getEspecialesParaLectura(){
    return this.espacialesParaLectura;
    }
    public String getReferencia(){
    return this.referencia;
    }
    
    public String esPequenia(float pantalla){
    if(pantalla<=12){
    return "es pequeña";
    }else{
    return "es grande";
    }
    }
    
    
    @Override
    public String toString(){
    String cadena="referencia :"+getReferencia()+"pantalla: "+getPantalla()+"referencia:"+getEspecialesParaLectura();
    return cadena;
    }
    
}
