/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_b;

/**
 *
 * @author User
 */
public class Hutang {
    private String kode_trans;
    private String tgl_trans;
    private String pembeli;
    private int total_beli;
    private double diskon;
    private int total_hutang;

    public Hutang(){
    }
   

    public Hutang(String kode_trans, String tgl_trans, String pembeli, int total_beli, double diskon, int total_hutang) {
        this.kode_trans = kode_trans;
        this.tgl_trans = tgl_trans;
        this.pembeli = pembeli;
        this.total_beli = total_beli;
        this.diskon = diskon;
        this.total_hutang = total_hutang;
    }

    public String getKode_trans() {
        return kode_trans;
    }

    public void setKode_trans(String kode_trans) {
        this.kode_trans = kode_trans;
    }

    public String getTgl_trans() {
        return tgl_trans;
    }

    public void setTgl_trans(String tgl_trans) {
        this.tgl_trans = tgl_trans;
    }

    public String getPembeli() {
        return pembeli;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public int getTotal_beli() {
        return total_beli;
    }

    public void setTotal_beli(int total_beli) {
        this.total_beli = total_beli;
    }

    public double getDiskon() {
        double diskon = 0.02;
        return diskon;
    }

 

  
    
    public int getTotal_hutang() {
       if(total_beli > 100000){
           double Diskon = 0.02;
           total_hutang  = (int) (total_beli - Diskon);
       }else{
           System.out.println("Tidak dapat Diskon");
       }
       return total_hutang;
        
    }
    
    public void setTotal_hutang(int total_hutang){
        this.total_hutang = total_hutang;
    }

   
    
    
}
