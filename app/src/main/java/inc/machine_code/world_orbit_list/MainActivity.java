package inc.machine_code.world_orbit_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import inc.machine_code.world_orbit_list.Adapter.CountryAdapter;
import inc.machine_code.world_orbit_list.Country.Country;
import inc.machine_code.world_orbit_list.Country.Satellite;

public class MainActivity extends AppCompatActivity implements CountryAdapter.ICallback {

    List<Country> countryList = new ArrayList<>();
    List<Satellite> satellieList = new ArrayList<Satellite>();
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        initRecyclerViewList();

        CountryAdapter adapter = new CountryAdapter(this, countryList);
        mRecyclerView.setAdapter(adapter);
    }

    private void initRecyclerViewList() {
        countryList.add(new Country(1, "ALGERIA", "6", R.mipmap.ic_algeria_foreground));
        countryList.add(new Country(2, "ARGENTINA", "18", R.mipmap.ic_argentina_foreground));
        countryList.add(new Country(3, "AUSTRALIA", "21", R.mipmap.ic_australia_foreground));
        countryList.add(new Country(4, "AZERBAIJAN", "1", R.mipmap.ic_azerbaijan_foreground));
        countryList.add(new Country(5, "BELARUS", "2", R.mipmap.ic_belarus_foreground));
        countryList.add(new Country(6, "BOLIVIA", "1", R.mipmap.ic_bolivia_foreground));
        countryList.add(new Country(7, "BRAZIL", "17", R.mipmap.ic_brazil_foreground));
        countryList.add(new Country(8, "BULGARIA", "1", R.mipmap.ic_bulgaria_foreground));
        countryList.add(new Country(9, "CANADA", "48", R.mipmap.ic_canada_foreground));
        countryList.add(new Country(10, "CHILE", "3", R.mipmap.ic_chile_foreground));
        countryList.add(new Country(11, "CHINA", "296", R.mipmap.ic_china_foreground));
        countryList.add(new Country(12, "CZECH", "3", R.mipmap.ic_czechia_foreground));
        countryList.add(new Country(13, "DENMARK", "9", R.mipmap.ic_denmark_foreground));
        countryList.add(new Country(14, "ECUADOR", "2", R.mipmap.ic_ecuador_foreground));
        countryList.add(new Country(15, "EGYPT", "5", R.mipmap.ic_egypt_foreground));
        countryList.add(new Country(16, "ESTONIA", "1", R.mipmap.ic_estonia_foreground));
        countryList.add(new Country(17, "FRANCE", "68", R.mipmap.ic_france_foreground));
        countryList.add(new Country(18, "GERMANY", "52", R.mipmap.ic_germany_foreground));
        countryList.add(new Country(19, "GREECE", "4", R.mipmap.ic_greece_foreground));
        countryList.add(new Country(20, "INDIA", "88", R.mipmap.ic_india_foreground));
        countryList.add(new Country(21, "INDONESIA", "16", R.mipmap.ic_indonesia_foreground));
        countryList.add(new Country(22, "IRAN", "1", R.mipmap.ic_iran_foreground));
        countryList.add(new Country(23, "IRAQ", "1", R.mipmap.ic_iraq_foreground));
        countryList.add(new Country(24, "ISRAEL", "17", R.mipmap.ic_israel_foreground));
        countryList.add(new Country(25, "ITALY", "27", R.mipmap.ic_italy_foreground));
        countryList.add(new Country(26, "JAPAN", "173", R.mipmap.ic_japan_foreground));
        countryList.add(new Country(27, "KAZAKHSTAN", "6", R.mipmap.ic_kazakhstan_foreground));
        countryList.add(new Country(28, "LAOS", "1", R.mipmap.ic_laos_foreground));
        countryList.add(new Country(29, "LATVIA", "1", R.mipmap.ic_latvia_foreground));
        countryList.add(new Country(30, "LITHUANIA", "1", R.mipmap.ic_lithuania_foreground));
        countryList.add(new Country(31, "LUXEMBOURG", "4", R.mipmap.ic_luxembourg_foreground));
        countryList.add(new Country(32, "MALAYSIA", "7", R.mipmap.ic_malaysia_foreground));
        countryList.add(new Country(33, "MEXICO", "12", R.mipmap.ic_mexico_foreground));
        countryList.add(new Country(34, "MOROCCO", "1", R.mipmap.ic_morocco_foreground));
        countryList.add(new Country(35, "NETHERLANDS", "6", R.mipmap.ic_netherlands_foreground));
        countryList.add(new Country(36, "NIGERIA", "6", R.mipmap.ic_nigeria_foreground));
        countryList.add(new Country(37, "NORTH KOREA", "2", R.mipmap.ic_north_korea_foreground));
        countryList.add(new Country(38, "NORWAY", "2", R.mipmap.ic_norway_foreground));
        countryList.add(new Country(39, "PAKISTAN", "3", R.mipmap.ic_pakistan_foreground));
        countryList.add(new Country(40, "PERU", "1", R.mipmap.ic_peru_foreground));
        countryList.add(new Country(41, "PHILIPPINES", "2", R.mipmap.ic_philippines_foreground));
        countryList.add(new Country(42, "POLAND", "2", R.mipmap.ic_poland_foreground));
        countryList.add(new Country(43, "PORTUGAL", "2", R.mipmap.ic_portugal_foreground));
        countryList.add(new Country(44, "RUSSIA", "1505", R.mipmap.ic_russia_foreground));
        countryList.add(new Country(45, "SAUDI ARABIA", "13", R.mipmap.ic_saudi_arabia_foreground));
        countryList.add(new Country(46, "SINGAPORE", "9", R.mipmap.ic_singapore_foreground));
        countryList.add(new Country(47, "SLOVAKIA", "1", R.mipmap.ic_slovakia_foreground));
        countryList.add(new Country(48, "SOUTH AFRICA", "6", R.mipmap.ic_south_africa_foreground));
        countryList.add(new Country(49, "SOUTH KOREA", "24", R.mipmap.ic_south_korea_foreground));
        countryList.add(new Country(50, "SPAIN", "23", R.mipmap.ic_spain_foreground));
        countryList.add(new Country(51, "SWEDEN", "12", R.mipmap.ic_sweden_foreground));
        countryList.add(new Country(52, "TAIWAN", "9", R.mipmap.ic_taiwan_foreground));
        countryList.add(new Country(53, "THAILAND", "9", R.mipmap.ic_thailand_foreground));
        countryList.add(new Country(54, "TURKEY", "14", R.mipmap.ic_turkey_foreground));
        countryList.add(new Country(55, "UNITED ARAB EMIRATES", "9", R.mipmap.ic_united_arab_emirates_foreground));
        countryList.add(new Country(56, "UNITED KINGDOM", "42", R.mipmap.ic_united_kingdom_foreground));
        countryList.add(new Country(57, "USA", "1619", R.mipmap.ic_united_states_of_america_foreground));
        countryList.add(new Country(58, "URUGUAY", "1", R.mipmap.ic_uruguay_foreground));
        countryList.add(new Country(59, "VENEZUELA", "3", R.mipmap.ic_venezuela_foreground));
        countryList.add(new Country(60, "VIETNAM", "3", R.mipmap.ic_vietnam_foreground));

    }

    public List<Satellite> ALGERIA_Satellite_List() {

        satellieList.add(new Satellite(43039,"ALCOMSAT-1","Communication","Dec-10-2017",R.mipmap.ic_algeria_foreground));
        satellieList.add(new Satellite(41789,"ALSAT 1N","Technology","Sep-26-2016",R.mipmap.ic_algeria_foreground));
        satellieList.add(new Satellite(41786,"ALSAT 2B","army","Sep-26-2016",R.mipmap.ic_algeria_foreground));
        satellieList.add(new Satellite(41785,"ALSAT 1B","army","Sep-26-2016",R.mipmap.ic_algeria_foreground));
        satellieList.add(new Satellite(36798,"ALSAT 2A","army","July-12-2010",R.mipmap.ic_algeria_foreground));
        satellieList.add(new Satellite(27559,"ALSAT 1","army","Nov-28-2002",R.mipmap.ic_algeria_foreground));
        return satellieList;
    }
    public List<Satellite> ARGENTINA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> AUSTRALIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> AZERBAIJAN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> BELARUS_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> BOLIVIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> BRAZIL_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> BULGARIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> CANADA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> CHILE_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> CHINA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> CZECH_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> DENMARK_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> ECUADOR_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> EGYPT_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> ESTONIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> FRANCE_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> GERMANY_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> GREECE_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> INDIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> INDONESIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> IRAN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> IRAQ_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> ISRAEL_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> ITALY_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> JAPAN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> KAZAKHSTAN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> LAOS_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> LATVIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> LITHUANIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> LUXEMBOURG_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> MALAYSIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> MEXICO_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> MOROCCO_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> NETHERLANDS_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> NIGERIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> NORTH_KOREA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> NORWAY_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> PAKISTAN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> PERU_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> PHILIPPINES_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> POLAND_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> PORTUGAL_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> RUSSIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SAUDI_ARABIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SINGAPORE_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SLOVAKIA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SOUTH_AFRICA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SOUTH_KOREA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SPAIN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> SWEDEN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> TAIWAN_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> THAILAND_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> TURKEY_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> UNITED_ARAB_EMIRATES_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> UNITED_KINGDOM_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> USA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> URUGUAY_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> VENEZUELA_Satellite_List() {

        return satellieList;
    }
    public List<Satellite> VIETNAM_Satellite_List() {

        return satellieList;
    }

    public void inClickEvent(Country country) {

        Intent intent = new Intent(getApplicationContext(), SatelliteListActivity.class);

        switch (country.getId()) {
            case 1:
                intent.putExtra("savedUser", (Serializable) ALGERIA_Satellite_List());
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("savedUser", (Serializable) AUSTRALIA_Satellite_List());
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("savedUser", (Serializable) ARGENTINA_Satellite_List());
                startActivity(intent);
                break;
            case 4:
                intent.putExtra("savedUser", (Serializable) AZERBAIJAN_Satellite_List());
                startActivity(intent);
                break;
            case 5:
                intent.putExtra("savedUser", (Serializable) BELARUS_Satellite_List());
                startActivity(intent);
                break;
            case 6:
                intent.putExtra("savedUser", (Serializable) BOLIVIA_Satellite_List());
                startActivity(intent);
                break;
            case 7:
                intent.putExtra("savedUser", (Serializable) BRAZIL_Satellite_List());
                startActivity(intent);
                break;
            case 8:
                intent.putExtra("savedUser", (Serializable) BULGARIA_Satellite_List());
                startActivity(intent);
                break;
            case 9:
                intent.putExtra("savedUser", (Serializable) CANADA_Satellite_List());
                startActivity(intent);
                break;
            case 10:
                intent.putExtra("savedUser", (Serializable) CHILE_Satellite_List());
                startActivity(intent);
                break;
            case 11:
                intent.putExtra("savedUser", (Serializable) CHINA_Satellite_List());
                startActivity(intent);
                break;
            case 12:
                intent.putExtra("savedUser", (Serializable) CZECH_Satellite_List());
                startActivity(intent);
                break;
            case 13:
                intent.putExtra("savedUser", (Serializable) DENMARK_Satellite_List());
                startActivity(intent);
                break;
            case 14:
                intent.putExtra("savedUser", (Serializable) ECUADOR_Satellite_List());
                startActivity(intent);
                break;
            case 15:
                intent.putExtra("savedUser", (Serializable) EGYPT_Satellite_List());
                startActivity(intent);
                break;
            case 16:
                intent.putExtra("savedUser", (Serializable) ESTONIA_Satellite_List());
                startActivity(intent);
                break;
            case 17:
                intent.putExtra("savedUser", (Serializable) FRANCE_Satellite_List());
                startActivity(intent);
                break;
            case 18:
                intent.putExtra("savedUser", (Serializable) GERMANY_Satellite_List());
                startActivity(intent);
                break;
            case 19:
                intent.putExtra("savedUser", (Serializable) GREECE_Satellite_List());
                startActivity(intent);
                break;
            case 20:
                intent.putExtra("savedUser", (Serializable) INDIA_Satellite_List());
                startActivity(intent);
                break;
            case 21:
                intent.putExtra("savedUser", (Serializable) INDONESIA_Satellite_List());
                startActivity(intent);
                break;
            case 22:
                intent.putExtra("savedUser", (Serializable) IRAN_Satellite_List());
                startActivity(intent);
                break;
            case 23:
                intent.putExtra("savedUser", (Serializable) IRAQ_Satellite_List());
                startActivity(intent);
                break;
            case 24:
                intent.putExtra("savedUser", (Serializable) ISRAEL_Satellite_List());
                startActivity(intent);
                break;
            case 25:
                intent.putExtra("savedUser", (Serializable) ITALY_Satellite_List());
                startActivity(intent);
                break;
            case 26:
                intent.putExtra("savedUser", (Serializable) JAPAN_Satellite_List());
                startActivity(intent);
                break;
            case 27:
                intent.putExtra("savedUser", (Serializable) KAZAKHSTAN_Satellite_List());
                startActivity(intent);
                break;
            case 28:
                intent.putExtra("savedUser", (Serializable) LAOS_Satellite_List());
                startActivity(intent);
                break;
            case 29:
                intent.putExtra("savedUser", (Serializable) LATVIA_Satellite_List());
                startActivity(intent);
                break;
            case 30:
                intent.putExtra("savedUser", (Serializable) LITHUANIA_Satellite_List());
                startActivity(intent);
                break;
            case 31:
                intent.putExtra("savedUser", (Serializable) LUXEMBOURG_Satellite_List());
                startActivity(intent);
                break;
            case 32:
                intent.putExtra("savedUser", (Serializable) MALAYSIA_Satellite_List());
                startActivity(intent);
                break;
            case 33:
                intent.putExtra("savedUser", (Serializable) MEXICO_Satellite_List());
                startActivity(intent);
                break;
            case 34:
                intent.putExtra("savedUser", (Serializable) MOROCCO_Satellite_List());
                startActivity(intent);
                break;
            case 35:
                intent.putExtra("savedUser", (Serializable) NETHERLANDS_Satellite_List());
                startActivity(intent);
                break;
            case 36:
                intent.putExtra("savedUser", (Serializable) NIGERIA_Satellite_List());
                startActivity(intent);
                break;
            case 37:
                intent.putExtra("savedUser", (Serializable) NORTH_KOREA_Satellite_List());
                startActivity(intent);
                break;
            case 38:
                intent.putExtra("savedUser", (Serializable) NORWAY_Satellite_List());
                startActivity(intent);
                break;
            case 39:
                intent.putExtra("savedUser", (Serializable) PAKISTAN_Satellite_List());
                startActivity(intent);
                break;
            case 40:
                intent.putExtra("savedUser", (Serializable) PERU_Satellite_List());
                startActivity(intent);
                break;
            case 41:
                intent.putExtra("savedUser", (Serializable) PHILIPPINES_Satellite_List());
                startActivity(intent);
                break;
            case 42:
                intent.putExtra("savedUser", (Serializable) POLAND_Satellite_List());
                startActivity(intent);
                break;
            case 43:
                intent.putExtra("savedUser", (Serializable) PORTUGAL_Satellite_List());
                startActivity(intent);
                break;
            case 44:
                intent.putExtra("savedUser", (Serializable) RUSSIA_Satellite_List());
                startActivity(intent);
                break;
            case 45:
                intent.putExtra("savedUser", (Serializable) SAUDI_ARABIA_Satellite_List());
                startActivity(intent);
                break;
            case 46:
                intent.putExtra("savedUser", (Serializable) SINGAPORE_Satellite_List());
                startActivity(intent);
                break;
            case 47:
                intent.putExtra("savedUser", (Serializable) SLOVAKIA_Satellite_List());
                startActivity(intent);
                break;
            case 48:
                intent.putExtra("savedUser", (Serializable) SOUTH_AFRICA_Satellite_List());
                startActivity(intent);
                break;
            case 49:
                intent.putExtra("savedUser", (Serializable) SOUTH_KOREA_Satellite_List());
                startActivity(intent);
                break;
            case 50:
                intent.putExtra("savedUser", (Serializable) SPAIN_Satellite_List());
                startActivity(intent);
                break;
            case 51:
                intent.putExtra("savedUser", (Serializable) SWEDEN_Satellite_List());
                startActivity(intent);
                break;
            case 53:
                intent.putExtra("savedUser", (Serializable) TAIWAN_Satellite_List());
                startActivity(intent);
                break;
            case 54:
                intent.putExtra("savedUser", (Serializable) THAILAND_Satellite_List());
                startActivity(intent);
                break;
            case 55:
                intent.putExtra("savedUser", (Serializable) TURKEY_Satellite_List());
                startActivity(intent);
                break;
            case 56:
                intent.putExtra("savedUser", (Serializable) UNITED_ARAB_EMIRATES_Satellite_List());
                startActivity(intent);
                break;
            case 57:
                intent.putExtra("savedUser", (Serializable) UNITED_KINGDOM_Satellite_List());
                startActivity(intent);
                break;
            case 58:
                intent.putExtra("savedUser", (Serializable) USA_Satellite_List());
                startActivity(intent);
                break;
            case 59:
                intent.putExtra("savedUser", (Serializable) URUGUAY_Satellite_List());
                startActivity(intent);
                break;
            case 60:
                intent.putExtra("savedUser", (Serializable) VENEZUELA_Satellite_List());
                startActivity(intent);
                break;
            case 61:
                intent.putExtra("savedUser", (Serializable) VIETNAM_Satellite_List());
                startActivity(intent);
                break;
        }
    }
}
