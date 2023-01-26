/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class HutangDaoImpl implements HutangDao {
    
    
      private List<Her_b.Hutang> data = new ArrayList<Her_b.Hutang>();
    
    @Override
    public Her_b.Hutang save(Her_b.Hutang hutang) {
        data.add(hutang);
        return hutang;
    }

    @Override
    public Her_b.Hutang update(int index, Her_b.Hutang hutang) {
        data.set(index, hutang);
        return hutang;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Her_b.Hutang getHutang(int index) {
        return data.get(index);
    }

    @Override
    public List<Her_b.Hutang> getAllHutang() {
        return data;
    }

    @Override
    public void update(Hutang hutang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hutang getTaksi(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

