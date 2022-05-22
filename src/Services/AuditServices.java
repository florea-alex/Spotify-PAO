package Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class AuditServices {
    FileWriter writer;

    public AuditServices() {
        try {
            File dir = new File("src/Resources");
            File file = new File("src/Resources/summary.csv");
            this.writer = new FileWriter("src/Resources/summary.csv",true);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void addActionInAudit(String action) throws IOException {
        this.writer = new FileWriter("src/Resources/summary.csv",true);
        long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        this.writer.write((action + ','+ timestamp + '\n'));
        this.writer.close();
    }
}