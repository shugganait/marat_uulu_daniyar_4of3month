package com.kg.marat_uulu_daniyar_4of3month.continent_country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kg.marat_uulu_daniyar_4of3month.R;
import com.kg.marat_uulu_daniyar_4of3month.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements OnClick {


    private FragmentContinentBinding binding;
    private ArrayList<Continent> continentList;
    private ArrayList<String> countryOfAsia;
    private ArrayList<String> countryOfAfrica;
    private ArrayList<String> countryOfAmerica;
    private ArrayList<String> countryOfEurope;
    private ContinentAdapter continentAdapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initCountryLists();
        loadData();
        continentAdapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(continentAdapter);
    }

    @Override
    public void onClick(int position) {
        Continent continent = continentList.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("CONTINENT", continent);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_fragment, countryFragment).addToBackStack(null).commit();
    }
    private void loadData() {
        continentList = new ArrayList<>();
        continentList.add(new Continent("Asia", "https://annamap.ru/azia/karta-azia.jpg",
                countryOfAsia));
        continentList.add(new Continent("Europe", "https://annamap.ru/evropa/karta-evropa.jpg",
                countryOfEurope));
        continentList.add(new Continent("Africa", "https://annamap.ru/afrika/karta-afriki.jpg",
                countryOfAfrica));
        continentList.add(new Continent("America", "https://media.istockphoto.com/id/1222247901/ru/%D0%B2%D0%B5%D0%BA%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F/%D0%B0%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B0-%D0%BE%D1%82%D0%B4%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D0%B3%D0%BE%D1%81%D1%83%D0%B4%D0%B0%D1%80%D1%81%D1%82%D0%B2%D0%B0-%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B0%D1%8F-%D0%BA%D0%B0%D1%80%D1%82%D0%B0-%D1%81-%D0%BD%D0%B0%D1%86%D0%B8%D0%BE%D0%BD%D0%B0%D0%BB%D1%8C%D0%BD%D1%8B%D0%BC%D0%B8-%D0%B3%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0%D0%BC%D0%B8.jpg?s=612x612&w=is&k=20&c=bqO-yZLvjhHKTjH3vQokOrRfmT6hFBfxlHMqDwOi0-M=",
                countryOfAmerica));

    }
    private void initCountryLists() {
        countryOfAsia = new ArrayList<>();
        countryOfAsia.add("Kyrgyzstan"); countryOfAsia.add("Bishkek"); countryOfAsia.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/250px-Flag_of_Kyrgyzstan.svg.png");
        countryOfAsia.add("Kazakhstan"); countryOfAsia.add("Astana"); countryOfAsia.add("https://akorda.kz/assets/media/flag_mediumThumb.jpg");
        countryOfAsia.add("China"); countryOfAsia.add("Beijing"); countryOfAsia.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/255px-Flag_of_the_People%27s_Republic_of_China.svg.png");
        countryOfAsia.add("India"); countryOfAsia.add("Mumbai"); countryOfAsia.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png");
        countryOfAsia.add("Mongolia"); countryOfAsia.add("Ulan-Bator"); countryOfAsia.add("https://cdn.britannica.com/56/2756-004-54509464/Flag-Mongolia.jpg");
        countryOfAsia.add("Uzbekistan"); countryOfAsia.add("Samarkand"); countryOfAsia.add("https://cdn.britannica.com/47/7247-004-44F420D7/Flag-Uzbekistan.jpg");
        countryOfAsia.add("Japan"); countryOfAsia.add("Tokyo"); countryOfAsia.add("https://upload.wikimedia.org/wikipedia/en/thumb/9/9e/Flag_of_Japan.svg/1200px-Flag_of_Japan.svg.png");
        countryOfAsia.add("Pakistan"); countryOfAsia.add("Islamabad"); countryOfAsia.add("https://cdn.britannica.com/46/3346-004-D3BDE016/flag-symbolism-Pakistan-design-Islamic.jpg");
        countryOfAsia.add("Turkey"); countryOfAsia.add("Ankara"); countryOfAsia.add("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Flag_of_Turkey.svg/640px-Flag_of_Turkey.svg.png");
        countryOfAsia.add("Korea"); countryOfAsia.add("Seoul"); countryOfAsia.add("https://asiasociety.org/sites/default/files/styles/1200w/public/K/korean-flag.jpg");

        countryOfAfrica = new ArrayList<>();
        countryOfAfrica.add("Nigeria"); countryOfAfrica.add("Abuja"); countryOfAfrica.add("https://cdn.britannica.com/68/5068-004-72A3F250/Flag-Nigeria.jpg");
        countryOfAfrica.add("Ethiopia"); countryOfAfrica.add("Addis Ababa"); countryOfAfrica.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/2560px-Flag_of_Ethiopia.svg.png");
        countryOfAfrica.add("Egypt"); countryOfAfrica.add("Cairo"); countryOfAfrica.add("https://cdn.britannica.com/85/185-004-1EA59040/Flag-Egypt.jpg");
        countryOfAfrica.add("Tanzania"); countryOfAfrica.add("Dodoma"); countryOfAfrica.add("https://cdn.britannica.com/20/20-004-EB20A026/Flag-Tanzania.jpg");
        countryOfAfrica.add("Kenya"); countryOfAfrica.add("Nairobi"); countryOfAfrica.add("https://cdn.britannica.com/15/15-004-B5D6BF80/Flag-Kenya.jpg");
        countryOfAfrica.add("Uganda"); countryOfAfrica.add("Kampala"); countryOfAfrica.add("https://cdn.britannica.com/22/22-004-0165975D/Flag-Uganda.jpg");
        countryOfAfrica.add("Sudan"); countryOfAfrica.add("Khartoum"); countryOfAfrica.add("https://cdn.britannica.com/96/4496-004-278A6211/Flag-Sudan.jpg");
        countryOfAfrica.add("Morocco"); countryOfAfrica.add("Rabat"); countryOfAfrica.add("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Flag_of_Morocco.svg/2560px-Flag_of_Morocco.svg.png");
        countryOfAfrica.add("Ghana"); countryOfAfrica.add("Accra"); countryOfAfrica.add("https://cdn.britannica.com/54/5054-004-A09ABCDF/Flag-Ghana.jpg");
        countryOfAfrica.add("Cameroon"); countryOfAfrica.add("Yaounde"); countryOfAfrica.add("https://cdn.britannica.com/42/5042-004-7FF4ACCA/Flag-Cameroon.jpg");

        countryOfAmerica = new ArrayList<>();
        countryOfAmerica.add("Argentina"); countryOfAmerica.add("St. John's"); countryOfAmerica.add("https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg");
        countryOfAmerica.add("Bahamas"); countryOfAmerica.add("Nassau"); countryOfAmerica.add("https://cdn.britannica.com/06/5106-004-B8EE9FD3/Flag-of-The-Bahamas.jpg");
        countryOfAmerica.add("Brazil"); countryOfAmerica.add("Brasilia"); countryOfAmerica.add("https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/1200px-Flag_of_Brazil.svg.png");
        countryOfAmerica.add("Canada"); countryOfAmerica.add("Ottawa"); countryOfAmerica.add("https://www.worldatlas.com/img/flag/ca-flag.jpg");
        countryOfAmerica.add("Dominica"); countryOfAmerica.add("Roseau"); countryOfAmerica.add("https://cdn.britannica.com/12/5112-004-58893CEE/Flag-Dominica.jpg");
        countryOfAmerica.add("Costa Rica"); countryOfAmerica.add("San Jose"); countryOfAmerica.add("https://cdn.britannica.com/25/7225-004-65F33B16/Flag-Costa-Rica.jpg");
        countryOfAmerica.add("Colombia"); countryOfAmerica.add("Bogota"); countryOfAmerica.add("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/255px-Flag_of_Colombia.svg.png");
        countryOfAmerica.add("Cuba"); countryOfAmerica.add("Havana"); countryOfAmerica.add("https://s3.amazonaws.com/libapps/accounts/41132/images/flag.JPG");
        countryOfAmerica.add("Mexico"); countryOfAmerica.add("Mexico city"); countryOfAmerica.add("https://cdn.britannica.com/73/2573-004-29818847/Flag-Mexico.jpg");
        countryOfAmerica.add("Honduras"); countryOfAmerica.add("Tegucigalpa"); countryOfAmerica.add("https://cdn.britannica.com/16/7216-004-F1400CA0/Flag-Honduras.jpg");
        countryOfEurope = new ArrayList<>();
        countryOfEurope.add("United Kingdom"); countryOfEurope.add("London"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1200px-Flag_of_the_United_Kingdom_%281-2%29.svg.png");
        countryOfEurope.add("Poland"); countryOfEurope.add("Warsaw"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/en/thumb/1/12/Flag_of_Poland.svg/1200px-Flag_of_Poland.svg.png");
        countryOfEurope.add("Germany"); countryOfEurope.add("Berlin"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png");
        countryOfEurope.add("Ukraine"); countryOfEurope.add("Kiev"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Ukraine.svg/800px-Flag_of_Ukraine.svg.png?20100406171642");
        countryOfEurope.add("Switzerland"); countryOfEurope.add("Bern"); countryOfEurope.add("https://cdn.britannica.com/43/4543-004-C0D5C6F4/Flag-Switzerland.jpg");
        countryOfEurope.add("Russia"); countryOfEurope.add("Moscow"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/640px-Flag_of_Russia.svg.png");
        countryOfEurope.add("France"); countryOfEurope.add("Paris"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/1200px-Flag_of_France.svg.png");
        countryOfEurope.add("Belarus"); countryOfEurope.add("Minsk"); countryOfEurope.add("https://cdn.britannica.com/01/6401-004-FAEACB4E/Flag-Belarus.jpg");
        countryOfEurope.add("Austria"); countryOfEurope.add("Vienna"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Austria.svg/255px-Flag_of_Austria.svg.png");
        countryOfEurope.add("Italy"); countryOfEurope.add("Rome"); countryOfEurope.add("https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/255px-Flag_of_Italy.svg.png");
    }
}