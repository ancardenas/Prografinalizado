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
public class Ios {
    String nombreComercial;
    float version;
    int anioLanzamiento;
    
    public Ios(String nombreComercial, float version, int anioDeLanzamiento){
    setNombrecomercial(nombreComercial);
    setVersion(version);
    setAnioDeLanzamiento(anioDeLanzamiento);
    }
    
   public Ios(){
    setNombrecomercial("campo sin llemar");
    setVersion(-1);
    setAnioDeLanzamiento(-1);
    }
    
    public void setNombrecomercial(String nombreComercial){
    this.nombreComercial=nombreComercial;
    }
    public void setVersion(float version){
    this.version=version;
    }
    public void setAnioDeLanzamiento(int anioDeLanzamiento){
    this.anioLanzamiento=anioDeLanzamiento;
    }
    public String getNombreComercial(){
    return this.nombreComercial;
    }
    public float getVersion(){
    return this.version;
    }
    public int getAnioDeLanzamiento(){
    return this.anioLanzamiento;
    }
    
    public String esantigua(int antiguo){
    if(antiguo<=2016){
    return "es antigua";
    }else{
    return "es nueva";
    }
    }
    @Override
    public String toString(){
    String cadena="nombre Comercial :"+getNombreComercial()+"version : "+getVersion()+"referencia:"+getAnioDeLanzamiento();
    return cadena;
    }
    
}

   
    

