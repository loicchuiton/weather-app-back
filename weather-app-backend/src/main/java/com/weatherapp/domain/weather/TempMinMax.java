package com.weatherapp.domain.weather;

import lombok.Data;

@Data
public class TempMinMax {

	private String date;
	private Double maxTemp;
	private Double minTemp;

	public TempMinMax(String date, Double maxTemp, Double minTemp) {
		this.date = date;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;

	}

}
