import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;

public class AutoLogin {
	public static void main(String [] args) throws AWTException {
		final int VK_ENTER = 10;
		
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
		
		// test
	}
}