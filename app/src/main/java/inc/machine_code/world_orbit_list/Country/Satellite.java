package inc.machine_code.world_orbit_list.Country;

import android.app.LauncherActivity;

import java.io.Serializable;

public class Satellite extends LauncherActivity.ListItem implements Serializable {

    private int Code_No;
    private String Name;
    private String Satellite_Type;
    private String Date;
    private int image;

    public Satellite(int code_No, String name, String satellite_Type, String date, int image) {
        Code_No = code_No;
        Name = name;

        Satellite_Type = satellite_Type;
        Date = date;
        this.image = image;
    }

    public int getCode_No() {
        return Code_No;
    }

    public void setCode_No(int code_No) {
        Code_No = code_No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSatellite_Type() {
        return Satellite_Type;
    }

    public void setSatellite_Type(String satellite_Type) {
        Satellite_Type = satellite_Type;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
