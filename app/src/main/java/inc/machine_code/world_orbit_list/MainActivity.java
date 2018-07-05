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
        BULGARIA_Sat_Obj=new ArrayList<>();
        BULGARIA_Sat_Obj.add(new Satellite(42801,"BULGARIASAT-1","Communication","Jun-23-2017",R.mipmap.ic_bulgaria_foreground));
        return BULGARIA_Sat_Obj;
    }

    public List<Satellite> CANADA_Satellite_List() {
        CANADA_Sat_Obj=new ArrayList<>();
        CANADA_Sat_Obj.add(new Satellite(43157,"KEPLER-O (KIPP)","","Jan-19-2018",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(42734,"EXALTA-1","","Nov-20-1998",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41788,"CANX-7","","Sep-26-2016",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41605,"M3MSAT","","Jun-22-2016",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41602,"GHGSAT-D","","Jun-22-2016",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(41036,"TELSTAR 12V","","Nov-24-2015",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40936,"EXACTVIEW 9","","Sep-28-2015",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40056,"NLS 7.2/CANX 5","","Jun-30-2014",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40055,"NLS 7.1/CANX 4","","Jun-30-2014",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(40020,"BRITE TORONTO","","Jun-19-2014",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39265,"CASSIOPE","","Sep-29-2013",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39127,"ANIK G1","","Apr-15-2013",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39089,"NEOSSAT","","Feb-25-2013",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(39088,"SAPPHIRE","","Feb-25-2013",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(38709,"EXACTVIEW-1","","Jul-22-2012",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(38342,"NIMIQ 6","","May-17-2012",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(37602,"TELSTAR 14R","","May-20-2011",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(35873,"NIMIQ 5","","Sep-17-2009",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(34111,"TELSTAR 11N","","Feb-26-2009",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(33453,"CIEL-2","","Dec-10-2008",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(33373,"NIMIQ 4","","Sep-19-2008",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(32790,"CANX-2","","Apr-28-2008",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(32784,"CANX-6","","Apr-28-2008",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(32382,"RADARSAT 2","","Dec-14-2007",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(31102,"ANIK F3","","Apr-9-2007",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(28868,"ANIK F1-R","","Sep-8-2005",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(28378,"ANIK F2","","Jul-18-2004",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27858,"SCISAT 1","","Aug-13-2003",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27847,"CANX-1","","Jun-30-2003",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27843,"MOST","","Jun-30-2003",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(27632,"NIMIQ 2","","Dec-29-2002",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(26624,"ANIK F1","","Nov-21-2000",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(25740,"NIMIQ 1","","May-20-1999",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(23846,"MSAT M1","","Apr-20-1996",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(23710,"RADARSAT","","Nov-4-1995",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(21726,"ANIK E1","","Sep-26-1991",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(21222,"ANIK E2","","Apr-4-1991",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(13652,"ANIK C3 (TELESAT-5)","","Nov-11-1982",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(13652,"ANIK D1 (TELESAT 6)","","Aug-26-1982",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(11153,"ANIK B1 (TELESAT-4)","","Dec-16-1978",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(8585,"CTS","","Jan-17-1976",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(7790,"ANIK A3 (TELESAT-3)","","May-7-1975",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(6437,"ANIK A2 (TELESAT 2)","","Apr-20-1973",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(6278,"ANIK A1 (TELESAT 1)","","Nov-10-1972",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(5104,"ISIS 2","","Apr-1-1971",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(3669,"ISIS 1","","Jan-30-1969",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(1804,"ALOUETTE 2","","Nov-29-1965",R.mipmap.ic_canada_foreground));
        CANADA_Sat_Obj.add(new Satellite(424,"ALOUETTE 1 (S-27)","","Sep-29-1962",R.mipmap.ic_canada_foreground));
        return CANADA_Sat_Obj;
    }

    public List<Satellite> CHILE_Satellite_List() {
        CHILE_Sat_Obj=new ArrayList<>();
        CHILE_Sat_Obj.add(new Satellite(42788,"SUCHAI","","Jun-23-2017",R.mipmap.ic_chile_foreground));
        CHILE_Sat_Obj.add(new Satellite(38011,"SSOT","","Dec-17-2011",R.mipmap.ic_chile_foreground));
        CHILE_Sat_Obj.add(new Satellite(25395,"FASAT B","","Jul-10-1998",R.mipmap.ic_chile_foreground));
        return CHILE_Sat_Obj;
    }

    public List<Satellite> CHINA_Satellite_List() {
        CHINA_Sat_Obj=new ArrayList<>();
        CHINA_Sat_Obj.add(new Satellite(43519,"XJS B","","Jun-27-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43518,"XJS A","","Jun-27-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43491,"FENGYUN 2H","","Jun-5-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43485,"LUOJIA-1 01","","Jun-2-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43484,"GAOFEN 6","","Jun-2-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43472,"LONGJIANG 2","","May-20-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43471,"LONGJIANG 1","","May-20-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43470,"QUEQIAO","","May-20-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43461,"GAOFEN-5","","May-8-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43450,"APSTAR 6C","","May-3-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43443,"ZHUHAI-1 OHS-04","","Apr-26-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43442,"ZHUHAI-1 OHS-03","","Apr-26-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43441,"ZHUHAI-1 OHS-02","","Apr-26-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43440,"ZHUHAI-1 OVS-02","","Apr-26-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43439,"ZHUHAI-1 OHS-01","","Apr-26-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43279,"WEINA 1B","","Apr-10-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43277,"YAOGAN-31 C","","Apr-10-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43276,"YAOGAN-31 B","","Apr-10-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43275,"YAOGAN-31 A","","Apr-10-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43262,"GAOFEN 1-04","","Mar-31-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43260,"GAOFEN 1-03","","Mar-31-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43259,"GAOFEN 1-02","","Mar-31-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43246,"BEIDOU 3M8","","Mar-29-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43245,"BEIDOU 3M7","","Mar-29-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43236,"LKW-4","","Mar-17-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43208,"BEIDOU 3M6","","Feb-12-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43207,"BEIDOU 3M5","","Feb-12-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43199,"SHAONIAN XING","","Feb-2-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43194,"ZHANGHENG-1","","Feb-2-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43192,"FENGMANIU 1 (FMN 1)","Feb-2-2018","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43172,"YAOGAN-30 M","","Jan-25-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43171,"YAOGAN-30 L","","Jan-25-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43170,"YAOGAN-30 K","","Jan-25-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43169,"WEINA 1A","","Jan-25-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43160,"JILIN-01-08","","Jan-19-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43159,"JILIN-01-07","","Jan-19-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43158,"QUANTUTONG 1","","Jan-19-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43156,"ZHOU ENLAI","","Jan-19-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43155,"XIAOXIANG 2 (TY-2)","","Jan-19-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43146,"LKW-3","","Jan-13-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43108,"BEIDOU 3M4","","Jan-11-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43107,"BEIDOU 3M3","","Jan-11-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43100,"SUPERVIEW-1 04","","Jan-9-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43099,"SUPERVIEW-1 03","","Jan-9-2018",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43083,"YAOGAN-30 J","","Dec-25-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43082,"YAOGAN-30 H","","Dec-25-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43081,"YAOGAN-30 G","","Dec-25-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43080,"LKW-2","","Dec-23-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43034,"LKW-1","","Dec-3-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43030,"YAOGAN-30 F","","Nov-24-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43029,"YAOGAN-30 E","","Nov-24-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43028,"YAOGAN-30 D","","Nov-24-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43024,"JILIN-01-06","","Nov-21-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43023,"JILIN-01-05","","Nov-21-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43022,"JILIN-01-04","","Nov-21-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43011,"HEAD-1","","Nov-14-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43010,"FENGYUN 3D","","Nov-14-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43002,"BEIDOU-3 M2","","Nov-5-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(43001,"BEIDOU-3 M1","","Nov-5-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42947,"YAOGAN-30 C","","Nov-29-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42946,"YAOGAN-30 B","","Nov-29-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42945,"YAOGAN-30 A","","Nov-29-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42903,"SILKROAD 1","","Apr-20-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42787,"NUDTSAT","","Jun-23-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42763,"CHINASAT 9A","","Jun-18-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42761,"ZHUHAI-1 01 (CAS 4A)","","Jun-15-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42759,"ZHUHAI-1 02 (CAS 4B)","","Jun-15-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42758,"HXMT (HUIYAN)","","Jun-15-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42735,"AOXIANG-1","","Nov-20-1998",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42725,"LILACSAT-1","","Nov-20-1998",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42722,"NJUST-1","","Nov-20-1998",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42662,"CHINASAT 16","","Apr-12-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(42061,"TK-1","","Mar-2-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41915,"KAIDUN 1","","Jan-9-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41914,"JILIN-1-03","","Jan-9-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41913,"XY S 1","","Jan-9-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41911,"TJS-2","","Jan-5-2017",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41908,"SUPERVIEW-1 02","","Dec-28-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41907,"SUPERVIEW-1 01","","Dec-28-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41901,"SPARK 2","","Dec-21-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41900,"SPARK 1","","Dec-21-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41899,"YIJIAN","","Dec-21-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41898,"TANSAT","","Dec-21-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41882,"FENGYUN 4A","","Dec-10-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41869,"TIANLIAN 1-04","","Nov-22-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41868,"SHENZHOU-11 MODULE","","Oct-16-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41857,"YUNHAI 1","","Nov-11-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41845,"LISHUI 1-01","","Nov-9-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41844,"PINA 2B","","Nov-9-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41843,"PINA 2A","","Nov-9-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41842,"XIAOXIANG 1","","Nov-9-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41841,"XPNAV-1","","Nov-9-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41838,"SJ-17(SHIJIAN-17)","Nov-3-2016","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41834,"BANXING-2","","Sep-15-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41765,"TIANGONG-2","","Sep-15-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41731,"QSS","","Aug-15-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41727,"GAOFEN 3","","Aug-9-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41725,"TIANTONG-1 1","","Aug-5-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41634,"SJ 16-02","","Jun-29-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41586,"BEIDOU G7","","Jun-12-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41556,"ZIYUAN 3-2","","May-30-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41473,"YAOGAN 30","","May-15-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41434,"BEIDOU IGSO 6","","Mar-29-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41315,"BEIDOU M3-S","","Feb-1-2016",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41194,"GAOFEN 4","","Dec-28-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41173,"DAMPE","","Dec-17-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41103,"CHINASAT 1C","","Dec-9-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41038,"YAOGAN 29","","Nov-26-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41026,"YAOGAN 28","","Nov-8-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(41021,"CHINASAT 2C (ZX 2C)","","Nov-3-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40988,"TIANHUI 1-03","","Oct-26-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40982,"APSTAR 9","","Oct-16-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40961,"JILIN 1","","Oct-7-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40960,"LINGQIAO VIDEO B","","Oct-7-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40959,"LINGQIAO VIDEO A","","Oct-7-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40958,"LQSAT","","Oct-7-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40938,"BEIDOU I2-S","","Sep-29-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40928,"TIANWANG 1A (TW-1A)","","Sep-25-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40927,"TIANWANG 1B (TW-1B)","","Sep-25-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40926,"TIANWANG 1C (TW-1C)","","Sep-25-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40925,"PUJIANG 1 (PJ-1)","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40912,"KAITUO 1B","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40911,"XW-2B","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40910,"XW-2F","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40909,"XW-2E","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40908,"LILACSAT 2","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40907,"XW-2D","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40906,"XW-2C","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40904,"KAITUO 1A","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40903,"XW-2A","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40902,"ZDPS 2B","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40901,"ZDPS 2A","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40900,"NUDT-PHONESAT","","Sep-19-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40894,"GAOFEN 9","","Sep-14-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40892,"TJS-1","","Sep-12-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40878,"YAOGAN 27","","Aug-27-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40749,"BEIDOU-3 M2","","Jul-25-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40748,"BEIDOU-3 M1","","Jul-25-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40701,"GAOFEN 8","","Jul-26-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40549,"BEIDOU I1-S","","Mar-30-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40424,"ABS 3A","","Mar-2-2015",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40367,"FENGYUN 2G","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40362,"YAOGAN 26","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40340,"YAOGAN 25C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40339,"YAOGAN 25B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40338,"YAOGAN 25A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40336,"CBERS-4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40310,"YAOGAN 24","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40305,"YAOGAN 23","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40286,"SJ-11-08","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40275,"YAOGAN 22","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40261,"SJ-11-07","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40144,"TIANTUO 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40143,"YAOGAN 21","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40137,"CHUANG XIN 1-04","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40136,"LING QIAO","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40118,"GAOFEN 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40111,"YAOGAN 20C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40110,"YAOGAN 20B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(40109,"YAOGAN 20A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39624,"SJ-11-06","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39508,"ABS 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39455,"SHIYAN-5 (SY-5)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39410,"YAOGAN 19","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39363,"YAOGAN 18","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39358,"SHIJIAN-16 (SJ-16)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39260,"FENGYUN 3C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39241,"YAOGAN 17C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39240,"YAOGAN 17B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39239,"YAOGAN 17A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39210,"SHIJIAN-15 (SJ-15)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39209,"CHUANGXIN-3 (CX-3)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39208,"SHIYAN-7 (SY-7)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39202,"SJ-11-05","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39157,"CHINASAT 11","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39150,"GAOFEN 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39017,"CHINASAT 15A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39013,"YAOGAN 16C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39012,"YAOGAN 16B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(39011,"YAOGAN 16A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38999,"XINYAN 1 (XY-1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38998,"FENGNIAO 1 (FN-1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38997,"HJ-1C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38953,"BEIDOU G6","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38861,"SJ-9B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38860,"SJ-9A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38775,"BEIDOU M6","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38774,"BEIDOU M5","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38730,"TIANLIAN 1-03","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38354,"YAOGAN 15","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38352,"CHINASAT 2A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38257,"YAOGAN 14","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38256,"TIANHUI 1-02","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38251,"BEIDOU M4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38250,"BEIDOU M3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38107,"APSTAR 7","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38091,"BEIDOU G5","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38049,"FENGYUN 2F","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38046,"ZY 3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(38038,"ZY 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37948,"BEIDOU IGSO 5","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37941,"YAOGAN 13","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37931,"SHIYUAN 4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37930,"CHUANG XIN 1-03","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37875,"YAOGAN 12","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37804,"CHINASAT 1A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37781,"HAIYANG 2A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37765,"SJ-11-02","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37763,"BEIDOU IGSO 4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37737,"TIANLIAN 1-02","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37730,"SJ-11-03","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37677,"CHINASAT 10","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37384,"BEIDOU IGSO 3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37256,"BEIDOU IGSO 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37234,"CHINASAT 20A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37214,"FENGYUN 3B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37210,"BEIDOU G4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37180,"SJ-6H","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37179,"SJ-6G","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37174,"CHANG E 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37167,"ZHEDA PIXING 1C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37166,"ZHEDA PIXING 1B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37165,"YAOGAN 11","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(37150,"CHINASAT 6A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36985,"TIANHUI 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36834,"YAOGAN 10","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36828,"BEIDOU IGSO 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36596,"SJ-12","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36590,"BEIDOU G3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36415,"YAOGAN 9C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36414,"YAOGAN 9B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36413,"YAOGAN 9A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36287,"BEIDOU G1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36122,"XIWANG-1 (HOPE-1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36121,"YAOGAN 8","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36110,"YAOGAN 7","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(36088,"SJ-11-01","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(34839,"YAOGAN 6","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(34779,"BEIDOU G2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33463,"FENGYUN 2E","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33446,"YAOGAN 4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33434,"CHUANG XIN 1-02(CX-1-02)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33433,"SHIYUAN 3 (SY-3)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33409,"SJ-6F","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33408,"SJ-6E","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33321,"HJ-1B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33320,"HJ-1A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(33051,"CHINASAT 9","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(32958,"FENGYUN 3A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(32779,"CTDRS","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(32289,"YAOGAN 3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31800,"CHINASAT 6B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31490,"YAOGAN 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31115,"BEIDOU M1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(31113,"HAIYANG 1B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(30323,"BEIDOU 1D","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29640,"FENGYUN 2D","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29516,"SINOSAT 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29506,"SJ-6D","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29505,"SJ-6C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29398,"CHINASAT 22A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(29092,"YAOGAN 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28890,"BEIJING 1 (TSINGHUA)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28737,"SJ-7","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28638,"APSTAR 6","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28479,"TANSUO 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28470,"JB-3 C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28451,"FENGYUN 2C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28414,"SJ-6B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28413,"SJ-6A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28382,"DOUBLESTAR (TC-2)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28364,"APSTAR 5 (TELSTAR 18)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28221,"NAXING 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28220,"TANSUO 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28082,"CHINASAT 20","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(28058,"CHUANG XIN 1 (CZ-1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(27813,"BEIDOU 1C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(27431,"FENGYUN 1D","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(27430,"HAIYANG 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26643,"BEIDOU 1B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26599,"BEIDOU 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26385,"TZINGHUA 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26382,"FENGYUN 2B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(26058,"CHINASAT 22","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25924,"ABS 1(LMI 1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25731,"SJ-5","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25730,"FENGYUN 1C","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25404,"CHINASAT 5B (SINOSAT 1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25354,"CHINASAT 5A (CHINASTAR1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(25010,"APSTAR 2R (TELSTAR 10)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24926,"DUMMY MASS 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24925,"DUMMY MASS 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24901,"ABS 3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24834,"FENGYUN 2A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24798,"DFH-3 2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(24282,"CHINASAT 7","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(23943,"APSTAR 1A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(23415,"DFH-3 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(23185,"APSTAR 1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(22996,"SJ-4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(21833,"STTW-5","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(20788,"FENGYUN 1B","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(20473,"STTW-4","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(19710,"STTW-3","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(19467,"FENGYUN 1A","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(18922,"STTW-2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(16526,"STTW-1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(14985,"CHINASAT 5(SPACENET 1)","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(14899,"STTW-T2","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(14670,"STTW-T1","","",R.mipmap.ic_china_foreground));
        CHINA_Sat_Obj.add(new Satellite(4382,"DFH-1","","",R.mipmap.ic_china_foreground));

        return CHINA_Sat_Obj;
    }

    public List<Satellite> CZECH_Satellite_List() {

        return CZECH_Sat_Obj;
    }

    public List<Satellite> DENMARK_Satellite_List() {

        return DENMARK_Sat_Obj;
    }

    public List<Satellite> ECUADOR_Satellite_List() {

        return ECUADOR_Sat_Obj;
    }

    public List<Satellite> EGYPT_Satellite_List() {

        return EGYPT_Sat_Obj;
    }

    public List<Satellite> ESTONIA_Satellite_List() {

        return ESTONIA_Sat_Obj;
    }

    public List<Satellite> FRANCE_Satellite_List() {

        return FRANCE_Sat_Obj;
    }

    public List<Satellite> GERMANY_Satellite_List() {

        return GERMANY_Sat_Obj;
    }

    public List<Satellite> GREECE_Satellite_List() {

        return GREECE_Sat_Obj;
    }

    public List<Satellite> INDIA_Satellite_List() {

        return INDIA_Sat_Obj;
    }

    public List<Satellite> INDONESIA_Satellite_List() {

        return INDONESIA_Sat_Obj;
    }

    public List<Satellite> IRAN_Satellite_List() {

        return IRAN_Sat_Obj;
    }

    public List<Satellite> IRAQ_Satellite_List() {

        return IRAQ_Sat_Obj;
    }

    public List<Satellite> ISRAEL_Satellite_List() {

        return ISRAEL_Sat_Obj;
    }

    public List<Satellite> ITALY_Satellite_List() {

        return ITALY_Sat_Obj;
    }

    public List<Satellite> JAPAN_Satellite_List() {

        return JAPAN_Sat_Obj;
    }

    public List<Satellite> KAZAKHSTAN_Satellite_List() {

        return KAZAKHSTAN_Sat_Obj;
    }

    public List<Satellite> LAOS_Satellite_List() {

        return LAOS_Sat_Obj;
    }

    public List<Satellite> LATVIA_Satellite_List() {

        return LATVIA_Sat_Obj;
    }

    public List<Satellite> LITHUANIA_Satellite_List() {

        return LITHUANIA_Sat_Obj;
    }

    public List<Satellite> LUXEMBOURG_Satellite_List() {

        return LUXEMBOURG_Sat_Obj;
    }

    public List<Satellite> MALAYSIA_Satellite_List() {

        return MALAYSIA_Sat_Obj;
    }

    public List<Satellite> MEXICO_Satellite_List() {

        return MEXICO_Sat_Obj;
    }

    public List<Satellite> MOROCCO_Satellite_List() {

        return MOROCCO_Sat_Obj;
    }

    public List<Satellite> NETHERLANDS_Satellite_List() {

        return NETHERLANDS_Sat_Obj;
    }

    public List<Satellite> NIGERIA_Satellite_List() {

        return NIGERIA_Sat_Obj;
    }

    public List<Satellite> NORTH_KOREA_Satellite_List() {

        return NORTH_KOREA_Sat_Obj;
    }

    public List<Satellite> NORWAY_Satellite_List() {

        return NORWAY_Sat_Obj;
    }

    public List<Satellite> PAKISTAN_Satellite_List() {

        return PAKISTAN_Sat_Obj;
    }

    public List<Satellite> PERU_Satellite_List() {

        return PERU_Sat_Obj;
    }

    public List<Satellite> PHILIPPINES_Satellite_List() {

        return PHILIPPINES_Sat_Obj;
    }

    public List<Satellite> POLAND_Satellite_List() {

        return POLAND_Sat_Obj;
    }

    public List<Satellite> PORTUGAL_Satellite_List() {

        return PORTUGAL_Sat_Obj;
    }

    public List<Satellite> RUSSIA_Satellite_List() {

        return RUSSIA_Sat_Obj;
    }

    public List<Satellite> SAUDI_ARABIA_Satellite_List() {

        return SAUDI_ARABIA_Sat_Obj;
    }

    public List<Satellite> SINGAPORE_Satellite_List() {

        return SINGAPORE_Sat_Obj;
    }

    public List<Satellite> SLOVAKIA_Satellite_List() {

        return SLOVAKIA_Sat_Obj;
    }

    public List<Satellite> SOUTH_AFRICA_Satellite_List() {

        return SOUTH_AFRICA_Sat_Obj;
    }

    public List<Satellite> SOUTH_KOREA_Satellite_List() {

        return SOUTH_KOREA_Sat_Obj;
    }

    public List<Satellite> SPAIN_Satellite_List() {

        return SPAIN_Sat_Obj;
    }

    public List<Satellite> SWEDEN_Satellite_List() {

        return SWEDEN_Sat_Obj;
    }

    public List<Satellite> TAIWAN_Satellite_List() {

        return TAIWAN_Sat_Obj;
    }

    public List<Satellite> THAILAND_Satellite_List() {

        return THAILAND_Sat_Obj;
    }

    public List<Satellite> TURKEY_Satellite_List() {

        return TURKEY_Sat_Obj;
    }

    public List<Satellite> UNITED_ARAB_EMIRATES_Satellite_List() {

        return UNITED_ARAB_EMIRATES_Sat_Obj;
    }

    public List<Satellite> UNITED_KINGDOM_Satellite_List() {

        return UNITED_KINGDOM_Sat_Obj;
    }

    public List<Satellite> USA_Satellite_List() {

        return USA_Sat_Obj;
    }

    public List<Satellite> URUGUAY_Satellite_List() {

        return URUGUAY_Sat_Obj;
    }

    public List<Satellite> VENEZUELA_Satellite_List() {

        return VENEZUELA_Sat_Obj;
    }

    public List<Satellite> VIETNAM_Satellite_List() {

        return VIETNAM_Sat_Obj;
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
