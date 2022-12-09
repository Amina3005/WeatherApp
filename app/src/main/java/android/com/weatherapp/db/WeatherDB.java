package android.com.weatherapp.db;

import android.com.weatherapp.model.SavedDailyForecast;
import android.com.weatherapp.model.UviDb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {SavedDailyForecast.class, UviDb.class},
version = 1, exportSchema = false)

public abstract class WeatherDB extends RoomDatabase {
    abstract public ForecastDao forecastDao();
}
