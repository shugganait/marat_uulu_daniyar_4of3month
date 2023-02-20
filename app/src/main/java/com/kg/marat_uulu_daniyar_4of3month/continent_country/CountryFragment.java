package com.kg.marat_uulu_daniyar_4of3month.continent_country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kg.marat_uulu_daniyar_4of3month.R;
import com.kg.marat_uulu_daniyar_4of3month.databinding.FragmentContinentBinding;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentContinentBinding binding;
    private Continent continent;
    private ArrayList<Country> countryList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
        continent = (Continent) getArguments().getSerializable("CONTINENT");
        loadData();
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        binding.rvContinent.setAdapter(countryAdapter);

    }

    private void loadData() {
        countryList = new ArrayList<>();
        countryList.add(new Country(continent.getCountries().get(0), continent.getCountries().get(1), continent.getCountries().get(2)));
        countryList.add(new Country(continent.getCountries().get(3), continent.getCountries().get(4), continent.getCountries().get(5)));
        countryList.add(new Country(continent.getCountries().get(6), continent.getCountries().get(7), continent.getCountries().get(8)));
        countryList.add(new Country(continent.getCountries().get(9), continent.getCountries().get(10), continent.getCountries().get(11)));
        countryList.add(new Country(continent.getCountries().get(12), continent.getCountries().get(13), continent.getCountries().get(14)));
        countryList.add(new Country(continent.getCountries().get(15), continent.getCountries().get(16), continent.getCountries().get(17)));
        countryList.add(new Country(continent.getCountries().get(18), continent.getCountries().get(19), continent.getCountries().get(20)));
        countryList.add(new Country(continent.getCountries().get(21), continent.getCountries().get(22), continent.getCountries().get(23)));
        countryList.add(new Country(continent.getCountries().get(24), continent.getCountries().get(25), continent.getCountries().get(26)));
        countryList.add(new Country(continent.getCountries().get(27), continent.getCountries().get(28), continent.getCountries().get(29)));
    }
}