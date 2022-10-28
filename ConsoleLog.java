import java.util.logging.*;
public class ConsoleLog {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger(ConsoleLog.class.getName());
    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.INFO);
    logger.addHandler(consoleHandler);
    logger.info("�������J�n���܂����B");
    logger.info("�������I�����܂����B");
  }
}