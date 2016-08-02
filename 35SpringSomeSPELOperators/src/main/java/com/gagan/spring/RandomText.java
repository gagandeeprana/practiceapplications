package com.gagan.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component(value = "rt")
public class RandomText {

	private static String[] texts = { "I 'll be back", "Go to hell",
			"bye bye...!!", null };

	public String getText() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}
}
