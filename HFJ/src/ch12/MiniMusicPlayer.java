package ch12;

import javax.sound.midi.*;

public class MiniMusicPlayer {
	
	public static void main(String[] args){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			for (int i=5; i < 61; i++){
				
			}
			
		}
		catch(Exception e){
			
		}
		
	}

}
