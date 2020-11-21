/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan60.akatsuki;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class Akatsuki extends DataAkatsuki{
    private String cincin, ciriKhas;
    
    public String getCincin() {
        return this.cincin;
    }
    
    public void setCincin(String cincin) {
        this.cincin = cincin;
    }
    
    public String getCiriKhas() {
        return this.ciriKhas;
    }
    
    public void setCiriKhas(String ciriKhas) {
        this.ciriKhas = ciriKhas;
    }
    
    public void tampilAnggota() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Asal Desa\t: " + super.getAsalDesa());
        System.out.println("Identitas Cincin: " + getCincin());
        System.out.println("Ciri khas\t: " + getCiriKhas());
        System.out.println();
    } 
}
