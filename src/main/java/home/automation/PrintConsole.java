package home.automation;

public class PrintConsole {
    
    static void printLightBulb(){
        StringBuffer b = new StringBuffer();
		b.append("         |\n");
		b.append(" \\     _____     /\n");
		b.append("     /       \\\n");
		b.append("    (         )\n");
		b.append("-   ( ))))))) )   -\n");
		b.append("     \\ \\   / /\n");
		b.append("      \\|___|/\n");
		b.append("  /    |___|    \\\n");
		b.append("       |___| prs\n");
		b.append("       |___|\n");
		System.out.println(b.toString());
    }

    static void bigOldSwitchPressed(){
        System.out.println("BIG OLD SWITCH PRESSED.\n\n");
    }
}
