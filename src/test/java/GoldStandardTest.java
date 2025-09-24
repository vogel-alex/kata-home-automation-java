import home.automation.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Ferdinand.Szekeresch on 09.07.2017.
 */
public class GoldStandardTest {

    @Test
    public void testGoldStandard() {
        String goldStandard = """
        BIG OLD SWITCH PRESSED.
        
        
        Closing blinds.
        Setting temperature to 20
        Dimming to 50%
        Loading Spotify....
        Get up, stand up... Stand up for your rights!
        Turning on CoffeeMaster3000(c)
        BRRRRRRRRRRRRRRRRRRRRRRR SHHHHHHHHHHHHHHHHHHHHHHHHHHHH Drip Drip Drip...
        Using Decaf Beans.
                 |
         \\     _____     /
             /       \\
            (         )
        -   ( ))))))) )   -
             \\ \\   / /
              \\|___|/
          /    |___|    \\
               |___| prs
               |___|
        
        Opening blinds. Avert your eyes.
        Turning off airconditioning.
        Lights will go out in 10 seconds.
        Play will continue from 'I didn't shoot the deputy.'
        Stereo Shutting down.
        Running MasterClean3000(c) on CoffeeMaster3000
        Shutting down CoffeeMaster3000
        CoffeeMaster3000 standing by.
        """;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream testOut = new PrintStream(baos);
        PrintStream stdout = System.out;
        System.setOut(testOut);

        Main.main(new String[]{});
    
        var capturedOut = baos.toString();
        System.setOut(stdout);
        System.out.println(capturedOut);
        
        Assertions.assertEquals(goldStandard.trim(), capturedOut.trim().replace("\r", ""));
    }
}
