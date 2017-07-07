@chcp 1251 > nul
call mvn clean compile exec:java -P SLF4J-LOG4J2 -Dexec.mainClass="algol.csltd.com.ua.SpringTest" -Dexec.cleanupDaemonThreads=false
call mvn clean compile exec:java -P SLF4J-JDK14 -Dexec.mainClass="algol.csltd.com.ua.SpringTest" -Djava.util.logging.config.file=target\classes\logging.properties -Dexec.cleanupDaemonThreads=false
call mvn clean compile exec:java -P SLF4J-Simple -Dexec.mainClass="algol.csltd.com.ua.SpringTest" -Dexec.cleanupDaemonThreads=false 
call mvn clean compile exec:java -P SLF4J-LogBack -Dexec.mainClass="algol.csltd.com.ua.SpringTest" -Dexec.cleanupDaemonThreads=false 
call mvn clean compile exec:java -P WO_SLF4J -Dexec.mainClass="algol.csltd.com.ua.SpringTest" -Djava.util.logging.config.file=target\classes\logging.properties -Dexec.cleanupDaemonThreads=false