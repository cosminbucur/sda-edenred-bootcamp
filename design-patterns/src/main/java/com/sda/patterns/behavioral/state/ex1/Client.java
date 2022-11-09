package com.sda.patterns.behavioral.state.ex1;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();

		PlayState playState = new PlayState();
		playState.doAction(context);
		System.out.println(context.getCurrentState().toString());

		PauseState pauseState = new PauseState();
		pauseState.doAction(context);
		System.out.println(context.getCurrentState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getCurrentState().toString());
	}

}


