package core.basesyntax.service.impl;

import core.basesyntax.service.ReportWriterService;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportWriterServiceImpl implements ReportWriterService {

    @Override
    public void writeReport(List<String> reports, String toFile) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile))) {
            for (String line : reports) {
                bufferedWriter.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("File not found", e);
        }
    }
}