/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_b;

import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Her_b.Hutang;
import Her_b.HutangDao;
import Her_b.HutangDaoImpl;
import Her_b.FormHutang;

/**
 *
 * @author User
 */
public class HutangController {
     private FormHutang formHutang;
    private Hutang hutang ;
    private HutangDao hutangDao;
    private int index;
 
    
    public HutangController(FormHutang formHutang){
        this.formHutang = formHutang;
        hutangDao = (HutangDao) new HutangDaoImpl();
    }
    
    public void bersihForm(){
        formHutang.getTxtKode_trans().setText("");
        formHutang.getTxtTgl_trans().setText("");
        formHutang.getTxtPembeli().setText("");
        formHutang.getTxtTotal_beli().setText("");
        formHutang.getTxtDiskon().setText("");
        formHutang.getTxtTotal_hutang().setText("");
    }
    
    public void saveHutang()
    {
        hutang = new Hutang();
        hutang.setKode_trans(formHutang.getTxtKode_trans().getText());
        hutang.setTgl_trans(formHutang.getTxtTgl_trans().getText());
       hutang.setPembeli(formHutang.getTxtPembeli().getText());
        hutang.setTotal_beli (Integer.parseInt(formHutang.getTxtTotal_beli().getText()));
        
        hutang.setTotal_hutang (Integer.parseInt(formHutang.getTxtTotal_hutang().getText()));
        hutangDao.save(hutang);
        JOptionPane.showMessageDialog(formHutang, "Insert Ok");
    }
    
     public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formHutang.getTblHutang().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Hutang> list = hutangDao.getAllHutang();
        for (Hutang hutang: list){
            Object[] data = {
                hutang.getKode_trans(),
                hutang.getTgl_trans(),
                hutang.getPembeli(),
                hutang.getTotal_beli(),
                hutang.getDiskon(),
                hutang.getTotal_hutang()
            };
            tabelModel.addRow(data);
        }

    }
     
      public void updateHutang(){
          int index = formHutang.getTblHutang().getSelectedRow();
       hutang = hutangDao.getHutang(index);
        hutang.setKode_trans(formHutang.getTxtKode_trans().getText());
        hutang.setTgl_trans(formHutang.getTxtTgl_trans().getText());
       hutang.setPembeli(formHutang.getTxtPembeli().getText());
      hutang.setTotal_beli (Integer.parseInt(formHutang.getTxtTotal_beli().getText()));
    
        hutang.setTotal_hutang (Integer.parseInt(formHutang.getTxtTotal_hutang().getText()));
        hutangDao.update(index, hutang);
        JOptionPane.showMessageDialog(formHutang, "Update Ok");
    }
    
     public void deleteHutang(){
        int index = formHutang.getTblHutang().getSelectedRow();
        hutangDao.delete(index);
        JOptionPane.showMessageDialog(formHutang,"Delete ok");
    }
    
   
     public void getHutang(){
            int index = formHutang.getTblHutang().getSelectedRow();
            hutang = hutangDao.getHutang(index);
            if(hutang!=null){
                formHutang.getTxtKode_trans().setText(hutang.getKode_trans());
                formHutang.getTxtTgl_trans().setText(hutang.getTgl_trans()); 
                formHutang.getTxtPembeli().setText(hutang.getPembeli());
                formHutang.getTxtTotal_beli().setText(String.valueOf(hutang.getTotal_beli()));
                formHutang.getTxtDiskon().setText(String.valueOf(hutang.getDiskon()));
                formHutang.getTxtTotal_hutang().setText(String.valueOf(hutang.getTotal_hutang()));
            }
        }
}
