package af.asr.swift.mt.util;

import com.prowidesoftware.swift.io.parser.SwiftParser;
import com.prowidesoftware.swift.model.SwiftMessage;

import java.io.IOException;

public class MessageToJson {


    public static String toJson(String fin) throws IOException {
        /*
         * This will be published in version 7.5 of CORE
         */
        SwiftParser parser = new SwiftParser(fin);
        SwiftMessage mt = parser.message();

        System.out.println(mt.toJson());
        return mt.toJson();
    }

}
