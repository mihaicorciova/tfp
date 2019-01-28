

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author sips
 */
public class GenPdf {



    public void createPdf( Map<String,DatePartida> date, File file) throws IOException {
        PdfDocument pdf = new PdfDocument(new PdfWriter(file));
        Document document = new Document(pdf)
                .setTextAlignment(TextAlignment.JUSTIFIED);

        PdfFont normal = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);

        for(Map.Entry<String,DatePartida> entry: date.entrySet()) {
            document.add(new Paragraph(entry.getValue().toString()).setFont( normal));
                    }
        document.close();
    }
}
