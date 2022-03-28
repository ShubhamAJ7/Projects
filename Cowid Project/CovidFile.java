package com.cowid.info;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CovidFile {
	public static void main(String[] args) {
		String file = "H:\\project\\owid-covid-data.csv";
		BufferedReader reader = null;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				for(String index : row) {
					System.out.printf("%+10ss", index);
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
