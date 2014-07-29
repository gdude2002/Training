package exercises.july29;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This had a bunch of "*" imports, which were to be replaced with explicit imports as shown above.
 * The supplied imports were as follows:
 *
 * import java.io.*;
 * import java.text.*;
 * import java.util.*;
 * import java.util.logging.*;
 */

class TestClass {
    public static void main(String[] args) throws IOException {
        /* Ensure directory has been created */
        if (!new File("logs").mkdir()) {
            System.out.println("Failed to create dir.");
        }

        /* Get the date to be used in the filename */
        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        Date now = new Date();
        String date = df.format(now);

        /* Set up the filename in the logs directory */
        String logFileName = "logs\\testlog-" + date + ".txt";

        /* Set up Logger */
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger scjaLogger = Logger.getLogger("SCJA Logger");
        scjaLogger.setLevel(Level.ALL);
        scjaLogger.addHandler(myFileHandler);

        /* Log Message */
        scjaLogger.info("\nThis is a logged information message.");

        /* Close the file */
        myFileHandler.close();
    }
}