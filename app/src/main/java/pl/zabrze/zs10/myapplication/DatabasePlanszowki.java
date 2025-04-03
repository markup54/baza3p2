package pl.zabrze.zs10.myapplication;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {GraPlanszowa.class}, version = 1,exportSchema = false)
public abstract class DatabasePlanszowki extends RoomDatabase {
    public abstract DaoGraPlanszowa zwrocDaoGraPlanszowa();

}
