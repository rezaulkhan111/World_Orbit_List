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
    List<Satellite> ALGERIA_Sat_Obj,
            ARGENTINA_Sat_Obj,
            AUSTRALIA_Sat_Obj,
            AZERBAIJAN_Sat_Obj,
            BANGLADESH_Sat_Obj,
            BELARUS_Sat_Obj,
            BOLIVIA_Sat_Obj,
            BRAZIL_Sat_Obj,
            BULGARIA_Sat_Obj,
            CANADA_Sat_Obj,
            CHILE_Sat_Obj,
            CHINA_Sat_Obj,
            CZECH_Sat_Obj,
            DENMARK_Sat_Obj,
            ECUADOR_Sat_Obj,
            EGYPT_Sat_Obj,
            ESTONIA_Sat_Obj,
            FRANCE_Sat_Obj,
            GERMANY_Sat_Obj,
            GREECE_Sat_Obj,
            INDIA_Sat_Obj,
            INDONESIA_Sat_Obj,
            IRAN_Sat_Obj,
            IRAQ_Sat_Obj,
            ISRAEL_Sat_Obj,
            ITALY_Sat_Obj,
            JAPAN_Sat_Obj,
            KAZAKHSTAN_Sat_Obj,
            KENIA_Sat_Obj,
            LAOS_Sat_Obj,
            LATVIA_Sat_Obj,
            LITHUANIA_Sat_Obj,
            LUXEMBOURG_Sat_Obj,
            MALAYSIA_Sat_Obj,
            MEXICO_Sat_Obj,
            MOROCCO_Sat_Obj,
            NETHERLANDS_Sat_Obj,
            NIGERIA_Sat_Obj,
            NORTH_KOREA_Sat_Obj,
            NORWAY_Sat_Obj,
            PAKISTAN_Sat_Obj,
            PERU_Sat_Obj,
            PHILIPPINES_Sat_Obj,
            POLAND_Sat_Obj,
            PORTUGAL_Sat_Obj,
            RUSSIA_Sat_Obj,
            SAUDI_ARABIA_Sat_Obj,
            SINGAPORE_Sat_Obj,
            SLOVAKIA_Sat_Obj,
            SOUTH_AFRICA_Sat_Obj,
            SOUTH_KOREA_Sat_Obj,
            SPAIN_Sat_Obj,
            SWEDEN_Sat_Obj,
            TAIWAN_Sat_Obj,
            THAILAND_Sat_Obj,
            TURKEY_Sat_Obj,
            UNITED_ARAB_EMIRATES_Sat_Obj,
            UNITED_KINGDOM_Sat_Obj,
            USA_Sat_Obj,
            URUGUAY_Sat_Obj,
            VENEZUELA_Sat_Obj,
            VIETNAM_Sat_Obj;
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
        countryList.add(new Country(5, "BANGLADESH", "1", R.mipmap.ic_bangladesh_foreground));
        countryList.add(new Country(6, "BELARUS", "2", R.mipmap.ic_belarus_foreground));
        countryList.add(new Country(7, "BOLIVIA", "1", R.mipmap.ic_bolivia_foreground));
        countryList.add(new Country(8, "BRAZIL", "17", R.mipmap.ic_brazil_foreground));
        countryList.add(new Country(9, "BULGARIA", "1", R.mipmap.ic_bulgaria_foreground));
        countryList.add(new Country(10, "CANADA", "48", R.mipmap.ic_canada_foreground));
        countryList.add(new Country(11, "CHILE", "3", R.mipmap.ic_chile_foreground));
        countryList.add(new Country(12, "CHINA", "296", R.mipmap.ic_china_foreground));
        countryList.add(new Country(13, "CZECH", "3", R.mipmap.ic_czechia_foreground));
        countryList.add(new Country(14, "DENMARK", "9", R.mipmap.ic_denmark_foreground));
        countryList.add(new Country(15, "ECUADOR", "2", R.mipmap.ic_ecuador_foreground));
        countryList.add(new Country(16, "EGYPT", "5", R.mipmap.ic_egypt_foreground));
        countryList.add(new Country(17, "ESTONIA", "1", R.mipmap.ic_estonia_foreground));
        countryList.add(new Country(18, "FRANCE", "68", R.mipmap.ic_france_foreground));
        countryList.add(new Country(19, "GERMANY", "52", R.mipmap.ic_germany_foreground));
        countryList.add(new Country(20, "GREECE", "4", R.mipmap.ic_greece_foreground));
        countryList.add(new Country(21, "INDIA", "88", R.mipmap.ic_india_foreground));
        countryList.add(new Country(22, "INDONESIA", "16", R.mipmap.ic_indonesia_foreground));
        countryList.add(new Country(23, "IRAN", "1", R.mipmap.ic_iran_foreground));
        countryList.add(new Country(24, "IRAQ", "1", R.mipmap.ic_iraq_foreground));
        countryList.add(new Country(25, "ISRAEL", "17", R.mipmap.ic_israel_foreground));
        countryList.add(new Country(26, "ITALY", "27", R.mipmap.ic_italy_foreground));
        countryList.add(new Country(26, "JAPAN", "173", R.mipmap.ic_japan_foreground));
        countryList.add(new Country(28, "KAZAKHSTAN", "6", R.mipmap.ic_kazakhstan_foreground));
        countryList.add(new Country(29, "LAOS", "1", R.mipmap.ic_laos_foreground));
        countryList.add(new Country(30, "LATVIA", "1", R.mipmap.ic_latvia_foreground));
        countryList.add(new Country(31, "LITHUANIA", "1", R.mipmap.ic_lithuania_foreground));
        countryList.add(new Country(32, "LUXEMBOURG", "4", R.mipmap.ic_luxembourg_foreground));
        countryList.add(new Country(33, "MALAYSIA", "7", R.mipmap.ic_malaysia_foreground));
        countryList.add(new Country(34, "MEXICO", "12", R.mipmap.ic_mexico_foreground));
        countryList.add(new Country(35, "MOROCCO", "1", R.mipmap.ic_morocco_foreground));
        countryList.add(new Country(36, "NETHERLANDS", "6", R.mipmap.ic_netherlands_foreground));
        countryList.add(new Country(37, "NIGERIA", "6", R.mipmap.ic_nigeria_foreground));
        countryList.add(new Country(38, "NORTH KOREA", "2", R.mipmap.ic_north_korea_foreground));
        countryList.add(new Country(39, "NORWAY", "2", R.mipmap.ic_norway_foreground));
        countryList.add(new Country(40, "PAKISTAN", "3", R.mipmap.ic_pakistan_foreground));
        countryList.add(new Country(41, "PERU", "1", R.mipmap.ic_peru_foreground));
        countryList.add(new Country(42, "PHILIPPINES", "2", R.mipmap.ic_philippines_foreground));
        countryList.add(new Country(43, "POLAND", "2", R.mipmap.ic_poland_foreground));
        countryList.add(new Country(44, "PORTUGAL", "2", R.mipmap.ic_portugal_foreground));
        countryList.add(new Country(45, "RUSSIA", "1505", R.mipmap.ic_russia_foreground));
        countryList.add(new Country(46, "SAUDI ARABIA", "13", R.mipmap.ic_saudi_arabia_foreground));
        countryList.add(new Country(47, "SINGAPORE", "9", R.mipmap.ic_singapore_foreground));
        countryList.add(new Country(48, "SLOVAKIA", "1", R.mipmap.ic_slovakia_foreground));
        countryList.add(new Country(49, "SOUTH AFRICA", "6", R.mipmap.ic_south_africa_foreground));
        countryList.add(new Country(50, "SOUTH KOREA", "24", R.mipmap.ic_south_korea_foreground));
        countryList.add(new Country(51, "SPAIN", "23", R.mipmap.ic_spain_foreground));
        countryList.add(new Country(52, "SWEDEN", "12", R.mipmap.ic_sweden_foreground));
        countryList.add(new Country(53, "TAIWAN", "9", R.mipmap.ic_taiwan_foreground));
        countryList.add(new Country(54, "THAILAND", "9", R.mipmap.ic_thailand_foreground));
        countryList.add(new Country(55, "TURKEY", "14", R.mipmap.ic_turkey_foreground));
        countryList.add(new Country(56, "UNITED ARAB EMIRATES", "9", R.mipmap.ic_united_arab_emirates_foreground));
        countryList.add(new Country(57, "UNITED KINGDOM", "42", R.mipmap.ic_united_kingdom_foreground));
        countryList.add(new Country(58, "USA", "1619", R.mipmap.ic_united_states_of_america_foreground));
        countryList.add(new Country(59, "URUGUAY", "1", R.mipmap.ic_uruguay_foreground));
        countryList.add(new Country(60, "VENEZUELA", "3", R.mipmap.ic_venezuela_foreground));
        countryList.add(new Country(61, "VIETNAM", "3", R.mipmap.ic_vietnam_foreground));

    }

    public List<Satellite> ALGERIA_Satellite_List() {
        ALGERIA_Sat_Obj = new ArrayList<>();
        ALGERIA_Sat_Obj.add(new Satellite(43039, "ALCOMSAT-1", "Communication", "Dec-10-2017", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite(41789, "ALSAT 1N", "Technology", "Sep-26-2016", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite(41786, "ALSAT 2B", "Earth Observation", "Sep-26-2016", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite(41785, "ALSAT 1B", "Earth Observation", "Sep-26-2016", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite(36798, "ALSAT 2A", "army", "July-12-2010", R.mipmap.ic_algeria_foreground));
        ALGERIA_Sat_Obj.add(new Satellite(27559, "ALSAT 1", "Earth Observation", "Nov-28-2002", R.mipmap.ic_algeria_foreground));
        return ALGERIA_Sat_Obj;
    }

    public List<Satellite> ARGENTINA_Satellite_List() {
        ARGENTINA_Sat_Obj = new ArrayList<>();
        ARGENTINA_Sat_Obj.add(new Satellite(43204, "NUSAT 5", "", "Feb-02-18", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(43195, "NUSAT 4", "", "Feb-02-18", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(42760, "NUSAT 3", "", "Jun-15-2017", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(41558, "NUSAT 2(BATATA)", "", "May-30-2016", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(41557, "NUSAT 1(FRESCO)", "", "May-30-2016", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(40941, "ARSAT 2", "", "Sep-30-2015", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(40272, "ARSAT 1", "", "Oct-16-2014", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(40014, "BUGSAT 1", "", "Jun-19-2014", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(39440, "CUBEBUG 2", "", "Nov-21-2013", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(39153, "CUBEBUG 1", "", "Apr-26-2013", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(37673, "SAC-D (AQUARIUS)", "", "Jun-10-2011", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(29712, "PEHUENSAT 1", "", "Jan-10-2007", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(27612, "LATINSAT A", "", "Dec-20-2002", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(27606, "LATINSAT B", "", "Dec-20-2002", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(26620, "SAC C", "", "Nov-21-2000", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(24714, "NAHUEL 1A", "", "Jan-30-1997", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(20442, "OSCAR 19 (LUSAT)", "", "Jan-22-1990", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(15642, "NAHUEL I1 (ANIK C1)", "", "Apr-12-1985", R.mipmap.ic_argentina_foreground));
        ARGENTINA_Sat_Obj.add(new Satellite(14133, "NAHUEL I2 (ANIK C2)", "", "Jun-18-1983", R.mipmap.ic_argentina_foreground));

        return ARGENTINA_Sat_Obj;
    }

    public List<Satellite> AUSTRALIA_Satellite_List() {
        AUSTRALIA_Sat_Obj = new ArrayList<>();
        AUSTRALIA_Sat_Obj.add(new Satellite(42786, "DIAMOND BLUE", "", "Jun-23-2017", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(42785, "DIAMOND GREEN", "", "Jun-23-2017", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(42783, "DIAMOND RED", "", "Jun-23-2017", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(42731, "I-INSPIRE II", "", "Nov-20-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(42730, "SUSAT", "", "Nov-20-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(42721, "CHALLENGER", "", "Nov-20-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(41794, "SKY MUSTER II", "", "Oct-5-2016", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(40940, "SKY MUSTER", "", "Sep-30-2015", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(40146, "OPTUS 10", "", "Sep-11-2014", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(35756, "OPTUS D3", "", "Aug-21-2009", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(32252, "OPTUS D2", "", "Oct-5-2007", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(29495, "OPTUS D1", "", "Oct-13-2006", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(27831, "OPTUS C1", "", "Jun-11-2003", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(27598, "FEDSAT", "", "Dec-14-2002", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(25398, "WESTPAC", "", "Jul-10-1998", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(23227, "OPTUS B3", "", "Aug-27-1994", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(22087, "OPTUS B1(AUSSAT B1)", "", "Aug-13-1992", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(18350, "OPTUS A3(AUSSAT 3)", "", "Sep-16-1987", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(16275, "OPTUS A2(AUSSAT 2)", "", "Nov-27-1985", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(15993, "OPTUS A1(AUSSAT 1)", "", "Aug-27-1985", R.mipmap.ic_australia_foreground));
        AUSTRALIA_Sat_Obj.add(new Satellite(4321, "OSCAR 5", "", "Jan-23-1970", R.mipmap.ic_australia_foreground));
        return AUSTRALIA_Sat_Obj;
    }

    public List<Satellite> AZERBAIJAN_Satellite_List() {
        AZERBAIJAN_Sat_Obj = new ArrayList<>();
        AZERBAIJAN_Sat_Obj.add(new Satellite(39079, "AZERSPACE 1", "", "Feb-7-2013", R.mipmap.ic_azerbaijan_foreground));
        return AZERBAIJAN_Sat_Obj;
    }

    public List<Satellite> BANGLADESH_Satellite_List() {
        BANGLADESH_Sat_Obj = new ArrayList<>();
        BANGLADESH_Sat_Obj.add(new Satellite(43463, "BANGABANDHU", "Communication", "May-11-2018", R.mipmap.ic_bangabandhu1_foreground));
        return BANGLADESH_Sat_Obj;
    }

    public List<Satellite> BELARUS_Satellite_List() {
        BELARUS_Sat_Obj = new ArrayList<>();
        BELARUS_Sat_Obj.add(new Satellite(41238, "BELINTERSAT 1", "cccc", "Jan-15-2016", R.mipmap.ic_belarus_foreground));
        BELARUS_Sat_Obj.add(new Satellite(38708, "BKA 2", "cccc", "Jul-22-2012", R.mipmap.ic_belarus_foreground));
        return BELARUS_Sat_Obj;
    }

    public List<Satellite> BOLIVIA_Satellite_List() {
        BOLIVIA_Sat_Obj = new ArrayList<>();
        BOLIVIA_Sat_Obj.add(new Satellite(39481, "TUPAC KATARI", "", "Dec-20-2013", R.mipmap.ic_bolivia_foreground));
        return BOLIVIA_Sat_Obj;
    }

    public List<Satellite> BRAZIL_Satellite_List() {
        BRAZIL_Sat_Obj = new ArrayList<>();
        BRAZIL_Sat_Obj.add(new Satellite(42692, "SGDC", "", "May-4-2017", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(41904, "STARONE D1", "", "Dec-21-2016", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(40733, "STAR ONE C4", "", "Jul-15-2015", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(40024, "NANOSAT C BR1", "", "Jun-19-2014", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(38991, "STARONE C3", "", "Nov-10-2012", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(32768, "STAR ONE C2", "", "Apr-18-2008", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(32293, "STAR ONE C1", "", "Nov-14-2007", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(26469, "BRAZILSAT B4", "", "Aug-17-2000", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(25941, "SACI 1", "", "Oct-14-1999", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(25504, "SCD 2", "", "Oct-23-1998", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(25152, "BRAZILSAT B3", "", "Feb-4-1998", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(23536, "BRAZILSAT B2", "", "Mar-28-1995", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(23199, "BRAZILSAT B1", "", "Aug-10-1994", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(22490, "SCD 1", "", "Feb-9-1993", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(20440, "OSCAR 17 (DOVE)", "", "Jan-22-1990", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(16650, "BRAZILSAT 2", "", "Mar-28-1986", R.mipmap.ic_brazil_foreground));
        BRAZIL_Sat_Obj.add(new Satellite(15561, "BRAZILSAT 1", "", "Feb-8-1985", R.mipmap.ic_brazil_foreground));
        return BRAZIL_Sat_Obj;
    }

    public List<Satellite> BULGARIA_Satellite_List() {
        BULGARIA_Sat_Obj = new ArrayList<>();
        BULGARIA_Sat_Obj.add(new Satellite(42801, "BULGARIASAT-1", "Communication", "Jun-23-2017", R.mipmap.ic_bulgaria_foreground));
        return BULGARIA_Sat_Obj;
    }

    public List<Satellite> CANADA_Satellite_List() {
        CANADA_Sat_Obj = new ArrayList<>();
        CANADA_Sat_Obj.add(new Satellite(43157, "KEPLER-O (KIPP)", "", "Jan-19-2018", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(42734, "EXALTA-1", "", "Nov-20-1998", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41788, "CANX-7", "", "Sep-26-2016", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41605, "M3MSAT", "", "Jun-22-2016", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41602, "GHGSAT-D", "", "Jun-22-2016", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41036, "TELSTAR 12V", "", "Nov-24-2015", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40936, "EXACTVIEW 9", "", "Sep-28-2015", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40056, "NLS 7.2/CANX 5", "", "Jun-30-2014", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40055, "NLS 7.1/CANX 4", "", "Jun-30-2014", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40020, "BRITE TORONTO", "", "Jun-19-2014", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39265, "CASSIOPE", "", "Sep-29-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39127, "ANIK G1", "", "Apr-15-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39089, "NEOSSAT", "", "Feb-25-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39088, "SAPPHIRE", "", "Feb-25-2013", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(38709, "EXACTVIEW-1", "", "Jul-22-2012", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(38342, "NIMIQ 6", "", "May-17-2012", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(37602, "TELSTAR 14R", "", "May-20-2011", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(35873, "NIMIQ 5", "", "Sep-17-2009", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(34111, "TELSTAR 11N", "", "Feb-26-2009", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(33453, "CIEL-2", "", "Dec-10-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(33373, "NIMIQ 4", "", "Sep-19-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(32790, "CANX-2", "", "Apr-28-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(32784, "CANX-6", "", "Apr-28-2008", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(32382, "RADARSAT 2", "", "Dec-14-2007", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(31102, "ANIK F3", "", "Apr-9-2007", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(28868, "ANIK F1-R", "", "Sep-8-2005", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(28378, "ANIK F2", "", "Jul-18-2004", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27858, "SCISAT 1", "", "Aug-13-2003", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27847, "CANX-1", "", "Jun-30-2003", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27843, "MOST", "", "Jun-30-2003", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27632, "NIMIQ 2", "", "Dec-29-2002", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(26624, "ANIK F1", "", "Nov-21-2000", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(25740, "NIMIQ 1", "", "May-20-1999", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(23846, "MSAT M1", "", "Apr-20-1996", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(23710, "RADARSAT", "", "Nov-4-1995", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(21726, "ANIK E1", "", "Sep-26-1991", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(21222, "ANIK E2", "", "Apr-4-1991", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(13652, "ANIK C3 (TELESAT-5)", "", "Nov-11-1982", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(13652, "ANIK D1 (TELESAT 6)", "", "Aug-26-1982", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(11153, "ANIK B1 (TELESAT-4)", "", "Dec-16-1978", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(8585, "CTS", "", "Jan-17-1976", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(7790, "ANIK A3 (TELESAT-3)", "", "May-7-1975", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(6437, "ANIK A2 (TELESAT 2)", "", "Apr-20-1973", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(6278, "ANIK A1 (TELESAT 1)", "", "Nov-10-1972", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(5104, "ISIS 2", "", "Apr-1-1971", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(3669, "ISIS 1", "", "Jan-30-1969", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(1804, "ALOUETTE 2", "", "Nov-29-1965", R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(424, "ALOUETTE 1 (S-27)", "", "Sep-29-1962", R.mipmap.ic_canada_foreground));
        return CANADA_Sat_Obj;
    }

    public List<Satellite> CHILE_Satellite_List() {
        CHILE_Sat_Obj = new ArrayList<>();
        CHILE_Sat_Obj.add(new Satellite(42788, "SUCHAI", "", "Jun-23-2017", R.mipmap.ic_chile_foreground));
        CHILE_Sat_Obj.add(new Satellite(38011, "SSOT", "", "Dec-17-2011", R.mipmap.ic_chile_foreground));
        CHILE_Sat_Obj.add(new Satellite(25395, "FASAT B", "", "Jul-10-1998", R.mipmap.ic_chile_foreground));
        return CHILE_Sat_Obj;
    }

    public List<Satellite> CHINA_Satellite_List() {
        CHINA_Sat_Obj = new ArrayList<>();
        CHINA_Sat_Obj.add(new Satellite(43519, "XJS B", "", "Jun-27-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43518, "XJS A", "", "Jun-27-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43491, "FENGYUN 2H", "", "Jun-5-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43485, "LUOJIA-1 01", "", "Jun-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43484, "GAOFEN 6", "", "Jun-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43472, "LONGJIANG 2", "", "May-20-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43471, "LONGJIANG 1", "", "May-20-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43470, "QUEQIAO", "", "May-20-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43461, "GAOFEN-5", "", "May-8-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43450, "APSTAR 6C", "", "May-3-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43443, "ZHUHAI-1 OHS-04", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43442, "ZHUHAI-1 OHS-03", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43441, "ZHUHAI-1 OHS-02", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43440, "ZHUHAI-1 OVS-02", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43439, "ZHUHAI-1 OHS-01", "", "Apr-26-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43279, "WEINA 1B", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43277, "YAOGAN-31 C", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43276, "YAOGAN-31 B", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43275, "YAOGAN-31 A", "", "Apr-10-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43262, "GAOFEN 1-04", "", "Mar-31-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43260, "GAOFEN 1-03", "", "Mar-31-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43259, "GAOFEN 1-02", "", "Mar-31-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43246, "BEIDOU 3M8", "", "Mar-29-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43245, "BEIDOU 3M7", "", "Mar-29-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43236, "LKW-4", "", "Mar-17-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43208, "BEIDOU 3M6", "", "Feb-12-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43207, "BEIDOU 3M5", "", "Feb-12-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43199, "SHAONIAN XING", "", "Feb-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43194, "ZHANGHENG-1", "", "Feb-2-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43192, "FENGMANIU 1 (FMN 1)", "Feb-2-2018", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43172, "YAOGAN-30 M", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43171, "YAOGAN-30 L", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43170, "YAOGAN-30 K", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43169, "WEINA 1A", "", "Jan-25-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43160, "JILIN-01-08", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43159, "JILIN-01-07", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43158, "QUANTUTONG 1", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43156, "ZHOU ENLAI", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43155, "XIAOXIANG 2 (TY-2)", "", "Jan-19-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43146, "LKW-3", "", "Jan-13-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43108, "BEIDOU 3M4", "", "Jan-11-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43107, "BEIDOU 3M3", "", "Jan-11-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43100, "SUPERVIEW-1 04", "", "Jan-9-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43099, "SUPERVIEW-1 03", "", "Jan-9-2018", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43083, "YAOGAN-30 J", "", "Dec-25-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43082, "YAOGAN-30 H", "", "Dec-25-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43081, "YAOGAN-30 G", "", "Dec-25-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43080, "LKW-2", "", "Dec-23-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43034, "LKW-1", "", "Dec-3-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43030, "YAOGAN-30 F", "", "Nov-24-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43029, "YAOGAN-30 E", "", "Nov-24-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43028, "YAOGAN-30 D", "", "Nov-24-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43024, "JILIN-01-06", "", "Nov-21-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43023, "JILIN-01-05", "", "Nov-21-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43022, "JILIN-01-04", "", "Nov-21-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43011, "HEAD-1", "", "Nov-14-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43010, "FENGYUN 3D", "", "Nov-14-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43002, "BEIDOU-3 M2", "", "Nov-5-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43001, "BEIDOU-3 M1", "", "Nov-5-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42947, "YAOGAN-30 C", "", "Nov-29-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42946, "YAOGAN-30 B", "", "Nov-29-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42945, "YAOGAN-30 A", "", "Nov-29-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42903, "SILKROAD 1", "", "Apr-20-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42787, "NUDTSAT", "", "Jun-23-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42763, "CHINASAT 9A", "", "Jun-18-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42761, "ZHUHAI-1 01 (CAS 4A)", "", "Jun-15-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42759, "ZHUHAI-1 02 (CAS 4B)", "", "Jun-15-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42758, "HXMT (HUIYAN)", "", "Jun-15-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42735, "AOXIANG-1", "", "Nov-20-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42725, "LILACSAT-1", "", "Nov-20-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42722, "NJUST-1", "", "Nov-20-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42662, "CHINASAT 16", "", "Apr-12-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42061, "TK-1", "", "Mar-2-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41915, "KAIDUN 1", "", "Jan-9-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41914, "JILIN-1-03", "", "Jan-9-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41913, "XY S 1", "", "Jan-9-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41911, "TJS-2", "", "Jan-5-2017", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41908, "SUPERVIEW-1 02", "", "Dec-28-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41907, "SUPERVIEW-1 01", "", "Dec-28-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41901, "SPARK 2", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41900, "SPARK 1", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41899, "YIJIAN", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41898, "TANSAT", "", "Dec-21-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41882, "FENGYUN 4A", "", "Dec-10-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41869, "TIANLIAN 1-04", "", "Nov-22-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41868, "SHENZHOU-11 MODULE", "", "Oct-16-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41857, "YUNHAI 1", "", "Nov-11-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41845, "LISHUI 1-01", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41844, "PINA 2B", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41843, "PINA 2A", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41842, "XIAOXIANG 1", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41841, "XPNAV-1", "", "Nov-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41838, "SJ-17(SHIJIAN-17)", "Nov-3-2016", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41834, "BANXING-2", "", "Sep-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41765, "TIANGONG-2", "", "Sep-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41731, "QSS", "", "Aug-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41727, "GAOFEN 3", "", "Aug-9-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41725, "TIANTONG-1 1", "", "Aug-5-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41634, "SJ 16-02", "", "Jun-29-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41586, "BEIDOU G7", "", "Jun-12-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41556, "ZIYUAN 3-2", "", "May-30-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41473, "YAOGAN 30", "", "May-15-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41434, "BEIDOU IGSO 6", "", "Mar-29-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41315, "BEIDOU M3-S", "", "Feb-1-2016", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41194, "GAOFEN 4", "", "Dec-28-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41173, "DAMPE", "", "Dec-17-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41103, "CHINASAT 1C", "", "Dec-9-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41038, "YAOGAN 29", "", "Nov-26-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41026, "YAOGAN 28", "", "Nov-8-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41021, "CHINASAT 2C (ZX 2C)", "", "Nov-3-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40988, "TIANHUI 1-03", "", "Oct-26-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40982, "APSTAR 9", "", "Oct-16-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40961, "JILIN 1", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40960, "LINGQIAO VIDEO B", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40959, "LINGQIAO VIDEO A", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40958, "LQSAT", "", "Oct-7-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40938, "BEIDOU I2-S", "", "Sep-29-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40928, "TIANWANG 1A (TW-1A)", "", "Sep-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40927, "TIANWANG 1B (TW-1B)", "", "Sep-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40926, "TIANWANG 1C (TW-1C)", "", "Sep-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40925, "PUJIANG 1 (PJ-1)", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40912, "KAITUO 1B", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40911, "XW-2B", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40910, "XW-2F", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40909, "XW-2E", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40908, "LILACSAT 2", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40907, "XW-2D", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40906, "XW-2C", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40904, "KAITUO 1A", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40903, "XW-2A", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40902, "ZDPS 2B", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40901, "ZDPS 2A", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40900, "NUDT-PHONESAT", "", "Sep-19-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40894, "GAOFEN 9", "", "Sep-14-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40892, "TJS-1", "", "Sep-12-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40878, "YAOGAN 27", "", "Aug-27-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40749, "BEIDOU-3 M2", "", "Jul-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40748, "BEIDOU-3 M1", "", "Jul-25-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40701, "GAOFEN 8", "", "Jul-26-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40549, "BEIDOU I1-S", "", "Mar-30-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40424, "ABS 3A", "", "Mar-2-2015", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40367, "FENGYUN 2G", "", "Dec-31-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40362, "YAOGAN 26", "", "Dec-27-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40340, "YAOGAN 25C", "", "Dec-10-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40339, "YAOGAN 25B", "", "Dec-10-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40338, "YAOGAN 25A", "", "Dec-10-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40336, "CBERS-4", "", "Dec-7-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40310, "YAOGAN 24", "", "Nov-20-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40305, "YAOGAN 23", "", "Nov-14-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40286, "SJ-11-08", "", "Oct-27-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40275, "YAOGAN 22", "", "Oct-27-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40261, "SJ-11-07", "", "Sep-28-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40144, "TIANTUO 2", "", "Sep-8-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40143, "YAOGAN 21", "", "Sep-8-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40137, "CHUANG XIN 1-04", "Sep-4-2014", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40136, "LING QIAO", "", "Sep-4-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40118, "GAOFEN 2", "", "Aug-19-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40111, "YAOGAN 20C", "", "Aug-9-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40110, "YAOGAN 20B", "", "Aug-9-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40109, "YAOGAN 20A", "", "Aug-9-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39624, "SJ-11-06", "", "Mar-31-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39508, "ABS 2", "", "Feb-6-2014", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39455, "SHIYAN-5 (SY-5)", "Nov-25-2013", "", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39410, "YAOGAN 19", "", "Nov-25-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39363, "YAOGAN 18", "", "Oct-29-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39358, "SHIJIAN-16 (SJ-16)", "", "Oct-25-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39260, "FENGYUN 3C", "", "Sep-23-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39241, "YAOGAN 17C", "", "Sep-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39240, "YAOGAN 17B", "", "Sep-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39239, "YAOGAN 17A", "", "Sep-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39210, "SHIJIAN-15 (SJ-15)", "", "Jul-19-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39209, "CHUANGXIN-3 (CX-3)", "", "Jul-19-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39208, "SHIYAN-7 (SY-7)", "", "Jul-19-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39202, "SJ-11-05", "", "Jul-15-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39157, "CHINASAT 11", "", "May-1-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39150, "GAOFEN 1", "", "Apr-26-2013", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39017, "CHINASAT 15A", "", "Nov-27-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39013, "YAOGAN 16C", "", "Nov-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39012, "YAOGAN 16B", "", "Nov-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39011, "YAOGAN 16A", "", "Nov-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38999, "XINYAN 1 (XY-1)", "", "Nov-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38998, "FENGNIAO 1 (FN-1)", "", "Nov-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38997, "HJ-1C", "", "Nov-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38953, "BEIDOU G6", "", "Oct-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38861, "SJ-9B", "", "Oct-14-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38860, "SJ-9A", "", "Oct-14-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38775, "BEIDOU M6", "", "Sep-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38774, "BEIDOU M5", "", "Sep-18-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38730, "TIANLIAN 1-03", "", "Jul-25-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38354, "YAOGAN 15", "", "May-29-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38352, "CHINASAT 2A", "", "May-26-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38257, "YAOGAN 14", "", "May-10-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38256, "TIANHUI 1-02", "", "May-6-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38251, "BEIDOU M4", "", "Apr-29-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38250, "BEIDOU M3", "", "Apr-29-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38107, "APSTAR 7", "", "Mar-31-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38091, "BEIDOU G5", "", "Feb-24-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38049, "FENGYUN 2F", "", "Feb-13-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38046, "ZY 3", "", "Feb-9-2012", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38038, "ZY 1", "", "Dec-22-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37948, "BEIDOU IGSO 5", "", "Dec-1-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37941, "YAOGAN 13", "", "Nov-29-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37931, "SHIYUAN 4", "", "Nov-20-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37930, "CHUANG XIN 1-03", "", "Nov-20-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37875, "YAOGAN 12", "", "Nov-9-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37804, "CHINASAT 1A", "", "Sep-17-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37781, "HAIYANG 2A", "", "Aug-15-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37765, "SJ-11-02", "", "Jul-29-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37763, "BEIDOU IGSO 4", "", "Jul-26-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37737, "TIANLIAN 1-02", "", "Jul-11-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37730, "SJ-11-03", "", "Jul-6-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37677, "CHINASAT 10", "", "Jun-20-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37384, "BEIDOU IGSO 3", "", "Apr-9-2011", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37256, "BEIDOU IGSO 2", "", "Dec-17-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37234, "CHINASAT 20A", "", "Nov-24-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37214, "FENGYUN 3B", "", "Nov-4-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37210, "BEIDOU G4", "", "Oct-31-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37180, "SJ-6H", "", "Oct-6-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37179, "SJ-6G", "", "Oct-6-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37174, "CHANG E 2", "", "Oct-1-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37167, "ZHEDA PIXING 1C", "", "Sep-22-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37166, "ZHEDA PIXING 1B", "", "Sep-22-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37165, "YAOGAN 11", "", "Sep-22-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37150, "CHINASAT 6A", "", "Sep-4-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36985, "TIANHUI 1", "", "Aug-24-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36834, "YAOGAN 10", "", "Aug-9-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36828, "BEIDOU IGSO 1", "", "Jul-31-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36596, "SJ-12", "", "Jun-15-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36590, "BEIDOU G3", "", "Jun-2-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36415, "YAOGAN 9C", "", "Mar-5-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36414, "YAOGAN 9B", "", "Mar-5-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36413, "YAOGAN 9A", "", "Mar-5-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36287, "BEIDOU G1", "", "Jan-16-2010", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36122, "XIWANG-1 (HOPE-1)", "", "Dec-15-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36121, "YAOGAN 8", "", "Dec-15-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36110, "YAOGAN 7", "", "Dec-9-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36088, "SJ-11-01", "", "Nov-12-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(34839, "YAOGAN 6", "", "Apr-22-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(34779, "BEIDOU G2", "", "Apr-14-2009", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33463, "FENGYUN 2E", "", "Dec-23-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33446, "YAOGAN 4", "", "Dec-1-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33434, "CHUANG XIN 1-02(CX-1-02)", "", "Nov-5-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33433, "SHIYUAN 3 (SY-3)", "", "Nov-5-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33409, "SJ-6F", "", "Oct-25-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33408, "SJ-6E", "", "Oct-25-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33321, "HJ-1B", "", "Sep-6-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33320, "HJ-1A", "", "Sep-6-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33051, "CHINASAT 9", "", "Jun-9-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(32958, "FENGYUN 3A", "", "May-27-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(32779, "CTDRS", "", "Apr-25-2008", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(32289, "YAOGAN 3", "", "Nov-11-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31800, "CHINASAT 6B", "", "Jul-5-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31490, "YAOGAN 2", "", "May-25-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31115, "BEIDOU M1", "", "Apr-13-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31113, "HAIYANG 1B", "", "Apr-11-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(30323, "BEIDOU 1D", "", "Feb-2-2007", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29640, "FENGYUN 2D", "", "Dec-8-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29516, "SINOSAT 2", "", "Oct-28-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29506, "SJ-6D", "", "Oct-23-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29505, "SJ-6C", "", "Oct-23-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29398, "CHINASAT 22A", "", "Sep-12-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29092, "YAOGAN 1", "", "Apr-26-2006", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28890, "BEIJING 1 (TSINGHUA)", "", "Oct-27-2005", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28737, "SJ-7", "", "Jul-5-2005", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28638, "APSTAR 6", "", "Apr-12-2005", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28479, "TANSUO 2", "", "Nov-18-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28470, "JB-3 C", "", "Nov-6-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28451, "FENGYUN 2C", "", "Oct-19-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28414, "SJ-6B", "", "Sep-8-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28413, "SJ-6A", "", "Sep-8-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28382, "DOUBLESTAR (TC-2)", "", "Jul-25-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28364, "APSTAR 5 (TELSTAR 18)", "", "Jun-29-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28221, "NAXING 1", "", "Apr-18-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28220, "TANSUO 1", "", "Apr-18-2004", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28082, "CHINASAT 20", "", "Nov-14-2003", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28058, "CHUANG XIN 1 (CZ-1)", "", "Oct-21-2003", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(27813, "BEIDOU 1C", "", "May-24-2003", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(27431, "FENGYUN 1D", "", "May-15-2002", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(27430, "HAIYANG 1", "", "May-15-2002", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26643, "BEIDOU 1B", "", "Dec-20-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26599, "BEIDOU 1", "", "Oct-30-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26385, "TZINGHUA 1", "", "Jun-28-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26382, "FENGYUN 2B", "", "Jun-25-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26058, "CHINASAT 22", "", "Jan-25-2000", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25924, "ABS 1(LMI 1)", "", "Sep-26-1999", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25731, "SJ-5", "", "May-10-1999", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25730, "FENGYUN 1C", "", "May-10-1999", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25404, "CHINASAT 5B (SINOSAT 1)", "", "Jul-18-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25354, "CHINASAT 5A (CHINASTAR1)", "", "May-30-1998", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25010, "APSTAR 2R (TELSTAR 10)", "", "Oct-16-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24926, "DUMMY MASS 2", "", "Sep-1-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24925, "DUMMY MASS 1", "", "Sep-1-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24901, "ABS 3", "", "Aug-19-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24834, "FENGYUN 2A", "", "Jun-10-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24798, "DFH-3 2", "", "May-11-1997", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24282, "CHINASAT 7", "", "Aug-18-1996", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(23943, "APSTAR 1A", "", "Jul-3-1996", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(23415, "DFH-3 1", "", "Nov-29-1994", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(23185, "APSTAR 1", "", "Jul-21-1994", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(22996, "SJ-4", "", "Feb-8-1994", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(21833, "STTW-5", "", "Dec-28-1991", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(20788, "FENGYUN 1B", "", "Sep-3-1990", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(20473, "STTW-4", "", "Feb-4-1990", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(19710, "STTW-3", "", "Dec-22-1988", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(19467, "FENGYUN 1A", "", "Sep-6-1988", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(18922, "STTW-2", "", "Mar-7-1988", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(16526, "STTW-1", "", "Feb-1-1986", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(14985, "CHINASAT 5(SPACENET 1)", "", "May-23-1984", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(14899, "STTW-T2", "", "Apr-8-1984", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(14670, "STTW-T1", "", "Jan-29-1984", R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(4382, "DFH-1", "", "Apr-24-1970", R.mipmap.ic_china_foreground));

        return CHINA_Sat_Obj;
    }

    public List<Satellite> CZECH_Satellite_List() {
        CZECH_Sat_Obj = new ArrayList<>();
        CZECH_Sat_Obj.add(new Satellite(42790, "VZLUSAT 1", "Research", "Jun-23-2017", R.mipmap.ic_czechia_foreground));
        CZECH_Sat_Obj.add(new Satellite(24292, "MAGION 5", "", "Aug-29-1996", R.mipmap.ic_czechia_foreground));
        CZECH_Sat_Obj.add(new Satellite(23646, "MAGION 4", "", "Aug-2-1995", R.mipmap.ic_czechia_foreground));
        return CZECH_Sat_Obj;
    }

    public List<Satellite> DENMARK_Satellite_List() {
        DENMARK_Sat_Obj = new ArrayList<>();
        DENMARK_Sat_Obj.add(new Satellite(43197, "GOMX4-A", "", "Feb-2-2018", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(41460, "AAUSAT-4", "", "Apr-25-2016", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(40030, "DTUSAT-2", "", "Jun-19-2014", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(39430, "GOMX 1", "", "Nov-21-2013", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(39087, "AAUSAT3", "", "-Feb-25-2013", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(32788, "AAUSAT CUBESAT 2", "", "Apr-28-2008", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(27846, "AAU CUBESAT", "", "Jun-30-2003", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(27842, "DTUSAT", "", "Jun-30-2003", R.mipmap.ic_denmark_foreground));
        DENMARK_Sat_Obj.add(new Satellite(25635, "ORSTED", "", "Feb-23-1999", R.mipmap.ic_denmark_foreground));
        return DENMARK_Sat_Obj;
    }

    public List<Satellite> ECUADOR_Satellite_List() {
        ECUADOR_Sat_Obj = new ArrayList<>();
        ECUADOR_Sat_Obj.add(new Satellite(39441, "NEE 02 KRYSAOR", "", "Nov-21-2013", R.mipmap.ic_ecuador_foreground));
        ECUADOR_Sat_Obj.add(new Satellite(39151, "NEE 01 PEGASUS", "", "Apr-26-2013", R.mipmap.ic_ecuador_foreground));
        return ECUADOR_Sat_Obj;
    }

    public List<Satellite> EGYPT_Satellite_List() {
        EGYPT_Sat_Obj = new ArrayList<>();
        EGYPT_Sat_Obj.add(new Satellite(39678, "EGYPTSAT 2", "", "Apr-16-2014", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite(36830, "NILESAT 201", "", "Aug-4-2010", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite(31117, "EGYPTSAT 1", "", "Apr-17-2007", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite(26470, "NILESAT 102", "", "Aug-17-2000", R.mipmap.ic_egypt_foreground));
        EGYPT_Sat_Obj.add(new Satellite(25311, "NILESAT", "", "Apr-28-1998", R.mipmap.ic_egypt_foreground));
        return EGYPT_Sat_Obj;
    }

    public List<Satellite> ESTONIA_Satellite_List() {
        ESTONIA_Sat_Obj = new ArrayList<>();
        ESTONIA_Sat_Obj.add(new Satellite(39161, "ESTCUBE 1", "", "May 7, 2013", R.mipmap.ic_estonia_foreground));
        return ESTONIA_Sat_Obj;
    }

    public List<Satellite> FRANCE_Satellite_List() {
        FRANCE_Sat_Obj = new ArrayList<>();
        FRANCE_Sat_Obj.add(new Satellite(43272, "HYLAS 4", "", "Apr-5-2018", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(43271, "SUPERBIRD 8", "", "Apr-5-2018", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(43132, "PICSAT", "", "Jan-12-2018", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(42792, "ROBUSTA 1B", "", "Jun-23-2017", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(42707, "XCUBESAT", "", "Nov-20-1998-", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(41748, "INTELSAT 33E", "", "Aug-24-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(41747, "INTELSAT 36", "", "Aug-24-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(41461, "ASAP-S", "", "Apr-25-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(41457, "MICROSCOPE", "", "Apr-26-2016", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(40053, "SPOT 7", "", "Jun-30-2014", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(39019, "PLEIADES 1B", "", "Dec-2-2012", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38755, "SPOT 6", "", "Sep-9-2012", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38013, "ASAP-S", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38012, "PLEIADES 1", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38010, "ELISA E12", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38009, "ELISA W23", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38008, "ELISA E24", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(38007, "ELISA W11", "", "Dec-17-2011", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(36598, "PICARD", "", "Jun-15-2010", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(36124, "HELIOS 2B", "", "Dec-17-2009", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(33752, "SPIRALE B", "", "Feb-12-2009", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(33751, "SPIRALE A", "", "Feb-12-2009", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(33105, "JASON 2", "", "Jun-20-2008", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(29678, "COROT", "", "Dec-27-2006", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(29273, "SYRACUSE 3B", "", "Aug-11-2006", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28885, "SYRACUSE 3A", "", "Oct-3-2005", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28545, "MAQSAT/ARIANE 5", "", "Feb-12-2005", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28498, "PARASOL", "", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28497, "ESSAIM-4", "", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28496, "ESSAIM-3", "", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28495, "ESSAIM-2", "", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28494, "ESSAIM-1", "", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28492, "HELIOS-2A", "", "Dec-18-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(28368, "DEMETER", "", "Jun-29-2004", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(27422, "IDEFIX/ARIANE 42P", "", "May-4-2002", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(27421, "SPOT 5", "", "May-4-2002", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(25978, "CLEMENTINE", "", "Dec-3-1999", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(25977, "HELIOS 1B", "", "Dec-3-1999", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(25503, "MAQSAT/ARIANE 5", "", "Oct-21-1998", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(25260, "SPOT 4", "", "Mar-24-1998", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(24209, "TELECOM 2D", "", "Aug-8-1996", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(23730, "TELECOM 2C", "", "Dec-6-1995", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(23606, "CERISE", "", "Jul-7-1995", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(23605, "HELIOS 1A", "", "Jul-7-1995", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(22824, "STELLA", "", "Sep-26-1993", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(22823, "SPOT 3", "", "Sep-26-1993", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(22654, "ARSENE", "", "May-12-1993", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(22078, "S80/T", "", "Aug-10-1992", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(21939, "TELECOM 2B", "", "Apr-15-1992", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(21813, "TELECOM 2A", "", "Dec-16-1991", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(21578, "SARA", "", "Jul-17-1991", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(20705, "TDF 2", "", "Jul-24-1990", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(20436, "SPOT 2", "", "Jan-22-1990", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(19621, "TDF 1", "", "Oct-28-1988", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(18952, "TELECOM 1C", "", "Mar-11-1988", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(16613, "SPOT 1", "", "Feb-22-1986", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(15678, "TELECOM 1B", "", "May-8-1985", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(15159, "TELECOM 1A", "", "Aug-4-1984", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(12848, "AUREOLE 3", "", "Sep-21-1981", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(7646, "STARLETTE", "", "Feb-6-1975", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(7003, "AUREOLE 2", "", "Dec-26-1973", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(5729, "AUREOLE 1", "", "Dec-27-1971", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(5435, "EOLE 1 (CAS-A)", "", "Aug-16-1971", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(2680, "DIADEME 2", "", "Feb-15-1967", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(2674, "DIADEME 1", "", "Feb-8-1967", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(2016, "DIAPASON (D1-A)", "", "Feb-17-1966", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(1814, "FR 1", "", "Dec-6-1965", R.mipmap.ic_france_foreground));
        FRANCE_Sat_Obj.add(new Satellite(1778, "A-1(ASTERIX)", "", "Nov-26-1965", R.mipmap.ic_france_foreground));
        return FRANCE_Sat_Obj;
    }

    public List<Satellite> GERMANY_Satellite_List() {
        GERMANY_Sat_Obj = new ArrayList<>();
        GERMANY_Sat_Obj.add(new Satellite(42831, "FLYING LAPTOP", "", "Jul-14-2017", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(42829, "TECHNOSAT", "", "Jul-14-2017", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(42777, "COMPASS 2", "", "Jun-23-2017", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(42701, "SOMP-2", "", "Nov-20-1998", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(41619, "BEESAT 4", "", "Jun-22-2016", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(41604, "BIROS", "", "Jun-22-2016", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(40054, "AISAT", "", "Jun-30-2014", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(39446, "UWE-3", "", "Nov-21-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(39439, "FIRST-MOVE", "", "Nov-21-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(39435, "WREN", "", "Nov-21-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(39136, "BEESAT 2", "", "Apr-19-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(39135, "BEESAT 3", "", "Apr-19-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(39134, "SOMP", "", "Apr-19-2013", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(38710, "TET-1", "", "Jul-22-2012", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(36605, "TANDEM X", "", "Jun-21-2010", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(36582, "COMSATBW-2", "", "May-21-2010", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(35943, "COMSATBW-1", "", "Sep-30-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(35936, "RUBIN 9.1/RUBIN 9.2/PSLV", "", "Sep-23-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(35934, "UWE-2", "", "Sep-23-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(35933, "BEESAT", "", "Sep-23-2009", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(33316, "RAPIDEYE 4", "", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(33315, "RAPIDEYE 3", "", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(33314, "RAPIDEYE 1", "", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(33313, "RAPIDEYE 5", "", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(33312, "RAPIDEYE 2", "", "Aug-29-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(33244, "SAR LUPE 5", "", "Jul-22-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(32792, "RUBIN 8/PSLV", "", "Apr-28-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(32787, "COMPASS 1", "", "Apr-28-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(32750, "SAR LUPE 4", "", "Mar-27-2008", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(32283, "SAR LUPE 3", "", "Nov-1-2007", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(31797, "SAR LUPE 2", "", "Jul-2-2007", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(31698, "TERRA SAR X", "", "Jun-15-2007", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(29658, "SAR LUPE 1", "", "Dec-19-2006", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(28898, "MOZ.5/SAFIR/RUBIN 5/SL-8", "", "Oct-27-2005", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(28892, "UWE-1", "", "Oct-27-2005", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(27940, "RUBIN 4/SL-8", "", "Sep-27-2003", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(27605, "RUBIN 2", "", "Dec-20-2002", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(27561, "RUBIN 3/SL-8", "", "Nov-28-2002", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(27004, "MAROC TUBSAT", "", "Dec-10-2001", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(26959, "BIRD 2", "", "Oct-22-2001", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(26609, "AMSAT OSCAR 40", "", "Nov-16-2000", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(25757, "TUBSAT", "", "May-26-1999", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(25399, "SAFIR 2", "", "Jul-10-1998", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(25068, "EQUATOR S", "", "Dec-2-1997", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(22970, "TUBSAT B", "", "Jan-25-1994", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(21577, "TUBSAT A", "", "Jul-17-1991", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(20706, "DFS 2", "", "Jul-24-1990", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(20168, "TVSAT 2", "", "Aug-8-1989", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(20041, "DFS 1", "", "Jun-5-1989", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(18570, "TVSAT 1", "", "Nov-21-1987", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(14129, "OSCAR 10", "", "Jun-16-1983", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(8582, "HELIOS 2", "", "Jan-15-1976", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(7567, "HELIOS 1", "", "Dec-10-1974", R.mipmap.ic_germany_foreground));
        GERMANY_Sat_Obj.add(new Satellite(4221, "AZUR (GRS A)", "", "Nov-8-1969", R.mipmap.ic_germany_foreground));
        return GERMANY_Sat_Obj;
    }

    public List<Satellite> GREECE_Satellite_List() {
        GREECE_Sat_Obj = new ArrayList<>();
        GREECE_Sat_Obj.add(new Satellite(42724, "DUTHSAT", "", "Nov-20-1998", R.mipmap.ic_greece_foreground));
        GREECE_Sat_Obj.add(new Satellite(42716, "UPSAT", "", "Nov-20-1998", R.mipmap.ic_greece_foreground));
        GREECE_Sat_Obj.add(new Satellite(27811, "HELLAS-SAT 2", "", "May-13-2003", R.mipmap.ic_greece_foreground));
        GREECE_Sat_Obj.add(new Satellite(22175, "HELLAS SAT 1 (DFS 3)", "", "Oct-12-1992", R.mipmap.ic_greece_foreground));
        return GREECE_Sat_Obj;
    }

    public List<Satellite> INDIA_Satellite_List() {
        INDIA_Sat_Obj = new ArrayList<>();
        INDIA_Sat_Obj.add(new Satellite(43286, "IRNSS 1I", "", "Apr-11-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(43241, "GSAT 6A", "", "Mar-29-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(43128, "MICROSAT-TD", "", "Jan-12-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(43111, "CARTOSAT 2F", "", "Jan-12-2018", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(42928, "IRNSS 1H/PSLV", "", "Aug-31-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(42815, "GSAT 17", "", "Jun-28-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(42767, "CARTOSAT 2E", "", "Jun-23-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(42766, "NIUSAT", "", "Jun-23-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(42747, "GSAT 19", "", "Jun-5-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(42695, "GSAT 9", "", "May-5-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41954, "INS-1B", "", "Feb-15-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41949, "INS-1A", "", "Feb-15-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41948, "CARTOSAT 2D", "", "Feb-15-2017", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41877, "RESOURCESAT 2A", "", "Dec-7-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41793, "GSAT 18", "", "Oct-5-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41790, "SCATSAT 1", "", "Sep-26-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41783, "PRATHAM", "", "Sep-26-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41752, "INSAT 3DR", "", "Sep-8-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41607, "SWAYAM", "", "Jun-22-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41600, "SATHYABAMASAT", "", "Jun-22-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41599, "CARTOSAT 2C", "", "Jun-22-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41469, "IRNSS 1G", "", "Apr-28-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41384, "IRNSS 1F", "", "Mar-10-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41241, "IRNSS-1E", "", "Jan-20-2016", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(41028, "GSAT 15", "", "Nov-10-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(40930, "ASTROSAT", "", "Sep-28-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(40880, "GSAT 6", "", "Aug-27-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(40547, "IRNSS 1D", "", "Mar-28-2015", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(40332, "GSAT 16", "", "Dec-6-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(40269, "IRNSS 1C", "", "Oct-15-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39635, "IRNSS 1B", "", "Apr-4-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39498, "GSAT-14", "", "Jan-5-2014", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39370, "MARS ORBITER MISSION", "", "Nov-5-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39234, "GSAT-7 (INSAT 4F)", "", "Aug-29-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39216, "INSAT 3D", "", "Jul-25-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39199, "IRNSS-1A", "", "Jul-1-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(39086, "SARAL", "", "Feb-25-2013", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(38779, "GSAT 10", "", "Sep-28-2012", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(38248, "RISAT 1", "", "Apr-26-2012", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37841, "SRMSAT", "", "Oct-12-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37839, "JUGNU", "", "Oct-12-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37838, "MEGHA-TROPIQUES", "", "Oct-12-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37746, "GSAT 12", "", "Jul-15-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37605, "GSAT 8", "", "May-20-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37388, "YOUTHSAT", "", "Apr-20-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(37387, "RESOURCESAT 2", "", "Apr-20-2011", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(36796, "STUDSAT", "", "Jul-12-2010", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(36795, "CARTOSAT 2B", "", "Jul-12-2010", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(35931, "OCEANSAT 2", "", "Sep-23-2009", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(34807, "RISAT-2", "", "Apr-20-2009", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(33405, "CHANDRAYAAN 1", "", "Oct-22-2008", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(32786, "IMS-1", "", "Apr-28-2008", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(32783, "CARTOSAT 2A", "", "Apr-28-2008", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(32050, "INSAT 4CR", "", "Sept-2-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(31136, "AAM/PSLV", "", "Apr-23-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(30793, "INSAT 4B", "", "Mar-11-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(29710, "CARTOSAT 2AT", "", "Jan-10-2007", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(28911, "INSAT 4A", "", "Dec-21-2005", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(28650, "HAMSAT (VO-52)", "", "May-5-2005", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(28649, "CARTOSAT-1", "", "May-5-2005", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(28417, "GSAT 3 (EDUSAT)", "", "Sep-20-2004", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(28051, "IRS P6", "", "Oct-17-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(27951, "INSAT 3E", "", "Sep-27-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(27807, "GSAT 2", "", "May-8-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(27714, "INSAT 3A", "", "Apr-9-2003", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(27525, "KALPANA 1 (METSAT 1)", "", "Sep-12-2002", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(27298, "INSAT 3C", "", "Jan-23-2002", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(26957, "TES", "", "Oct-22-2001", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(26745, "GSAT 1", "", "Apr-18-2001", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(26108, "INSAT 3B", "", "Mar-21-2000", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(25758, "IRS P4 (OCEANSAT 1)", "", "May-26-1999", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(25666, "INSAT 2E (APR-1)", "", "Apr-2-1999", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(24971, "IRS 1D", "", "Sep-29-1997", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(24820, "INSAT 2D", "", "Jun-3-1997", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(23827, "IRS B3", "", "Mar-21-1996", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(23751, "IRS 1C", "", "Dec-28-1995", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(23731, "INSAT 2C", "", "Dec-6-1995", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(23323, "IRS P2", "", "Oct-15-1994", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(22724, "INSAT 2B", "", "Jul-22-1993", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(22027, "INSAT 2A", "", "Jul-9-1992", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(21894, "INSAT 2R (ARABSAT 1C)", "", "Feb-26-1992", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(21688, "IRS 1B", "", "Aug-29-1991", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(20643, "INSAT 1D", "", "Jun-12-1990", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(19330, "INSAT 1C", "", "Jul-21-1988", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(18960, "IRS 1A", "", "Mar-17-1988", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(14318, "INSAT 1B", "", "Aug-30-1983", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(13129, "INSAT 1A", "", "Apr-10-1982", R.mipmap.ic_india_foreground));
        INDIA_Sat_Obj.add(new Satellite(12545, "APPLE", "", "Jun-19-1981", R.mipmap.ic_india_foreground));
        return INDIA_Sat_Obj;
    }

    public List<Satellite> INDONESIA_Satellite_List() {
        INDONESIA_Sat_Obj = new ArrayList<>();
        INDONESIA_Sat_Obj.add(new Satellite(41944, "TELKOM 3S", "", "Feb-14-2017", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(41603, "LAPAN A3", "", "Jun-22-2016", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(41591, "BRISAT", "", "Jun-18-2016", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(40931, "LAPAN A2 (IO-86)", "", "Sep-28-2015", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(38744, "TELKOM 3", "", "Aug-6-2012", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(35812, "PALAPA D", "", "Aug-31-2009", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(29709, "LAPAN-TUBSAT", "", "Jan-10-2007", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(28902, "TELKOM 2", "", "Nov-16-2005", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(26089, "GARUDA 1", "", "Feb-12-2000", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(25880, "TELKOM 1", "", "Aug-12-1999", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(25050, "INDOSTAR 1", "", "Nov-11-1997", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(23864, "PALAPA C2", "", "May-16-1996", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(21964, "PALAPA B4", "", "May-14-1992", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(14134, "PALAPA B1", "", "Jun-18-1983", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(9862, "PALAPA 2", "", "Mar-10-1977", R.mipmap.ic_indonesia_foreground));
        INDONESIA_Sat_Obj.add(new Satellite(9009, "PALAPA 1", "", "Jul-8-1976", R.mipmap.ic_indonesia_foreground));
        return INDONESIA_Sat_Obj;
    }

    public List<Satellite> IRAQ_Satellite_List() {
        IRAQ_Sat_Obj = new ArrayList<>();
        IRAQ_Sat_Obj.add(new Satellite(40043, "TIGRISAT", "Dust Storm Detected", "Jun-19-2014", R.mipmap.ic_iran_foreground));
        return IRAQ_Sat_Obj;
    }

    public List<Satellite> IRAN_Satellite_List() {
        IRAN_Sat_Obj = new ArrayList<>();
        IRAN_Sat_Obj.add(new Satellite(28893, "SINAH 1", "telecom & Research", "Oct-27-2005", R.mipmap.ic_iran_foreground));
        return IRAN_Sat_Obj;
    }

    public List<Satellite> ISRAEL_Satellite_List() {
        ISRAEL_Sat_Obj = new ArrayList<>();
        ISRAEL_Sat_Obj.add(new Satellite(42901, "VENUS", "", "Aug-2-2017", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(42000, "DIDO 2", "", "Feb-15-2017", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(41999, "BGUSAT", "", "Feb-15-2017", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(41759, "OFEQ 11", "", "Sep-13-2016", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(40021, "DUCHIFAT-1", "", "Jun-19-2014", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(39650, "OFEQ 10", "", "Apr-9-2014", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(39237, "AMOS-4", "", "Aug-31-2013", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(37950, "AMOS 5", "", "Dec-11-2011", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(36608, "OFEQ 9", "", "Jun-22-2010", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(32794, "AMOS 3", "", "Apr-28-2008", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(32476, "TECSAR", "", "Jan-21-2008", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(31601, "OFEQ 7", "", "Jun-10-2007", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(29079, "EROS B", "", "Apr-25-2006", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(28132, "AMOS 2", "", "Dec-27-2003", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(27434, "OFEQ 5", "", "May-28-2002", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(25397, "TECHSAT 1B", "", "Jul-10-1998", R.mipmap.ic_israel_foreground));
        ISRAEL_Sat_Obj.add(new Satellite(23723, "AMOS 5I (ASIASAT 2)", "", "Nov-28-1995", R.mipmap.ic_israel_foreground));
        return ISRAEL_Sat_Obj;
    }

    public List<Satellite> ITALY_Satellite_List() {
        ITALY_Sat_Obj = new ArrayList<>();
        ITALY_Sat_Obj.add(new Satellite(42900, "OPTSAT 3000", "", "Aug-2-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(42794, "DSAT", "", "Jun-23-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(42778, "MAX VALIER SAT", "", "Jun-23-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(42776, "URSA MAIOR", "", "Jun-23-2017", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(41459, "E-ST@R-II", "", "Apr-25-2016", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(40012, "UNISAT 6", "", "Jun-19-2014", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(39421, "UNISAT 5", "", "Nov-21-2013", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(38078, "ALMASAT-1", "", "Feb-13-2012", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(38077, "LARES", "", "Feb-13-2012", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(37788, "EDUSAT", "", "Aug-17-2011", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(37216, "SKYMED 4", "", "Nov-6-2010", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(34810, "SICRAL 1B", "", "Apr-20-2009", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(33412, "SKYMED 3", "", "Oct-25-2008", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(32376, "SKYMED 2", "", "Dec-9-2007", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(31598, "SKYMED 1", "", "Jun-8-2007", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(31135, "AGILE", "", "Apr-23-2007", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(28373, "UNISAT 3", "", "Jun-29-2004", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(27608, "UNISAT 2", "", "Dec-20-2002", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(26694, "SICRAL 1", "", "Feb-7-2001", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(26547, "UNISAT", "", "Sep-26-2000", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(26546, "MEGSAT 1", "", "Sep-26-2000", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(24208, "ITALSAT 2", "", "Aug-8-1996", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(22828, "KITSAT 2", "", "Sep-26-1993", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(22783, "TEMISAT", "", "Aug-31-1993", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(22195, "LAGEOS 2", "", "Oct-22-1992", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(21055, "ITALSAT 1", "", "Jan-15-1991", R.mipmap.ic_italy_foreground));
        ITALY_Sat_Obj.add(new Satellite(10294, "SIRIO", "", "Aug-25-1977", R.mipmap.ic_italy_foreground));
        return ITALY_Sat_Obj;
    }

    public List<Satellite> JAPAN_Satellite_List() {
        JAPAN_Sat_Obj = new ArrayList<>();
        JAPAN_Sat_Obj.add(new Satellite(43495, "IGS R-6", "", "Jun-12-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(43223, "IGS O-6", "", "Feb-27-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(43201, "TRICOM-1R (TASUKI)", "", "Feb-3-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(43152, "ASNARO-2", "", "Jan-17-2018", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(43066, "SLATS", "", "Dec-23-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(43065, "GCOM-C", "", "Dec-23-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42965, "QZS-4(MICHIBIKI-4)", "", "Oct-9-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42951, "BSAT-4A", "", "Sep-29-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42917, "QZS-3(MICHIBIKI-3)", "", "Aug-19-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42835, "WNISAT 1R", "", "Jul-14-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42820, "BIRD JJ", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42769, "CE-SAT 1", "", "Jun-23-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42738, "QZS-2 (MICHIBIKI-2)", "", "Jun-1-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(42072, "IGS RADAR-5", "", "Mar-7-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41940, "DSN-2", "", "Jan-24-2017", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41935, "AOBA-VELOX 3", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41933, "WASEDA-SAT3", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41932, "ITF-2", "", "Nov-20-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41903, "JCSAT 15", "", "Dec-21-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41896, "ARASE (ERG)", "", "Dec-20-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41836, "HIMAWARI 9", "", "Nov-2-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41729, "JCSAT 16", "", "Aug-14-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41471, "JCSAT-14", "", "May-6-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41340, "HORYU 4", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41339, "CHUBUSAT 3", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41338, "CHUBUSAT 2", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(41337, "ASTRO H", "", "Feb-17-2016", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40538, "IGS OPTICAL 5", "", "Mar-26-2015", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40381, "IGS 9A", "", "Feb-1-2015", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40322, "PROCYON", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40321, "DESPATCH(ARTSAT 2,FO-81)", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40320, "SHIN EN 2", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40319, "HAYABUSA 2", "", "Dec-3-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40302, "TSUBAME", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40301, "QSAT-EOS", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40300, "CHUBUSAT-1", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40299, "HODOYOSHI-1", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40298, "ASNARO", "", "Nov-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40267, "HIMAWARI 8", "", "Oct-6-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40015, "HODOYOSHI 3", "", "Jun-19-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(40011, "HODOYOSHI 4", "", "Jun-19-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39770, "SPROUT", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39769, "RISING 2", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39768, "SOCRATES", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39767, "UNIFORM 1", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39766, "ALOS 2", "", "May-24-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39574, "GPM", "", "Feb-27-2014", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39423, "WNISAT 1", "", "Nov-21-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39253, "SPRINT-A (HISAKI)", "", "Sep-14-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39062, "IGS 8B (DEMO)", "", "Jan-27-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(39061, "IGS 8A", "", "Jan-27-2013", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(38756, "PROITERES", "", "Sep-9-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(38340, "HORYU 2", "", "May-17-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(38339, "SDS-4", "", "May-17-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(38337, "GCOM W1", "", "May-17-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(38331, "JCSAT 13", "", "May-15-2012", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(37954, "IGS 7A", "", "Dec-12-2011", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(37813, "IGS 6A", "", "Sep-23-2011", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(37776, "BSAT-3C", "", "Aug-6-2011", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(37207, "BSAT-3B", "", "Oct-28-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(37158, "QZS-1 (MICHIBIKI)", "", "Sep-11-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(36588, "SERVIS 2", "", "Jun-2-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(36578, "UNITEC-1", "", "May-20-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(36577, "IKAROS", "", "May-20-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(36576, "AKATSUKI (PLANET-C)", "", "May-20-2010", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(36104, "IGS 5A", "", "Nov-28-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(35755, "JCSAT 12", "", "Aug-21-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33499, "KKS-1 (KISEKI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33498, "STARS (KUKAI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33497, "SDS-1", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33496, "SOHLA-1 (MAIDO-1)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33495, "KAGAYAKI", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33494, "SPRITE-SAT (RISING)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33493, "PRISM (HITOMI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33492, "GOSAT (IBUKI)", "", "Jan-23-2009", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(33274, "SUPERBIRD 7", "", "Aug-14-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(32791, "SEEDS", "", "Apr-28-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(32785, "CUTE-1.7+APD II", "", "Apr-28-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(32500, "WINDS (KIZUNA)", "", "Feb-23-2008", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(32019, "BSAT-3A", "", "Aug-14-2007", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(29656, "ETS 8", "", "Dec-18-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(29479, "HINODE (SOLAR B)", "", "Sep-22-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(29272, "JCSAT 10", "", "Aug-11-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(29045, "JCSAT 9", "", "Apr-12-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28939, "ASTRO F (AKARI)", "", "Feb-21-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28937, "MTSAT-2", "", "Feb-18-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28931, "ALOS", "", "Jan-24-2006", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28895, "CUBESAT XI-V", "", "Oct-27-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28810, "INDEX", "", "Aug-23-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28809, "OICETS", "", "Aug-23-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28773, "ASTRO E2", "", "Jul-10-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28622, "MTSAT-1R", "", "Feb-26-2005", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28455, "RITE TARGET 2", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28454, "RITE TARGET 1", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28218, "SUPERBIRD 6", "", "Apr-16-2004", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28184, "MBSAT", "", "Mar-13-2004", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(28060, "SERVIS 1", "", "Oct-30-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27848, "CUBESAT XI-IV", "", "Jun-30-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27844, "CUTE-1", "", "Jun-30-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27830, "BSAT-2C", "", "Jun-11-2003", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27600, "MICRO LABSAT", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27599, "WEOS", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27597, "ADEOS 2", "", "Dec-14-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27516, "DRTS", "", "Sep-10-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27461, "NSTAR C", "", "Jul-5-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27399, "JCSAT 8", "", "Mar-29-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27368, "DASH/VEP 3", "", "Feb-4-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(27367, "MDS 1", "", "Feb-4-2002", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(26898, "LRE", "", "Aug-29-2001", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(26720, "BSAT-2A", "", "Mar-8-2001", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(26559, "NSAT 110", "", "Oct-6-2000", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(26095, "SUPERBIRD 4", "", "Feb-18-2000", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(25630, "JCSAT 6", "", "Feb-16-1999", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(25424, "ETS 7 TARGET", "", "Nov-27-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(25383, "NOZOMI (PLANET-B)", "", "Jul-3-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(25312, "BSAT-1B", "", "Apr-28-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(25175, "COMETS", "", "Feb-21-1998", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(25067, "JCSAT 5", "", "Dec-2-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(24880, "SUPERBIRD C", "", "Jul-28-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(24769, "BSAT-1A", "", "Apr-16-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(24720, "HALCA (MUSES B)", "", "Feb-12-1997", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(24278, "JAS 2 (FO-29)", "", "Aug-17-1996", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(24277, "ADEOS", "", "Aug-17-1996", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(23781, "NSTAR B", "", "Feb-5-1996", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(23651, "NSTAR A", "", "Aug-29-1995", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(23649, "JCSAT 3", "", "Aug-29-1995", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(23522, "HIMAWARI 5 (GMS 5)", "", "Mar-18-1995", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(23230, "ETS 6", "", "Aug-28-1994", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(23176, "BS-3N", "", "Jul-8-1994", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(22979, "VEP", "", "Feb-3-1994", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(22253, "SUPERBIRD A1", "", "Dec-1-1992", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(22049, "GEOTAIL", "", "Jul-24-1992", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(21893, "SUPERBIRD B1", "", "Feb-26-1992", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(21668, "BS-3B (YURI 3B)", "", "Aug-25-1991", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20771, "BS-3A (YURI 3A)", "", "Aug-28-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20618, "HAGOROMO", "", "Jan-24-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20480, "JAS 1B (FUJI 2)", "", "Feb-7-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20479, "DEBUT (ORIZURU)", "", "Feb-7-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20478, "MOS 1B (MOMO 1B)", "", "Feb-7-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20402, "JCSAT 2", "", "Jan-1-1990", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20217, "HIMAWARI 4 (GMS 4)", "", "Sep-5-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(20040, "SUPERBIRD A", "", "Jun-5-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(19874, "JCSAT 1", "", "Mar-6-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(19822, "EXOS D (AKEBONO)", "", "Feb-21-1989", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(19508, "CS 3B", "", "Sep-16-1988", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(18877, "CS 3A", "", "Feb-19-1988", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(18316, "KIKU 5 (ETS 5)", "", "Aug-27-1987", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(17527, "MOS 1A (MOMO 1)", "", "Feb-19-1987", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(16909, "JAS 1 (FUJI 1)", "", "Aug-12-1986", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(16908, "EGS (AJISAI)", "", "Aug-12-1986", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(16597, "BS-2B (YURI 2B)", "", "Feb-12-1986", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(15967, "SUISEI", "", "Aug-18-1985", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(15464, "SAKIGAKE", "", "Jan-7-1985", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(15152, "HIMAWARI 3 (GMS 3)", "", "Aug-2-1984", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(14659, "YURI 2A (BS-2A)", "", "Jan-23-1984", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(14248, "SAKURA 2B (CS-2B)", "", "Aug-5-1983", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(13782, "SAKURA 2A (CS-2A)", "", "Feb-4-1983", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(13492, "KIKU 4 (ETS 3)", "", "Sep-3-1982", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(12677, "HIMAWARI 2 (GMS 2)", "", "Aug-10-1981", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(12295, "KIKU 3 (ETS 4)", "", "Feb-11-1981", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(11715, "AYAME 2 (ECS-2)", "", "Feb-22-1980", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(11261, "AYAME 1 (ECS 1)", "", "Feb-6-1979", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(10792, "YURI (BSE)", "", "Apr-7-1978", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(10674, "UME 2 (ISS-B)", "", "Feb-16-1978", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(10664, "KYOKKO 1 (EXOS A)", "", "Feb-4-1978", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(10516, "SAKURA 1A (CS-1A)", "", "Dec-15-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(10143, "HIMAWARI 1 (GMS 1)", "", "Jul-14-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(9852, "KIKU 2 (ETS 2)", "", "Feb-23-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(9841, "TANSEI 3 (MS-T3)", "", "Feb-19-1977", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(8709, "UME 1 (ISS 1)", "", "Feb-29-1976", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(8197, "KIKU 1 (ETS 1)", "", "Sep-9-1975", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(5485, "SHINSEI (MS-F2)", "", "Sep-28-1971", R.mipmap.ic_japan_foreground));
        JAPAN_Sat_Obj.add(new Satellite(4952, "TANSEI 1 (MS-T1)", "", "Feb-16-1971", R.mipmap.ic_japan_foreground));
        return JAPAN_Sat_Obj;
    }

    public List<Satellite> KAZAKHSTAN_Satellite_List() {
        KAZAKHSTAN_Sat_Obj = new ArrayList<>();
        KAZAKHSTAN_Sat_Obj.add(new Satellite(42016, "AL-FARABI 1", "", "Feb-15-2017", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite(40010, "KAZEOSAT 2", "", "Jun-19-2014", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite(39731, "KAZEOSAT 1", "", "Apr-30-2014", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite(39728, "KAZSAT 3", "", "Apr-28-2014", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite(37749, "KAZSAT 2", "", "Jul-15-2011", R.mipmap.ic_kazakhstan_foreground));
        KAZAKHSTAN_Sat_Obj.add(new Satellite(29230, "KAZSAT 1", "", "Jun-17-2006", R.mipmap.ic_kazakhstan_foreground));
        return KAZAKHSTAN_Sat_Obj;
    }

    public List<Satellite> KENIA_Satellite_List() {
        KENIA_Sat_Obj = new ArrayList<>();
        KENIA_Sat_Obj.add(new Satellite(43467, "1KUNS-PE", "Earth Observation", "Nov-30-1998", R.mipmap.ic_kenya_foreground));
        return KENIA_Sat_Obj;
    }

    public List<Satellite> LAOS_Satellite_List() {
        LAOS_Sat_Obj = new ArrayList<>();
        LAOS_Sat_Obj.add(new Satellite(41034, "LAOSAT 1", "", "Nov-20-2015", R.mipmap.ic_laos_foreground));
        return LAOS_Sat_Obj;
    }

    public List<Satellite> LATVIA_Satellite_List() {
        LATVIA_Sat_Obj = new ArrayList<>();
        LATVIA_Sat_Obj.add(new Satellite(42791, "VENTA 1", "Education", "June-23-2017", R.mipmap.ic_latvia_foreground));
        return LATVIA_Sat_Obj;
    }

    public List<Satellite> LITHUANIA_Satellite_List() {
        LITHUANIA_Sat_Obj = new ArrayList<>();
        LITHUANIA_Sat_Obj.add(new Satellite(42768, "LITUANICASAT 2", "Education", "Jun-23-2017", R.mipmap.ic_lithuania_foreground));
        return LITHUANIA_Sat_Obj;
    }

    public List<Satellite> LUXEMBOURG_Satellite_List() {
        LUXEMBOURG_Sat_Obj = new ArrayList<>();
        LUXEMBOURG_Sat_Obj.add(new Satellite(37840, "VESSELSAT 1", "", "Oct-12-2011", R.mipmap.ic_luxembourg_foreground));
        LUXEMBOURG_Sat_Obj.add(new Satellite(23331, "ASTRA 1D", "", "Nov-1-1994", R.mipmap.ic_luxembourg_foreground));
        LUXEMBOURG_Sat_Obj.add(new Satellite(21139, "ASTRA 1B", "", "Mar-2-1991", R.mipmap.ic_luxembourg_foreground));
        LUXEMBOURG_Sat_Obj.add(new Satellite(19688, "ASTRA 1A", "", "Dec-11-1988", R.mipmap.ic_luxembourg_foreground));
        return LUXEMBOURG_Sat_Obj;
    }

    public List<Satellite> MALAYSIA_Satellite_List() {
        MALAYSIA_Sat_Obj = new ArrayList<>();
        MALAYSIA_Sat_Obj.add(new Satellite(40147, "MEASAT 3B", "", "Sep-11-2014", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite(35578, "RAZAKSAT", "", "Jul-14-2009", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite(35362, "MEASAT 3A", "", "Jun-21-2009", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite(29648, "MEASAT 3", "", "Dec-11-2006", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite(26548, "TIUNGSAT 1", "", "Sep-26-2000", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite(24653, "MEASAT 2", "", "Nov-13-1996", R.mipmap.ic_malaysia_foreground));
        MALAYSIA_Sat_Obj.add(new Satellite(23765, "AFRICASAT 1 (MEASAT 1)", "", "Jan-12-1996", R.mipmap.ic_malaysia_foreground));
        return MALAYSIA_Sat_Obj;
    }

    public List<Satellite> MEXICO_Satellite_List() {
        MEXICO_Sat_Obj = new ArrayList<>();
        MEXICO_Sat_Obj.add(new Satellite(40946, "MORELOS 3", "", "Oct-2-2015", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(40664, "SKY MEXICO-1", "", "May-27-2015", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(39122, "SATMEX 8", "", "Mar-26-2013", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(39035, "MEXSAT 3", "", "Dec-19-2012", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(37826, "QUETZSAT 1", "", "Sep-29-2011", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(29162, "SATMEX 6", "", "May-27-2006", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(25558, "SATMEX 5", "", "Dec-6-1998", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(24305, "UNAMSAT", "", "Sep-5-1996", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(23313, "SOLIDARIDAD 2", "", "Oct-8-1994", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(22911, "SOLIDARIDAD 1", "", "Nov-20-1993", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(16274, "MORELOS 2", "", "Nov-27-1985", R.mipmap.ic_mexico_foreground));
        MEXICO_Sat_Obj.add(new Satellite(15824, "MORELOS 1", "", "Jun-17-1985", R.mipmap.ic_mexico_foreground));
        return MEXICO_Sat_Obj;
    }

    public List<Satellite> MOROCCO_Satellite_List() {
        MOROCCO_Sat_Obj = new ArrayList<>();
        MOROCCO_Sat_Obj.add(new Satellite(43005, "MOHAMMED VI-A", "Monitoring", "Nov-8-2017", R.mipmap.ic_morocco_foreground));
        return MOROCCO_Sat_Obj;
    }

    public List<Satellite> NETHERLANDS_Satellite_List() {
        NETHERLANDS_Sat_Obj = new ArrayList<>();
        NETHERLANDS_Sat_Obj.add(new Satellite(42015, "PEASSS", "", "Feb-15-2017", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite(39428, "DELFI-N3XT", "", "Nov-21-2013", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite(32789, "DELFI C3", "", "Apr-28-2008", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite(24957, "NSS 5(INTELSAT 803)", "", "Sep-23-1997", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite(21989, "NSS K(INTELSAT K)", "", "Jun-10-1992", R.mipmap.ic_netherlands_foreground));
        NETHERLANDS_Sat_Obj.add(new Satellite(19121, "NSS 513(INTELSAT 513)", "", "May-17-1988", R.mipmap.ic_netherlands_foreground));
        return NETHERLANDS_Sat_Obj;
    }

    public List<Satellite> NIGERIA_Satellite_List() {
        NIGERIA_Sat_Obj = new ArrayList<>();
        NIGERIA_Sat_Obj.add(new Satellite(42824, "BIRD NN", "", "Nov-20-1998", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite(38014, "NIGCOMSAT 1R", "", "Dec-19-2011", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite(37790, "NIGERIASAT X", "", "Aug-17-2011", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite(37789, "NIGERIASAT 2", "", "Aug-17-2011", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite(31395, "NIGCOMSAT 1", "", "May-13-2007", R.mipmap.ic_nigeria_foreground));
        NIGERIA_Sat_Obj.add(new Satellite(27941, "NIGERIASAT 1", "", "Sep-27-2003", R.mipmap.ic_nigeria_foreground));
        return NIGERIA_Sat_Obj;
    }

    public List<Satellite> NORTH_KOREA_Satellite_List() {
        NORTH_KOREA_Sat_Obj = new ArrayList<>();
        NORTH_KOREA_Sat_Obj.add(new Satellite(41332, "KMS-4", "Earth Observation", "Feb-7-2016", R.mipmap.ic_north_korea_foreground));
        NORTH_KOREA_Sat_Obj.add(new Satellite(39026, "KMS 3-2", "Earth Observation", "Dec-12-2012", R.mipmap.ic_north_korea_foreground));
        return NORTH_KOREA_Sat_Obj;
    }

    public List<Satellite> NORWAY_Satellite_List() {
        NORWAY_Sat_Obj = new ArrayList<>();
        NORWAY_Sat_Obj.add(new Satellite(40613, "THOR 7", "", "Ap-26-2015", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(40075, "AISSAT 2", "", "Jul-8-2014", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(39445, "HINCUBE", "", "Nov-21-2013", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(36797, "AISSAT 1", "", "Jul-12-2010", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(36033, "THOR 6", "", "Oct-29-2009", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(32487, "THOR 5", "", "Feb-11-2008", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(25358, "THOR 3", "", "Jun-10-1998", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(24808, "THOR 2A", "", "May-20-1997", R.mipmap.ic_norway_foreground));
        NORWAY_Sat_Obj.add(new Satellite(20762, "THOR 1(MARCOPOLO 2)", "Aug-18-1990", "", R.mipmap.ic_norway_foreground));
        return NORWAY_Sat_Obj;
    }

    public List<Satellite> PAKISTAN_Satellite_List() {
        PAKISTAN_Sat_Obj = new ArrayList<>();
        PAKISTAN_Sat_Obj.add(new Satellite(39432, "ICUBE 1", "", "Nov-21-2013", R.mipmap.ic_pakistan_foreground));
        PAKISTAN_Sat_Obj.add(new Satellite(37779, "PAKSAT 1R", "", "Aug-11-2011", R.mipmap.ic_pakistan_foreground));
        PAKISTAN_Sat_Obj.add(new Satellite(27003, "BADR B", "", "Dec-10-2001", R.mipmap.ic_pakistan_foreground));
        PAKISTAN_Sat_Obj.add(new Satellite(23779, "PAKSAT 1(ANATOLIA 1)", "", "Feb-1-1996", R.mipmap.ic_pakistan_foreground));
        return PAKISTAN_Sat_Obj;
    }

    public List<Satellite> PERU_Satellite_List() {
        PERU_Sat_Obj = new ArrayList<>();
        PERU_Sat_Obj.add(new Satellite(41770, "PERUSAT 1", "Earth Observation", "Sep-16-2016", R.mipmap.ic_peru_foreground));
        PERU_Sat_Obj.add(new Satellite(39442, "PUCP-SAT 1", "Research", "Nov-21-2013", R.mipmap.ic_peru_foreground));
        return PERU_Sat_Obj;
    }

    public List<Satellite> PHILIPPINES_Satellite_List() {
        PHILIPPINES_Sat_Obj = new ArrayList<>();
        PHILIPPINES_Sat_Obj.add(new Satellite(41463, "DIWATA-1", "Earth Observation", "Nov-20-1998", R.mipmap.ic_philippines_foreground));
        PHILIPPINES_Sat_Obj.add(new Satellite(17706, "AGILA 1(PALAPA B2P)", "Communication", "Mar-20-1987", R.mipmap.ic_philippines_foreground));
        return PHILIPPINES_Sat_Obj;
    }

    public List<Satellite> POLAND_Satellite_List() {
        POLAND_Sat_Obj = new ArrayList<>();
        POLAND_Sat_Obj.add(new Satellite(40119, "BRITE-PL 2", "Astronomy", "Aug-19-2014", R.mipmap.ic_poland_foreground));
        POLAND_Sat_Obj.add(new Satellite(39431, "BRITE-PL", "", "Nov-21-2013", R.mipmap.ic_poland_foreground));
        return POLAND_Sat_Obj;
    }

    public List<Satellite> PORTUGAL_Satellite_List() {
        PORTUGAL_Sat_Obj = new ArrayList<>();
        PORTUGAL_Sat_Obj.add(new Satellite(22829, "POSAT 1", "GPS", "Sep-26-1993", R.mipmap.ic_portugal_foreground));
        PORTUGAL_Sat_Obj.add(new Satellite(22826, "ITAMSAT", "radio", "Sep-26-1993", R.mipmap.ic_portugal_foreground));
        return PORTUGAL_Sat_Obj;
    }

    public List<Satellite> RUSSIA_Satellite_List() {

        return RUSSIA_Sat_Obj;
    }

    public List<Satellite> SAUDI_ARABIA_Satellite_List() {
        SAUDI_ARABIA_Sat_Obj = new ArrayList<>();
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(40016, "SAUDISAT 4", "", "Jun-19-2014", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(31127, "SAUDICOMSAT 4", "", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(31125, "SAUDICOMSAT 3", "", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(31124, "SAUDICOMSAT 5", "", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(31121, "SAUDICOMSAT 6", "", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(31119, "SAUDICOMSAT 7", "", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(31118, "SAUDISAT 3", "", "Apr-17-2007", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(28371, "SAUDISAT 2", "", "Jun-29-2004", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(28370, "SAUDICOMSAT 2", "", "Jun-29-2004", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(28369, "SAUDICOMSAT 1", "", "Jun-29-2004", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(27607, "SAUDISAT 1C", "", "Dec-20-2002", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(26549, "SAUDISAT 1B", "", "Sep-26-2000", R.mipmap.ic_saudi_arabia_foreground));
        SAUDI_ARABIA_Sat_Obj.add(new Satellite(26545, "SAUDISAT 1A", "", "Sep-26-2000", R.mipmap.ic_saudi_arabia_foreground));
        return SAUDI_ARABIA_Sat_Obj;
    }

    public List<Satellite> SINGAPORE_Satellite_List() {
        SINGAPORE_Sat_Obj = new ArrayList<>();
        SINGAPORE_Sat_Obj.add(new Satellite(41171, "VELOX 2", "", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(41170, "GALASSIA", "", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(41169, "TELEOS 1", "", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(41168, "ATHENOXAT-1", "", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(41167, "KENT RIDGE 1", "", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(41166, "VELOX C1", "", "Dec-16-2015", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(40057, "VELOX 1", "", "Jun-30-2014", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(40028, "POPSAT HIP 1", "", "Jun-19-2014", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(39438, "VELOX-P 2", "", "Nov-21-2013", R.mipmap.ic_singapore_foreground));
        SINGAPORE_Sat_Obj.add(new Satellite(37389, "XSAT", "", "Apr-20-2011", R.mipmap.ic_singapore_foreground));
        return SINGAPORE_Sat_Obj;
    }

    public List<Satellite> SLOVAKIA_Satellite_List() {
        SLOVAKIA_Sat_Obj = new ArrayList<>();
        SLOVAKIA_Sat_Obj.add(new Satellite(42789, "SKCUBE", "Education ", "Jun-23-2017", R.mipmap.ic_slovakia_foreground));
        return SLOVAKIA_Sat_Obj;
    }

    public List<Satellite> SOUTH_AFRICA_Satellite_List() {
        SOUTH_AFRICA_Sat_Obj = new ArrayList<>();
        SOUTH_AFRICA_Sat_Obj.add(new Satellite(42726, "NSIGHT-1", "", "Nov-20-1998", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite(42713, "ZA-AEROSAT", "", "Nov-20-1998", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite(40353, "KONDOR E", "", "Dec-19-2014", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite(39417, "ZACUBE", "", "Nov-21-2013", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite(35870, "SUMBANDILA", "", "Sep-17-2009", R.mipmap.ic_south_africa_foreground));
        SOUTH_AFRICA_Sat_Obj.add(new Satellite(25636, "SUNSAT", "", "Feb-23-1999", R.mipmap.ic_south_africa_foreground));
        return SOUTH_AFRICA_Sat_Obj;
    }

    public List<Satellite> SOUTH_KOREA_Satellite_List() {
        SOUTH_KOREA_Sat_Obj = new ArrayList<>();
        SOUTH_KOREA_Sat_Obj.add(new Satellite(43138, "STEP CUBE LAB", "", "Jan-12-2018", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(42984, "KOREASAT-5A", "", "Oct-30-2017", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(42733, "SNUSAT-1B", "", "Nov-20-1998", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(42727, "SNUSAT-1", "", "Nov-20-1998", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(42714, "LINK", "", "Nov-20-1998", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(42691, "KOREASAT 7", "", "May-4-2017", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(40536, "KOMPSAT 3A", "", "Mar-25-2015", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(39426, "CINEMA 3", "", "Nov-21-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(39422, "STSAT 3", "", "Nov-21-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(39227, "KOMPSAT 5", "", "Aug-22-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(39068, "STSAT 2C", "", "Jan-30-2013", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(38338, "KOMPSAT 3", "", "May-17-2012", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(37265, "KOREASAT 6", "", "Dec-29-2010", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(36744, "COMS 1", "", "Jun-26-2010", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(29349, "KOREASAT 5", "", "Aug-22-2006", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(29268, "KOMPSAT 2", "", "Jul-28-2006", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(27945, "KAISTSAT 4", "", "Sep-27-2003", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(26032, "KOMPSAT", "", "Dec-21-1999", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(25894, "ABS-7 (KOREASAT 3)", "", "Sep-4-1999", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(25756, "KITSAT 3", "", "May-26-1999", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(23768, "ABS-1A(KOREASAT 2)", "", "Jan-14-1996", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(23639, "KOREASAT 1", "", "Aug-5-1995", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(22825, "EYESAT-1", "", "Sept-26-1993", R.mipmap.ic_south_korea_foreground));
        SOUTH_KOREA_Sat_Obj.add(new Satellite(22077, "OSCAR 23 (KITSAT 1)", "", "Aug-10-1992", R.mipmap.ic_south_korea_foreground));
        return SOUTH_KOREA_Sat_Obj;
    }

    public List<Satellite> SPAIN_Satellite_List() {
        SPAIN_Sat_Obj = new ArrayList<>();
        SPAIN_Sat_Obj.add(new Satellite(43228, "HISPASAT 30W-6", "", "Mar-6-2018", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(43215, "PAZ", "", "Feb-22-2018", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(42934, "AMAZONAS 5", "", "Sep-11-2017", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(42728, "QBITO", "", "Nov-20-1998", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(41942, "HISPASAT 36W-1", "", "Jan-28-2017", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(41732, "3CAT-2", "", "Aug-15-2016", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(40013, "DEIMOS 2", "", "Jun-19-2014", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(39616, "AMAZONAS 4A", "", "Mar-22-2014", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(39433, "HUMSAT D", "", "Nov-21-2013", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(39420, "OPTOS", "", "Nov-21-2013", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(39078, "AMAZONAS 3", "", "Feb-7-2013", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(37264, "HISPASAT 1E", "", "Dec-29-2010", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(35942, "AMAZONAS 2", "", "Sep-30-2009", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(35685, "NANOSAT 1B", "", "Jul-29-2009", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(35681, "DEIMOS 1", "", "Jul-29-2009", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(28945, "SPAINSAT", "", "Mar-11-2006", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(28493, "NANOSAT(1)", "", "Dec-18-2004", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(28393, "AMAZONAS", "", "Aug-4-2004", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(27528, "HISPASAT 1D", "", "Sep-18-2002", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(26071, "HISPASAT 1C", "", "Feb-3-2000", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(23607, "UPM/LBSAT", "", "Jul-7-1995", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(22723, "HISPASAT 1B", "", "Jul-22-1993", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(22116, "HISPASAT 1A", "", "Sep-10-1992", R.mipmap.ic_spain_foreground));
        SPAIN_Sat_Obj.add(new Satellite(7531, "INTASAT", "", "Nov-15-1974", R.mipmap.ic_spain_foreground));
        return SPAIN_Sat_Obj;
    }

    public List<Satellite> SWEDEN_Satellite_List() {
        SWEDEN_Sat_Obj = new ArrayList<>();
        SWEDEN_Sat_Obj.add(new Satellite(42708, "QBEE50-LTU-OC", "", "Nov-20-1998", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(36827, "PRISMA(TANGO)", "", "Jun-15-2010", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(36599, "PRISMA(MANGO)", "", "Jun-15-2010", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(26702, "ODIN", "", "Feb-20-2001", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(26621, "MUNIN", "", "Nov-21-2000", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(25568, "ASTRID 2", "", "Dec-10-1998", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(25049, "SIRIUS 2(GE-1E)", "", "Nov-11-1997", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(23464, "ASTRID", "", "Jan-24-1995", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(22161, "FREJA", "", "Oct-6-1992", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(20193, "SIRIUS W(MARCOPOLO 1)", "", "Aug-27-1989", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(19919, "TELE-X", "", "Apr-2-1989", R.mipmap.ic_sweden_foreground));
        SWEDEN_Sat_Obj.add(new Satellite(16614, "VIKING", "", "Feb-22-1986", R.mipmap.ic_sweden_foreground));
        return SWEDEN_Sat_Obj;
    }

    public List<Satellite> TAIWAN_Satellite_List() {
        TAIWAN_Sat_Obj = new ArrayList<>();
        TAIWAN_Sat_Obj.add(new Satellite(42920, "FORMOSAT-5", "", "Aug-24-2017", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(40022, "PACE", "", "Jun-19-2014", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(29052, "FORMOSAT 3F", "", "Ap-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(29051, "FORMOSAT 3E", "", "Ap-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(29050, "FORMOSAT 3D", "", "Ap-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(29049, "FORMOSAT 3C", "", "Ap-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(29048, "FORMOSAT 3B", "", "Ap-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(29047, "FORMOSAT 3A", "", "Ap-15-2006", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(28254, "ROCSAT 2", "", "May-20-2004", R.mipmap.ic_taiwan_foreground));
        TAIWAN_Sat_Obj.add(new Satellite(25616, "ROCSAT 1", "", "Jan-27-1999", R.mipmap.ic_taiwan_foreground));
        return TAIWAN_Sat_Obj;
    }

    public List<Satellite> THAILAND_Satellite_List() {
        THAILAND_Sat_Obj = new ArrayList<>();
        THAILAND_Sat_Obj.add(new Satellite(41552, "THAICOM 8", "", "May-27-2016", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(39500, "THAICOM 6", "", "Jan-6-2014", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(33396, "THEOS", "", "Oct-1-2008", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(29163, "THAICOM 5", "", "May-27-2006", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(28786, "IPSTAR 1", "", "Aug-11-2005", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(25396, "TMSAT", "", "Jul-10-1998", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(24768, "THAICOM 3", "", "Apr-16-1997", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(23314, "THAICOM 2", "", "Oct-8-1994", R.mipmap.ic_thailand_foreground));
        THAILAND_Sat_Obj.add(new Satellite(22931, "THAICOM 1", "", "Dec-18-1993", R.mipmap.ic_thailand_foreground));
        return THAILAND_Sat_Obj;
    }

    public List<Satellite> TURKEY_Satellite_List() {
        TURKEY_Sat_Obj = new ArrayList<>();
        TURKEY_Sat_Obj.add(new Satellite(43466, "UBAKUSAT", "", "Nov-30-1998", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(42736, "BEEAGLESAT", "", "Nov-20-1998", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(42700, "HAVELSAT", "", "Nov-20-1998", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(41875, "GOKTURK-1A", "", "Dec-5-2016", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(40984, "TURKSAT 4B", "", "Oct-16-2015", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(39522, "TURKSAT 4A", "", "Feb-14-2014", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(39152, "TURKSAT 3U", "", "Apr-26-2013", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(39030, "GOKTURK 2", "", "Dec-18-2012", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(37791, "RASAT", "", "Aug-17-2011", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(35935, "ITUPSAT 1", "", "Sep-23-2009", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(33056, "TURKSAT 3A", "", "Jun-12-2008", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(27943, "BILSAT 1", "", "Sep-27-2003", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(26666, "TURKSAT 2A", "", "Jan-10-2001", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(23949, "TURKSAT 1C", "", "Jul-9-1996", R.mipmap.ic_turkey_foreground));
        TURKEY_Sat_Obj.add(new Satellite(23200, "TURKSAT 1B", "", "Aug-10-1994", R.mipmap.ic_turkey_foreground));
        return TURKEY_Sat_Obj;
    }

    public List<Satellite> UNITED_ARAB_EMIRATES_Satellite_List() {
        UNITED_ARAB_EMIRATES_Sat_Obj = new ArrayList<>();
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(43174, "AL YAH 3", "", "Jan-25-2018", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(42017, "NAYIF (EO-88)", "", "Feb-15-2017", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(39419, "DUBSAISAT 2", "", "Nov-21-2013", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(38245, "YAHSAT 1B", "", "Apr-23-2012", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(37393, "YAHSAT 1A", "", "Apr-22-2011", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(35682, "DUBAISAT 1", "", "Jul-29-2009", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(32404, "THURAYA 3", "", "Jan-15-2008", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(27825, "THURAYA 2", "", "Jun-10-2003", R.mipmap.ic_united_arab_emirates_foreground));
        UNITED_ARAB_EMIRATES_Sat_Obj.add(new Satellite(26578, "THURAYA 1", "", "Oct-21-2000", R.mipmap.ic_united_arab_emirates_foreground));
        return UNITED_ARAB_EMIRATES_Sat_Obj;
    }

    public List<Satellite> UNITED_KINGDOM_Satellite_List() {
        UNITED_KINGDOM_Sat_Obj = new ArrayList<>();
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(43510, "REMOVEDEBRIS", "", "Nov-20-1998", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(43115, "CARBONITE 2", "", "Jan-12-2018", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(42765, "UCLSAT", "", "Jun-23-2017", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40719, "DEORBITSAIL", "", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40718, "CARBONITE 1 (CBNT-1)", "", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40717, "DMC 3-FM3", "", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40716, "DMC 3-FM2", "", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40715, "DMC 3-FM1", "", "Jul-10-2015", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40076, "TDS 1", "", "Jul-8-2014", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(40074, "UKUBE 1", "", "Jul-8-2014", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(39444, "FUNCUBE 1 (AO-73)", "", "Nov-21-2013", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(39427, "TRITON 1", "", "Nov-21-2013", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(39090, "STRAND 1", "", "Feb-25-2013", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(39034, "SKYNET 5D", "", "Dec-19-2012", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(38741, "HYLAS 2", "", "Aug-2-2012", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(37237, "HYLAS 1", "", "Nov-26-2010", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(35683, "DMC 2", "", "Jul-29-2009", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(33055, "SKYNET 5C", "", "Jun-12-2008", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(32294, "SKYNET 5B", "", "Nov-14-2007", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(30794, "SKYNET 5A", "", "Mar-11-2007", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(28891, "TOPSAT", "", "Oct-27-2005", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(27942, "UK-DMC", "", "Sep-27-2003", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(26695, "SKYNET 4F", "", "Feb-7-2001", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(26611, "STRV 1D", "", "Nov-16-2000", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(26610, "STRV 1C", "", "Nov-16-2000", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(26386, "SNAP 1", "", "Jun-28-2000", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(25693, "OSCAR 36 (UOSAT 12)", "", "Apr-21-1999", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(25639, "SKYNET 4E", "", "Feb-26-1999", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(25134, "SKYNET 4D", "", "Jan-10-1998", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(23126, "STRV 1B", "", "Jun-17-1994", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(23125, "STRV 1A", "", "Jun-17-1994", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(21575, "OSCAR 22 (UoSAT 5)", "", "Jun-17-1994", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(20776, "SKYNET 4C", "", "Aug-30-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(20438, "OSCAR 15 (UOSAT 4)", "", "Jan-22-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(20437, "OSCAR 14 (UOSAT 3)", "", "Jan-22-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(20401, "SKYNET 4A", "", "Jan-1-1990", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(19687, "SKYNET 4B", "", "Dec-11-1988", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(14781, "OSCAR 11 (UoSAT 2)", "", "Mar-1-1984", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(7547, "SKYNET 2B", "", "Nov-23-1974", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(7213, "MIRANDA (X-4)", "", "Mar-9-1974", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(5580, "PROSPERO (BLACK ARROW)", "", "Oct-28-1971", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(4493, "SKYNET 1B", "", "Aug-19-1970", R.mipmap.ic_united_kingdom_foreground));
        UNITED_KINGDOM_Sat_Obj.add(new Satellite(4250, "SKYNET 1", "", "Nov-22-1969", R.mipmap.ic_united_kingdom_foreground));
        return UNITED_KINGDOM_Sat_Obj;
    }

    public List<Satellite> USA_Satellite_List() {
        USA_Sat_Obj=new ArrayList<>();
        USA_Sat_Obj.add(new Satellite(43522,"DRAGON CRS-15","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43482,"IRIDIUM 162","","",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(43481,"IRIDIUM 110","","",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(43480,"IRIDIUM 147","","",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(43479,"IRIDIUM 152","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43478,"IRIDIUM 161","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43477,"GRACE-FO 2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43476,"GRACE-FO 1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43474,"CYGNUS OA-9","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43465,"USA 287","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43459,"MARCO-B","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43458,"MARCO-A","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43457,"INSIGHT","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43446,"USA 286","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43445,"USA 285","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43435,"TESS","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43340,"USA 284","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43339,"USA 283","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43258,"IRIDIUM 143","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43257,"IRIDIUM 150","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43256,"IRIDIUM 142","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43255,"IRIDIUM 148","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43254,"IRIDIUM 146","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43253,"IRIDIUM 145","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43252,"IRIDIUM 140","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43251,"IRIDIUM 157","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43250,"IRIDIUM 149","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43249,"IRIDIUM 144","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(43229,"PODSAT","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43226,"GOES 17","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43217,"TINTIN B","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43216,"TINTIN A","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43205,"TESLA ROADSTER/FALCON 9H","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43185,"LEMUR 2 THENICKMOLO","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43184,"LEMUR 2 KADI","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43183,"LEMUR 2 URAMCHANSOL","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43182,"LEMUR 2 JIN-LUEN","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43167,"LEMUR 2 TALLHAMN-ATC","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43165,"LEMUR 2 MARSHALL","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43163,"DOVE PIONEER","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43162,"SBIRS GEO 4 (USA 282)","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43145,"USA 281","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43144,"TYVAK-61C","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43143,"CICERO 7","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43142,"SPACEBEE-1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43141,"SPACEBEE-2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43140,"SPACEBEE-3","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43139,"SPACEBEE-4","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43137,"FOX-1D (AO-92)","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43131,"MICROMAS 2A","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43130,"ARKYD 6A","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43127,"DEMOSAT 2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43126,"LEMUR 2 DAVEWILSON","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43125,"LEMUR 2 BROWNCOW","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43124,"LEMUR 2 PETERWEBSTER","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43123,"LEMUR 2 MCCAFFERTY","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43122,"FLOCK 3PP 4","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43121,"FLOCK 3PP 1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43120,"FLOCK 3PP 2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43119,"FLOCK 3PP 3","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43118,"CORVUS BC3","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43113,"LEO 1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43098,"USA 280","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43079,"IRIDIUM 131","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43078,"IRIDIUM 153","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43077,"IRIDIUM 141","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43076,"IRIDIUM 137","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43075,"IRIDIUM 134","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43074,"IRIDIUM 151","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43073,"IRIDIUM 130","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43072,"IRIDIUM 116","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43071,"IRIDIUM 138","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43070,"IRIDIUM 135","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43054,"LEMUR 2 LIU-POU-CHUN","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43053,"LEMUR 2 DUNLOP","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43052,"FAUNA","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43051,"LEMUR 2 MCCULLAGH","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43050,"ISARA","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43049,"ASGARDIA 1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43048,"LEMUR 2 ROMACOSTE","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43047,"LEMUR 2 BRIANDAVIE","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43046,"LEMUR 2 KEVIN","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43045,"LEMUR 2 YONGLIN","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43044,"CHEFSAT","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43043,"AEROCUBE 7C","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43042,"AEROCUBE 7B","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43041,"LEMUR 2 ROCKETJONAH","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43027,"OSIRIS-3U","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43021,"DELLINGR (RBLE)","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43020,"ASTERIA","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43019,"ECAMSAT","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43018,"EAGLESAT-1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43017,"FOX-1B (RADFXSAT AO-91)","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43016,"MAKERSAT-0","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43015,"MIRATA","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43014,"BUCCANEER RMM","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(43013,"NOAA 20 (JPSS 1)","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42998,"FLOCK 3M 2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42997,"FLOCK 3M 4","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42996,"FLOCK 3M 3","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42995,"FLOCK 3M 1","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42992,"SKYSAT C6","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42991,"SKYSAT C7","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42990,"SKYSAT C8","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42989,"SKYSAT C9","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42988,"SKYSAT C10","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42987,"SKYSAT C11","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42982,"KESTREL EYE 2M","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42964,"IRIDIUM 125","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42963,"IRIDIUM 139","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42962,"IRIDIUM 136","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42961,"IRIDIUM 132","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42960,"IRIDIUM 107","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42959,"IRIDIUM 119","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42958,"IRIDIUM 129","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42957,"IRIDIUM 122","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42956,"IRIDIUM 100","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42955,"IRIDIUM 133","","",R.mipmap.ic_iridium139_foreground));
        USA_Sat_Obj.add(new Satellite(42949,"USA 279","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42941,"USA 278","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42932,"OTV 5 (USA 277)","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42921,"ORS 5 SENSORSAT","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42915,"TDRS 13","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42914,"TNS 0-2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42913,"SFERA 2","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42897,"FLOCK 2K 06","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42896,"FLOCK 2K 09","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42895,"FLOCK 2K 10","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42894,"FLOCK 2K 11","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42893,"FLOCK 2K 12","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42892,"FLOCK 2K 14","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42891,"FLOCK 2K 13","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42890,"FLOCK 2K 15","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42889,"FLOCK 2K 16","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42888,"FLOCK 2K 17","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42887,"FLOCK 2K 18","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42886,"FLOCK 2K 19","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42885,"FLOCK 2K 20","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42884,"FLOCK 2K 25","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42883,"FLOCK 2K 26","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42882,"FLOCK 2K 27","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42881,"LEMUR 2 ARTFISCHER","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42879,"FLOCK 2K 33","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42878,"FLOCK 2K 34","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42877,"FLOCK 2K 35","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42876,"FLOCK 2K 36","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42875,"FLOCK 2K 41","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42874,"FLOCK 2K 43","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42873,"FLOCK 2K 44","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42872,"FLOCK 2K 30","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42871,"FLOCK 2K 29","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42870,"FLOCK 2K 32","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42869,"FLOCK 2K 31","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42868,"FLOCK 2K 38","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42867,"FLOCK 2K 37","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42866,"FLOCK 2K 39","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42865,"FLOCK 2K 40","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42864,"FLOCK 2K 05","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42863,"FLOCK 2K 08","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42862,"FLOCK 2K 07","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42861,"FLOCK 2K 22","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42860,"FLOCK 2K 21","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42859,"FLOCK 2K 23","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42858,"FLOCK 2K 46","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42857,"FLOCK 2K 24","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42856,"FLOCK 2K 45","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42855,"FLOCK 2K 48","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42854,"FLOCK 2K 47","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42853,"FLOCK 2K 02","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42852,"FLOCK 2K 01","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42851,"FLOCK 2K 04","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42850,"FLOCK 2K 03","Earth Imaging","Jul-14-2017",R.mipmap.ic_flock_2k_01to48_foreground));
        USA_Sat_Obj.add(new Satellite(42847,"CORVUS BC1","Observation","Jul-14-2017",R.mipmap.ic_corvus_bc_foreground));
        USA_Sat_Obj.add(new Satellite(42846,"CORVUS BC2","Observation","Jul-14-2017",R.mipmap.ic_corvus_bc_foreground));
        USA_Sat_Obj.add(new Satellite(42845,"LEMUR 2 ZACHARY","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42844,"NANOACE","","Jul-14-2017",R.mipmap.ic_nanoace_foreground));
        USA_Sat_Obj.add(new Satellite(42842,"LEMUR 2 DEMBITZ","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42841,"LEMUR 2 PETERG","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42840,"LEMUR 2 FURIAUS","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42839,"LEMUR 2 MONSON","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42838,"LEMUR 2 ANDIS","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42837,"LEMUR 2 GREENBERG","Private","Jul-14-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42818,"INTELSAT 35E","","Jul-5-2017",R.mipmap.ic_intelsat35e_foreground));
        USA_Sat_Obj.add(new Satellite(42812,"IRIDIUM 121","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42811,"IRIDIUM 128","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42810,"IRIDIUM 124","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42809,"IRIDIUM 126","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42808,"IRIDIUM 117","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42807,"IRIDIUM 118","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42806,"IRIDIUM 115","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42805,"IRIDIUM 120","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42804,"IRIDIUM 123","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42803,"IRIDIUM 113","Communication","Jun-25-2017",R.mipmap.ic_iridium_foreground));
        USA_Sat_Obj.add(new Satellite(42795,"TYVAK 53B","","Jun-23-2017",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42793,"CICERO 6","","Jun-23-2017",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42782,"LEMUR 2 MCPEAKE","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42781,"LEMUR 2 SAM-AMELIA","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42780,"LEMUR 2 LISASAURUS","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42779,"LEMUR 2 LYNSEY-SYMO","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42774,"LEMUR 2 KUNGFOO","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42773,"LEMUR 2 LUCYBRYCE","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42772,"LEMUR 2 XUENITERENCE","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42771,"LEMUR 2 SHAINAJOHL","Commercial","Jun-23-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42755,"LEMUR 2 SPIROVISION","Commercial","Apr-18-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42754,"LEMUR 2 ROBMOORE","Commercial","Apr-18-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42753,"LEMUR 2 JENNYBARNA","Commercial","Apr-18-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42752,"LEMUR 2 ANGELA","Commercial","Apr-18-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42749,"ECHOSTAR 21","Communication","Jun-8-2017",R.mipmap.ic_echostar21_foreground));
        USA_Sat_Obj.add(new Satellite(42740,"VIASAT 2","Communication","Jun-1-2017",R.mipmap.ic_vrss2_foreground));
        USA_Sat_Obj.add(new Satellite(42723,"UNSW-ECO","","Nov-20-1998",R.mipmap.ic_unsw_eco_foreground));
        USA_Sat_Obj.add(new Satellite(42715,"CSUNSAT1","","Nov-20-1998",R.mipmap.ic_csunsat_1_foreground));
        USA_Sat_Obj.add(new Satellite(42712,"SHARC","","Nov-20-1998",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42711,"ALTAIR PATHFINDER","","Nov-20-1998",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42705,"ICECUBE","","Nov-20-1998",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42704,"CXBN-2","","Nov-20-1998",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42689,"USA 276","","May-1-2017",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42075,"WGS 9 (USA 275)","","Mar-19-2017",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42070,"ECHOSTAR 23","","Mar-16-2017",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(42069,"LEMUR 2 TRUTNAHD","Commercial","Nov-20-1998",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42068,"LEMUR 2 AUSTINTACIOUS","Commercial","Nov-20-1998",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42059,"LEMUR 2 REDFERN-GOES","Commercial","Nov-20-1998",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42058,"USA 274","","",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(42051,"FLOCK 3P 72","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42050,"FLOCK 3P 83","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42049,"FLOCK 3P 31","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42048,"FLOCK 3P 74","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42047,"FLOCK 3P 78","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42046,"FLOCK 3P 82","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42045,"FLOCK 3P 29","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42044,"FLOCK 3P 87","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42043,"FLOCK 3P 81","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42042,"FLOCK 3P 56","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42041,"FLOCK 3P 55","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42040,"FLOCK 3P 13","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42039,"FLOCK 3P 15","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42038,"FLOCK 3P 39","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42037,"FLOCK 3P 38","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42036,"FLOCK 3P 62","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42035,"FLOCK 3P 63","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42034,"FLOCK 3P 64","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42033,"FLOCK 3P 44","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42032,"FLOCK 3P 47","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42031,"FLOCK 3P 46","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42030,"FLOCK 3P 52","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42029,"FLOCK 3P 50","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42028,"FLOCK 3P 65","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42027,"FLOCK 3P 66","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42026,"FLOCK 3P 80","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42025,"FLOCK 3P 77","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42024,"FLOCK 3P 71","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42023,"FLOCK 3P 32","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42022,"FLOCK 3P 59","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42021,"FLOCK 3P 84","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42020,"FLOCK 3P 69","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42019,"FLOCK 3P 76","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42018,"FLOCK 3P 23","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42014,"FLOCK 3P 54","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42013,"FLOCK 3P 53","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42012,"FLOCK 3P 14","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42011,"FLOCK 3P 16","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42010,"FLOCK 3P 40","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42009,"FLOCK 3P 61","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42008,"FLOCK 3P 42","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42007,"FLOCK 3P 43","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42006,"FLOCK 3P 48","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42005,"FLOCK 3P 45","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42004,"FLOCK 3P 41","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42003,"FLOCK 3P 68","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42002,"FLOCK 3P 67","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(42001,"FLOCK 3P 49","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41998,"LEMUR 2 TACHIKOMA","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41997,"LEMUR 2 JOBANPUTRA","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41996,"LEMUR 2 NOGUECORREIG","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41995,"LEMUR 2 RDEATON","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41994,"LEMUR 2 SPIRE-MINIONS","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41993,"LEMUR 2 SMITA-SHARAD","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41992,"LEMUR 2 MIA-GRACE","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41991,"LEMUR 2 SATCHMO","Commercial","Feb-15-2017",R.mipmap.ic_lemur_foreground));
        USA_Sat_Obj.add(new Satellite(41990,"FLOCK 3P 33","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41989,"FLOCK 3P 35","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41988,"FLOCK 3P 34","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41987,"FLOCK 3P 30","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41986,"FLOCK 3P 36","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41985,"FLOCK 3P 86","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41984,"FLOCK 3P 79","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41983,"FLOCK 3P 85","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41982,"FLOCK 3P 88","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41981,"FLOCK 3P 73","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41980,"FLOCK 3P 70","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41979,"FLOCK 3P 75","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41978,"FLOCK 3P 57","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41977,"FLOCK 3P 58","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41976,"FLOCK 3P 60","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41975,"FLOCK 3P 11","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41974,"FLOCK 3P 10","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41973,"FLOCK 3P 9","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41972,"FLOCK 3P 12","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41971,"FLOCK 3P 5","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41970,"FLOCK 3P 7","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41969,"FLOCK 3P 6","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41968,"FLOCK 3P 3","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41967,"FLOCK 3P 1","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41966,"FLOCK 3P 2","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41965,"FLOCK 3P 4","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41964,"FLOCK 3P 25","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41963,"FLOCK 3P 27","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41962,"FLOCK 3P 17","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41961,"FLOCK 3P 26","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41960,"FLOCK 3P 28","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41959,"FLOCK 3P 21","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41958,"FLOCK 3P 22","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41957,"FLOCK 3P 18","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41956,"FLOCK 3P 24","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41955,"FLOCK 3P 19","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41953,"FLOCK 3P 37","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41952,"FLOCK 3P 51","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41951,"FLOCK 3P 8","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41950,"FLOCK 3P 20","Earth Imagery","Feb-15-2017",R.mipmap.ic_flock3p_foreground));
        USA_Sat_Obj.add(new Satellite(41937,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41926,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41925,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41924,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41923,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41922,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41921,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41920,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41919,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41918,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41917,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41893,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41891,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41890,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41889,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41888,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41887,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41886,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41885,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41884,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41879,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41866,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41855,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41854,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41853,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41852,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41851,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41850,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41849,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41848,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41787,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41782,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41774,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41773,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41772,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41771,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41769,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41764,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41762,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41745,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41744,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41724,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41622,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41618,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41617,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41616,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41615,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41614,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41613,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41612,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41611,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41610,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41609,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41608,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41601,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41592,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41584,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41564,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41380,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41334,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41328,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41240,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41189,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41188,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41187,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41186,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41185,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41184,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41183,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41182,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41181,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41180,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41179,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(41019,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40977,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40976,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40975,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40974,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40973,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40972,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40971,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40970,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40969,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40968,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40967,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40966,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40965,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40964,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40935,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40934,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40933,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40932,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40887,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40746,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40730,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40663,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40660,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40659,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40658,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40657,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40656,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40655,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40654,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40653,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40652,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40534,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40485,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40484,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40483,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40482,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40390,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40380,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40379,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40378,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40377,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40376,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40374,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40344,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40333,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40294,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40208,"","","",R.mipmap.ic_united_states_of_america_foreground));
        USA_Sat_Obj.add(new Satellite(40115,"","","",R.mipmap.ic_united_states_of_america_foreground));
        return USA_Sat_Obj;
    }

    public List<Satellite> URUGUAY_Satellite_List() {
        URUGUAY_Sat_Obj = new ArrayList<>();
        URUGUAY_Sat_Obj.add(new Satellite(40034, "ANTELSAT", "Communication", "Jun-19-2014", R.mipmap.ic_uruguay_foreground));
        return URUGUAY_Sat_Obj;
    }

    public List<Satellite> VENEZUELA_Satellite_List() {
        VENEZUELA_Sat_Obj = new ArrayList<>();
        VENEZUELA_Sat_Obj.add(new Satellite(42954, "VRSS-2", "Observation", "Oct-9-2017", R.mipmap.ic_vrss1_foreground));
        VENEZUELA_Sat_Obj.add(new Satellite(38782, "VRSS-1", "Observation", "Sep-29-2012", R.mipmap.ic_vrss2_foreground));
        VENEZUELA_Sat_Obj.add(new Satellite(33414, "VENESAT-1", "Communication", "Oct-29-2008", R.mipmap.ic_venesat1_foreground));
        return VENEZUELA_Sat_Obj;
    }

    public List<Satellite> VIETNAM_Satellite_List() {
        VIETNAM_Sat_Obj = new ArrayList<>();
        VIETNAM_Sat_Obj.add(new Satellite(39160, "VNREDSAT 1", "Observation", "May-7-2013", R.mipmap.ic_vnredsat1_foreground));
        VIETNAM_Sat_Obj.add(new Satellite(38332, "VINASAT 2", "Communications", "May-15-2012-", R.mipmap.ic_vinasat1_foreground));
        VIETNAM_Sat_Obj.add(new Satellite(32767, "VINASAT 1", "Communications", "Apr-18-2008", R.mipmap.ic_vinasat1_foreground));
        return VIETNAM_Sat_Obj;
    }

    public void inClickEvent(Country country) {

        Intent intent = new Intent(getApplicationContext(), SatelliteListActivity.class);

        switch (country.getCountryName()) {
            case "ALGERIA":
                intent.putExtra("savedUser", (Serializable) ALGERIA_Satellite_List());
                startActivity(intent);
                break;
            case "AUSTRALIA":
                intent.putExtra("savedUser", (Serializable) AUSTRALIA_Satellite_List());
                startActivity(intent);
                break;
            case "ARGENTINA":
                intent.putExtra("savedUser", (Serializable) ARGENTINA_Satellite_List());
                startActivity(intent);
                break;
            case "AZERBAIJAN":
                intent.putExtra("savedUser", (Serializable) AZERBAIJAN_Satellite_List());
                startActivity(intent);
                break;
            case "BELARUS":
                intent.putExtra("savedUser", (Serializable) BELARUS_Satellite_List());
                startActivity(intent);
                break;
            case "BOLIVIA":
                intent.putExtra("savedUser", (Serializable) BOLIVIA_Satellite_List());
                startActivity(intent);
                break;
            case "BRAZIL":
                intent.putExtra("savedUser", (Serializable) BRAZIL_Satellite_List());
                startActivity(intent);
                break;
            case "BULGARIA":
                intent.putExtra("savedUser", (Serializable) BULGARIA_Satellite_List());
                startActivity(intent);
                break;
            case "CANADA":
                intent.putExtra("savedUser", (Serializable) CANADA_Satellite_List());
                startActivity(intent);
                break;
            case "CHILE":
                intent.putExtra("savedUser", (Serializable) CHILE_Satellite_List());
                startActivity(intent);
                break;
            case "CHINA":
                intent.putExtra("savedUser", (Serializable) CHINA_Satellite_List());
                startActivity(intent);
                break;
            case "CZECH":
                intent.putExtra("savedUser", (Serializable) CZECH_Satellite_List());
                startActivity(intent);
                break;
            case "DENMARK":
                intent.putExtra("savedUser", (Serializable) DENMARK_Satellite_List());
                startActivity(intent);
                break;
            case "ECUADOR":
                intent.putExtra("savedUser", (Serializable) ECUADOR_Satellite_List());
                startActivity(intent);
                break;
            case "EGYPT":
                intent.putExtra("savedUser", (Serializable) EGYPT_Satellite_List());
                startActivity(intent);
                break;
            case "ESTONIA":
                intent.putExtra("savedUser", (Serializable) ESTONIA_Satellite_List());
                startActivity(intent);
                break;
            case "FRANCE":
                intent.putExtra("savedUser", (Serializable) FRANCE_Satellite_List());
                startActivity(intent);
                break;
            case "GERMANY":
                intent.putExtra("savedUser", (Serializable) GERMANY_Satellite_List());
                startActivity(intent);
                break;
            case "GREECE":
                intent.putExtra("savedUser", (Serializable) GREECE_Satellite_List());
                startActivity(intent);
                break;
            case "INDIA":
                intent.putExtra("savedUser", (Serializable) INDIA_Satellite_List());
                startActivity(intent);
                break;
            case "INDONESIA":
                intent.putExtra("savedUser", (Serializable) INDONESIA_Satellite_List());
                startActivity(intent);
                break;
            case "IRAN":
                intent.putExtra("savedUser", (Serializable) IRAN_Satellite_List());
                startActivity(intent);
                break;
            case "IRAQ":
                intent.putExtra("savedUser", (Serializable) IRAQ_Satellite_List());
                startActivity(intent);
                break;
            case "ISRAEL":
                intent.putExtra("savedUser", (Serializable) ISRAEL_Satellite_List());
                startActivity(intent);
                break;
            case "ITALY":
                intent.putExtra("savedUser", (Serializable) ITALY_Satellite_List());
                startActivity(intent);
                break;
            case "JAPAN":
                intent.putExtra("savedUser", (Serializable) JAPAN_Satellite_List());
                startActivity(intent);
                break;
            case "KAZAKHSTAN":
                intent.putExtra("savedUser", (Serializable) KAZAKHSTAN_Satellite_List());
                startActivity(intent);
                break;
            case "LAOS":
                intent.putExtra("savedUser", (Serializable) LAOS_Satellite_List());
                startActivity(intent);
                break;
            case "LATVIA":
                intent.putExtra("savedUser", (Serializable) LATVIA_Satellite_List());
                startActivity(intent);
                break;
            case "LITHUANIA":
                intent.putExtra("savedUser", (Serializable) LITHUANIA_Satellite_List());
                startActivity(intent);
                break;
            case "LUXEMBOURG":
                intent.putExtra("savedUser", (Serializable) LUXEMBOURG_Satellite_List());
                startActivity(intent);
                break;
            case "MALAYSIA":
                intent.putExtra("savedUser", (Serializable) MALAYSIA_Satellite_List());
                startActivity(intent);
                break;
            case "MEXICO":
                intent.putExtra("savedUser", (Serializable) MEXICO_Satellite_List());
                startActivity(intent);
                break;
            case "MOROCCO":
                intent.putExtra("savedUser", (Serializable) MOROCCO_Satellite_List());
                startActivity(intent);
                break;
            case "NETHERLANDS":
                intent.putExtra("savedUser", (Serializable) NETHERLANDS_Satellite_List());
                startActivity(intent);
                break;
            case "NIGERIA":
                intent.putExtra("savedUser", (Serializable) NIGERIA_Satellite_List());
                startActivity(intent);
                break;
            case "NORTH KOREA":
                intent.putExtra("savedUser", (Serializable) NORTH_KOREA_Satellite_List());
                startActivity(intent);
                break;
            case "NORWAY":
                intent.putExtra("savedUser", (Serializable) NORWAY_Satellite_List());
                startActivity(intent);
                break;
            case "PAKISTAN":
                intent.putExtra("savedUser", (Serializable) PAKISTAN_Satellite_List());
                startActivity(intent);
                break;
            case "PERU":
                intent.putExtra("savedUser", (Serializable) PERU_Satellite_List());
                startActivity(intent);
                break;
            case "PHILIPPINES":
                intent.putExtra("savedUser", (Serializable) PHILIPPINES_Satellite_List());
                startActivity(intent);
                break;
            case "POLAND":
                intent.putExtra("savedUser", (Serializable) POLAND_Satellite_List());
                startActivity(intent);
                break;
            case "PORTUGAL":
                intent.putExtra("savedUser", (Serializable) PORTUGAL_Satellite_List());
                startActivity(intent);
                break;
            case "RUSSIA":
                intent.putExtra("savedUser", (Serializable) RUSSIA_Satellite_List());
                startActivity(intent);
                break;
            case "SAUDI ARABIA":
                intent.putExtra("savedUser", (Serializable) SAUDI_ARABIA_Satellite_List());
                startActivity(intent);
                break;
            case "SINGAPORE":
                intent.putExtra("savedUser", (Serializable) SINGAPORE_Satellite_List());
                startActivity(intent);
                break;
            case "SLOVAKIA":
                intent.putExtra("savedUser", (Serializable) SLOVAKIA_Satellite_List());
                startActivity(intent);
                break;
            case "SOUTH AFRICA":
                intent.putExtra("savedUser", (Serializable) SOUTH_AFRICA_Satellite_List());
                startActivity(intent);
                break;
            case "SOUTH KOREA":
                intent.putExtra("savedUser", (Serializable) SOUTH_KOREA_Satellite_List());
                startActivity(intent);
                break;
            case "SPAIN":
                intent.putExtra("savedUser", (Serializable) SPAIN_Satellite_List());
                startActivity(intent);
                break;
            case "SWEDEN":
                intent.putExtra("savedUser", (Serializable) SWEDEN_Satellite_List());
                startActivity(intent);
                break;
            case "TAIWAN":
                intent.putExtra("savedUser", (Serializable) TAIWAN_Satellite_List());
                startActivity(intent);
                break;
            case "THAILAND_":
                intent.putExtra("savedUser", (Serializable) THAILAND_Satellite_List());
                startActivity(intent);
                break;
            case "TURKEY":
                intent.putExtra("savedUser", (Serializable) TURKEY_Satellite_List());
                startActivity(intent);
                break;
            case "UNITED ARAB EMIRATES":
                intent.putExtra("savedUser", (Serializable) UNITED_ARAB_EMIRATES_Satellite_List());
                startActivity(intent);
                break;
            case "UNITED KINGDOM":
                intent.putExtra("savedUser", (Serializable) UNITED_KINGDOM_Satellite_List());
                startActivity(intent);
                break;
            case "USA":
                intent.putExtra("savedUser", (Serializable) USA_Satellite_List());
                startActivity(intent);
                break;
            case "URUGUAY":
                intent.putExtra("savedUser", (Serializable) URUGUAY_Satellite_List());
                startActivity(intent);
                break;
            case "VENEZUELA":
                intent.putExtra("savedUser", (Serializable) VENEZUELA_Satellite_List());
                startActivity(intent);
                break;
            case "VIETNAM":
                intent.putExtra("savedUser", (Serializable) VIETNAM_Satellite_List());
                startActivity(intent);
                break;
            case "KENIA":
                intent.putExtra("savedUser", (Serializable) KENIA_Satellite_List());
                startActivity(intent);
                break;
            case "BANGLADESH":
                intent.putExtra("savedUser", (Serializable) BANGLADESH_Satellite_List());
                startActivity(intent);
                break;
        }
    }
}
