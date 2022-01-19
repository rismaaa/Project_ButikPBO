
package Tugas_Kelompok_PBO_Malam;

import javax.swing.table.DefaultTableModel;

public class TabelPenjualan {
    private DefaultTableModel tabel = new DefaultTableModel();
    private double subTotal=0, TotalQty;
    
    public TabelPenjualan() {
        getTabel().addColumn("Barang");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Qty");
        getTabel().addColumn("Jumlah");
    }
    
   public DefaultTableModel getTabel() {
        return tabel;
    } 
    
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
    public double countSubtotal(){
        subTotal=0;
        for (int i=0;i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 3).toString());
        }
        return subTotal;
    }
    
    public double getSubTotal() {
        return subTotal;
    }
    
     public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
     public int CountTotalQty() {
         TotalQty = 0;
         for (int i=0;i<tabel.getRowCount();i++){
            TotalQty=TotalQty+Integer.parseInt(tabel.getValueAt(i, 2).toString());
        }
        return (int) TotalQty;
     }
     
     public double getTotalQty() {
        return (int) TotalQty;
    }
    
     public void setTotalQty(int TotalQty) {
        this.TotalQty = TotalQty;
    }
}
