package com.example.pattern;

public class Amplifier {
	private Voice voice;

	public Amplifier() {
		super();
	}

	public Amplifier(Voice voice) {
		super();
		this.voice = voice;
	}
	
	public void say(){
		System.out.println(voice.getVoice() * 100);
	}

}
