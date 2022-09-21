
package javasort;

//import java.lang.Comparable;

public class Dados implements Comparable<Dados>{
   private int numero;
   private String digimon;
   private String estagio;
   private String tipo;
   private String atributo;
   private int lv50HP;
   private int lv50SP;
   private int lv50Atk;
   private int lv50Def;
   private int lv50Int;
   private int lv50Spd;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDigimon(String digimon) {
        this.digimon = digimon;
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public void setLv50HP(int lv50HP) {
        this.lv50HP = lv50HP;
    }

    public void setLv50SP(int lv50SP) {
        this.lv50SP = lv50SP;
    }

    public void setLv50Atk(int lv50Atk) {
        this.lv50Atk = lv50Atk;
    }

    public void setLv50Def(int lv50Def) {
        this.lv50Def = lv50Def;
    }

    public void setLv50Int(int lv50Int) {
        this.lv50Int = lv50Int;
    }

    public void setLv50Spd(int lv50Spd) {
        this.lv50Spd = lv50Spd;
    }

    public int getNumero() {
        return numero;
    }

    public String getDigimon() {
        return digimon;
    }

    public String getEstagio() {
        return estagio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAtributo() {
        return atributo;
    }

    public int getLv50HP() {
        return lv50HP;
    }

    public int getLv50SP() {
        return lv50SP;
    }

    public int getLv50Atk() {
        return lv50Atk;
    }

    public int getLv50Def() {
        return lv50Def;
    }

    public int getLv50Int() {
        return lv50Int;
    }

    public int getLv50Spd() {
        return lv50Spd;
    }

    
    @Override    
    public int compareTo(Dados outroDado){
      return this.digimon.compareTo(outroDado.digimon);
    }
    

    @Override
    public String toString() {
        return "Dados{" + "numero=" + numero + ", digimon=" + digimon + ", estagio=" + estagio + ", tipo=" + tipo + ", atributo=" + atributo + ", lv50HP=" + lv50HP + ", lv50SP=" + lv50SP + ", lv50Atk=" + lv50Atk + ", lv50Def=" + lv50Def + ", lv50Int=" + lv50Int + ", lv50Spd=" + lv50Spd + '}';
    }
    
}
