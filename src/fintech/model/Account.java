package fintech.model;

/**
 * @author 12S23009 Dina Marlina Siagian
 * @author 12S23028 Daniel Situmorang
 */
public class Account {

    private String nama;
    private String singkatan;
    private Double Balance;

    public Account(String nama, String singkatan, Double Balance){
        this.nama = nama;
        this.singkatan = singkatan;
        Balance= 0.0;
    }

    public String getNama(){
        return nama;
    }

    public String getSingkatan(){
        return singkatan;
    }

    public Double getBalance(){
        return Balance;
    }

    public Double setBalance(){
        return Balance;
    }

    @Override
    public String toString(){
        return this.nama + "|" + this.singkatan + "|" + this.Balance;
    }

}