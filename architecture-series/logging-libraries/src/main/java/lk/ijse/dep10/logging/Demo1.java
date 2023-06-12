package lk.ijse.dep10.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo1 {
    private static final Logger log = LoggerFactory.getLogger(Demo1.class);
    private static final Logger log1 = LoggerFactory.getLogger("lk.ijse.dep10.logging.Demo1");

    public static void main(String[] args) {
        /* Log Level
        *   TRACE
        *   DEBUG
        *   INFO
        *   WARN
        *   ERROR
        * */
        log.trace("This is TRACE log");
        log.debug("This is DEBUG log");
        log.info("This is INFO log");
        log.warn("This is WARN log");
        log.error("This is ERROR log");

    }
}
