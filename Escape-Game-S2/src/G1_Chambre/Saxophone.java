package G1_Chambre;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;


public class Saxophone {
    public int volume = 100;
    private Synthesizer synthesizer ;
    private  MidiChannel canal;

    public Saxophone(){
        try {
            //On récupère le synthétiseur, on l'ouvre et on obtient un canal
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(Saxophone.class.getName()).log(Level.SEVERE,null,ex);
        }
        canal = synthesizer.getChannels()[0];

        canal.programChange(100);
    }
    //note_on : Joue la note dont le numéro est en paramètre
    public void note_on(int note){canal.noteOn(note,volume);}
    //note_off : Stop la note dont le numéro est en paramètre
    public void note_off(int note){canal.noteOff(note,volume);}
}
