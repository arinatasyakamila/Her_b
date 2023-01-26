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
public class BukuDaoImpl implements BukuDao{
     private List<Buku> data = new ArrayList<Buku>();

    
   
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

  
    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }

    
    public void delete(int index) {
        data.remove(index);
    }

  
    public Her_b.Buku getBuku(int index) {
        return data.get(index);
    }


    public List<Her_b.Buku> getAllBuku() {
        return data;
    }

    
   

   
   

    
}
