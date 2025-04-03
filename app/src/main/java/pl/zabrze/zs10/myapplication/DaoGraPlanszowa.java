package pl.zabrze.zs10.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DaoGraPlanszowa {

    @Insert
    public void wstawGre(GraPlanszowa gra);

    @Delete
    public void usunGre(GraPlanszowa gra);

    @Update
    public void edytujGre(GraPlanszowa gra);

    @Query("Select * from gry_planszowe")
    public List<GraPlanszowa> zwrocWszystkieGry();

    @Query("Select * from gry_planszowe where liczbaGraczy>= :liczbaPrzyStole")
    public List<GraPlanszowa> zwrocGryDlaDanejLiczbyGraczy(int liczbaPrzyStole);


}
