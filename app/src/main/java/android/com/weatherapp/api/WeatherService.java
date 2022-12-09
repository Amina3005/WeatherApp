package android.com.weatherapp.api;

import android.com.weatherapp.model.Uvi;
import android.com.weatherapp.model.WeatherForecast;

import androidx.lifecycle.LiveData;

import retrofit2.http.GET;
import retrofit2.http.Query;

public class WeatherService {
    @GET("forecast/daily")
    LiveData<ApiResponse<WeatherForecast>> getWeatherForecast (@Query("q") String city,
                                                               @Query("cnt") String numDays,
                                                               @Query("units") String units,
                                                               @Query("APPID") String apiKey);
    @GET("uvi")
    LiveData<ApiResponse<Uvi>> getUvi(@Query("lat") Double latitude,
                                      @Query("lon") Double longitude,
                                      @Query("appid") String apiKey);
}
