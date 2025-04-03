package pl.zabrze.zs10.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "gry_planszowe")
public class GraPlanszowa {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_gry")
    private int id;
    private String nazwa;

    @ColumnInfo(name = "czas_w_minutach")
    private int czasMinuty;
    private int liczbaGraczy;
    private int minimalnyWiek;
    private double trudnosc;

    @Ignore
    public GraPlanszowa() {
    }

    public GraPlanszowa(String nazwa, int czasMinuty, int liczbaGraczy, int minimalnyWiek, double trudnosc) {
        id = 0;
        this.nazwa = nazwa;
        this.czasMinuty = czasMinuty;
        this.liczbaGraczy = liczbaGraczy;
        this.minimalnyWiek = minimalnyWiek;
        this.trudnosc = trudnosc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCzasMinuty() {
        return czasMinuty;
    }

    public void setCzasMinuty(int czasMinuty) {
        this.czasMinuty = czasMinuty;
    }

    public int getLiczbaGraczy() {
        return liczbaGraczy;
    }

    public void setLiczbaGraczy(int liczbaGraczy) {
        this.liczbaGraczy = liczbaGraczy;
    }

    public int getMinimalnyWiek() {
        return minimalnyWiek;
    }

    public void setMinimalnyWiek(int minimalnyWiek) {
        this.minimalnyWiek = minimalnyWiek;
    }

    public double getTrudnosc() {
        return trudnosc;
    }

    public void setTrudnosc(double trudnosc) {
        this.trudnosc = trudnosc;
    }
}
