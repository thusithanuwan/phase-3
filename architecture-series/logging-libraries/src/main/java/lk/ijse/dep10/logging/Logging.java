package lk.ijse.dep10.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {
    private static final Logger log = LoggerFactory.getLogger("lk.ijse.dep10.logging");

    public static void main(String[] args) {
        log.info("I am from Logging");
    }

}
