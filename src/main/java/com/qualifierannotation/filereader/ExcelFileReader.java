package com.qualifierannotation.filereader;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileReader implements Reader{

    @Override
    public String readFile() {
        return "Excel File";
    }
}
