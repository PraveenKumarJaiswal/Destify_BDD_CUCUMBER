package Resource;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

public class RobotUtil {

	public static void typeKeys(String str, Robot r) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ':') {
				typeCharacter(r, "SEMICOLON", true);
			} else if (str.charAt(i) == '\\') {
				typeCharacter(r, "BACK_SLASH", false);
				// KeyEvent.VK_BACK_SLASH
			} else if (str.charAt(i) == '.') {
				typeCharacter(r, "PERIOD", false);
				// KeyEvent.VK_PERIOD
			} else {
				char ch = str.charAt(i);
				if (Character.isUpperCase(ch)) {
					typeCharacter(r, "" + ch, true);
				} else {
					typeCharacter(r, "" + ch, false);
				}

			}

		}
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void typeCharacter(Robot robot, String letter, boolean needShift) {
		try {

			String variableName = "VK_" + letter.toUpperCase();
			Class clazz = KeyEvent.class;
			Field field = clazz.getField(variableName);
			int keyCode = field.getInt(null);

			robot.delay(1000);

			if (needShift)
				robot.keyPress(KeyEvent.VK_SHIFT);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

			if (needShift)
				robot.keyRelease(KeyEvent.VK_SHIFT);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
