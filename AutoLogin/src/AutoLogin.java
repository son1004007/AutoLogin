import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AutoLogin {
	public static void main(String [] args) throws AWTException {
		final int VK_ENTER = 10;
		final Logger log = Logger.getGlobal();
		
		try {
			Desktop.getDesktop().browse(new URI("https://www.projectware.kr/A/In.aspx"));
			Thread.sleep(5000);
			
			Robot robot = new Robot();
			
			robot.keyPress(VK_ENTER);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.warning("warning");
		log.info("info");
	}
}