package EDMaster.Proyecto;

public class MovimientoDinero {

private int id;
private  String concepto;
private  float monto;

    public MovimientoDinero(int id, String concepto, float monto) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}
