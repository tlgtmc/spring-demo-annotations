package com.atmaca.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> data;

	public FileFortuneService() {
		File theFile = new File("/Users/tlgtmc/Documents/ws/spring-demo-annotations/src/sport.txt");

		data = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				data.add(tempLine);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Random rand = new Random();

	@Override
	public String getFortune() {
		return data.get(rand.nextInt(data.size()));
	}

}
