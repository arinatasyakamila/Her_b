/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Her_b;

import java.util.List;

/**
 *
 * @author User
 */
public interface HutangDao {
    Hutang save(Hutang hutang);
    Hutang update(int index, Hutang hutang);
    void delete (int index);
    Hutang getTaksi(int index);
    List<Hutang> getAllHutang();

    public void update(Hutang hutang);

    public Hutang getHutang(int index);
    
}
