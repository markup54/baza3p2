package pl.zabrze.zs10.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    DatabasePlanszowki databasePlanszowki;
    private Button button;
    private EditText editTextNazwa;
    private EditText editTextLiczbaGraczy;
    private Spinner spinerWiek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editTextNazwa = findViewById(R.id.editTextNazwa);
        editTextLiczbaGraczy = findViewById(R.id.editTextNumber);
        spinerWiek = findViewById(R.id.spinner);

        RoomDatabase.Callback mojCallback = new RoomDatabase.Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
            }

            @Override
            public void onOpen(@NonNull SupportSQLiteDatabase db) {
                super.onOpen(db);
            }

            @Override
            public void onDestructiveMigration(@NonNull SupportSQLiteDatabase db) {
                super.onDestructiveMigration(db);
            }
        };
        databasePlanszowki = Room.databaseBuilder(
                MainActivity.this,
                DatabasePlanszowki.class,
                "planszowki_db").addCallback(mojCallback).allowMainThreadQueries().build();
        dodajGryDoBazy();
    }
    private void  dodajGryDoBazy(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());
executorService.execute(
        new Runnable() {
            @Override
            public void run() {
               // databasePlanszowki.zwrocDaoGraPlanszowa().wstawGre(new GraPlanszowa("Splemder",40,4,8,1.5));
               // databasePlanszowki.zwrocDaoGraPlanszowa().wstawGre(new GraPlanszowa("Leżne rozdanie",30,4,8,1.7));
               // databasePlanszowki.zwrocDaoGraPlanszowa().wstawGre(new GraPlanszowa("Biały zamek",70,4,12,3.1));
               // databasePlanszowki.zwrocDaoGraPlanszowa().wstawGre(new GraPlanszowa("Wsiąść do pociągu Legendy Zachoodu",24*60,5,8,2.2));


                handler.post(
                        new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "Dodane do bazy", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
            }
        }
);
    }
}