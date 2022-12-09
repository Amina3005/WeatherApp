package android.com.weatherapp.db;

import android.com.weatherapp.model.SavedDailyForecast;
import android.com.weatherapp.model.UviDb;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;


public interface ForecastDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertForecastList(List<SavedDailyForecast> savedDailyForecasts);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUvi(UviDb uviDb);

    @Query("SELECT * FROM saveddailyforecast ORDER BY mdate ASC")
    LiveData<List<SavedDailyForecast>> loadForecast();

    @Query("SELECT * FROM uvidb ")
    LiveData<UviDb> loadUvi();

    @Query("DELETE FROM saveddailyforecast")
    void deleteNewsTable();

    @Query("DELETE FROM uvidb")
    void deleteUvi();
}
