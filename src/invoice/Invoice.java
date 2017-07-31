/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author lucif
 */
public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unit;
    private double total;

    public Invoice(String id, String desc, int qty, double unit, double total) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unit = unit;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnit() {
        return unit;
    }

    public double getTotal() {
        return total;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Invoice() {
    }
    
}
