package ws;

import java.util.Date;

public class Compte {

private int code;
private double solde;
private Date datedecreation;

public Compte() {};
public Compte(int code, double solde, Date datedecreation) {
        this.code = code;
        this.solde = solde;
        this.datedecreation = datedecreation;
    };

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDatedecreation() {
        return datedecreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDatedecreation(Date datedecreation) {
        this.datedecreation = datedecreation;
    }
}
