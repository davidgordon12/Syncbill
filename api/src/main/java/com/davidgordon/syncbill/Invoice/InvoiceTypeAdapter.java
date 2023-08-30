package com.davidgordon.syncbill.Invoice;

import java.io.IOException;
import java.time.LocalDate;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class InvoiceTypeAdapter extends TypeAdapter<LocalDate> {
    @Override
    public void write( final JsonWriter jsonWriter, final LocalDate localDate ) throws IOException {
        jsonWriter.value(localDate.toString());
    }

    @Override
    public LocalDate read( final JsonReader jsonReader ) throws IOException {
        return LocalDate.parse(jsonReader.nextString());
    }
}