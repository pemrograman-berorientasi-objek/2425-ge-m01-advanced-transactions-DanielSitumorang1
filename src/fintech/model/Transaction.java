package fintech.model;

/**
 * @author 12S23009 Dina Marlina Siagian
 * @author 12S23028 Daniel Situmorang
 */
public class Transaction {

    private String inisial;
    private double saldo;
    private String tanggal;
    private String catatan;

    public Transaction(String inisial, double saldo, String tanggal, String catatan){
        this.inisial = inisial;
        saldo = 0.0;
        this.tanggal = tanggal;
        this.catatan = catatan;
    }

    public String getInisial(){
        return inisial;
    }

    public String getTanggal(){
        return tanggal;
    }

    public String getCatatan(){
        return tanggal;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double setSaldo(){
        return this.saldo;
    }

    @Override 
    public String toString(){
        return inisial + "|" + saldo + "|" + tanggal + "|" + catatan;
    }


}