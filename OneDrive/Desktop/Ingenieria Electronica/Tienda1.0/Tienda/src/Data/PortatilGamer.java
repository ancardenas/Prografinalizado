
package Data;


public class PortatilGamer extends Portatil {
   private String targetaGrafica;
   private int gigasdeVideo;
   private String tipodeSonido;

    public PortatilGamer(String targetaGrafica, int gigasdeVideo, String tipodeSonido, String cargador, String bateria, boolean unidadCD, String procesador, String ram, int discoDuro, String tipo, String color, String marca, float precio) {
        super(cargador, bateria, unidadCD, procesador, ram, discoDuro, tipo, color, marca, precio);
        setTargetaGrafica(targetaGrafica);
        setGigasdeVideo(gigasdeVideo);
        setTipodeSonido(tipodeSonido);
    }

    public PortatilGamer(String targetaGrafica, int gigasdeVideo, String tipodeSonido) {
        setTargetaGrafica(targetaGrafica);
        setGigasdeVideo(gigasdeVideo);
        setTipodeSonido(tipodeSonido);
    }

    public PortatilGamer() {
    }

    public void setTargetaGrafica(String targetaGrafica) {
        this.targetaGrafica = targetaGrafica;
    }

    public void setGigasdeVideo(int gigasdeVideo) {
        this.gigasdeVideo = gigasdeVideo;
    }

    public void setTipodeSonido(String tipodeSonido) {
        this.tipodeSonido = tipodeSonido;
    }

    public String getTargetaGrafica() {
        return targetaGrafica;
    }

    public int getGigasdeVideo() {
        return gigasdeVideo;
    }

    public String getTipodeSonido() {
        return tipodeSonido;
    }
    @Override
    public String toString(){    
    String cadena1=super.toString();
    String cadena2="\nTipo de Targeta Grafica :"+getTargetaGrafica()+"\nGigas de Video : "+getGigasdeVideo() +"\nTipo de Sonido: "+getTipodeSonido();
    return cadena1+cadena2;
 
    }  
}
