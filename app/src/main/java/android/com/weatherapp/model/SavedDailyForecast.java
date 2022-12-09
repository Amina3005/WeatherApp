package android.com.weatherapp.model;

import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SavedDailyForecast implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @SerializedName("lat")
    private double lat;
    @SerializedName("lon")
    private double lon;
    @SerializedName("mdate")
    public long mdate;
    @SerializedName("temperatureMin")
    public double minTemp;
    @SerializedName("temperatureMax")
    public double maxTemp;
    @SerializedName("temperatureDay")
    public double dayTemp;
    @SerializedName("temperatureNight")
    public double nightTemp;
    @SerializedName("temperatureEvening")
    public double eveningTemp;
    @SerializedName("temperatureMorning")
    public double morningTemp;
    @SerializedName("feelslikeDay")
    public double mfeelslikeDay;
    @SerializedName("feelslikeNight")
    public double mfeelslikeNight;
    @SerializedName("feelslikeEvening")
    public double mfeelslikeEve;
    @SerializedName("feelslikeMorning")
    public double mfeelslikeMorning;
    @SerializedName("humidity")
    public int mhumidity;
    @SerializedName("wind")
    public double mwind;
    @SerializedName("description")
    public String mdescription;
    @SerializedName("weatherid")
    public int weatherid;
    @SerializedName("imageUrl")
    public String imageUrl;

    public SavedDailyForecast() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public long getMdate() {
        return mdate;
    }

    public void setMdate(long mdate) {
        this.mdate = mdate;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getDayTemp() {
        return dayTemp;
    }

    public void setDayTemp(double dayTemp) {
        this.dayTemp = dayTemp;
    }

    public double getNightTemp() {
        return nightTemp;
    }

    public void setNightTemp(double nightTemp) {
        this.nightTemp = nightTemp;
    }

    public double getEveningTemp() {
        return eveningTemp;
    }

    public void setEveningTemp(double eveningTemp) {
        this.eveningTemp = eveningTemp;
    }

    public double getMorningTemp() {
        return morningTemp;
    }

    public void setMorningTemp(double morningTemp) {
        this.morningTemp = morningTemp;
    }

    public double getMfeelslikeDay() {
        return mfeelslikeDay;
    }

    public void setMfeelslikeDay(double mfeelslikeDay) {
        this.mfeelslikeDay = mfeelslikeDay;
    }

    public double getMfeelslikeNight() {
        return mfeelslikeNight;
    }

    public void setMfeelslikeNight(double mfeelslikeNight) {
        this.mfeelslikeNight = mfeelslikeNight;
    }

    public double getMfeelslikeEve() {
        return mfeelslikeEve;
    }

    public void setMfeelslikeEve(double mfeelslikeEve) {
        this.mfeelslikeEve = mfeelslikeEve;
    }

    public double getMfeelslikeMorning() {
        return mfeelslikeMorning;
    }

    public void setMfeelslikeMorning(double mfeelslikeMorning) {
        this.mfeelslikeMorning = mfeelslikeMorning;
    }

    public int getMhumidity() {
        return mhumidity;
    }

    public void setMhumidity(int mhumidity) {
        this.mhumidity = mhumidity;
    }

    public double getMwind() {
        return mwind;
    }

    public void setMwind(double mwind) {
        this.mwind = mwind;
    }

    public String getMdescription() {
        return mdescription;
    }

    public void setMdescription(String mdescription) {
        this.mdescription = mdescription;
    }

    public int getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(int weatherid) {
        this.weatherid = weatherid;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
