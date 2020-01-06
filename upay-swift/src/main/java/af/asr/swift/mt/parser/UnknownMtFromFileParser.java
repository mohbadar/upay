package af.asr.swift.mt.parser;


import java.io.File;
import java.io.IOException;

import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103_STP;
import com.prowidesoftware.swift.utils.Lib;

/**
 * This shows how to read a SWIFT MT message from a file, in the context where
 * the message type to parse is unknown.

 */
public class UnknownMtFromFileParser {

    public static AbstractMT parse(String path) throws IOException {
        /*
         * Read and parse the file content into a SWIFT message object
         * Parse from File could also be used here
         */
        AbstractMT msg = AbstractMT.parse(Lib.readResource(path, null));

        /*
         * Print header information
         */
//        System.out.println("Sender: "+msg.getSender());
//        System.out.println("Receiver: "+msg.getReceiver());
//        System.out.println("MT: "+msg.getMessageType());

        if (msg.isType(103) && msg.getSwiftMessage().isSTP()) {
            /*
             * Specialize the message to its specific model representation
             */
            MT103_STP mt = (MT103_STP) msg;

            /*
             * Print details of a specific field
             */
            System.out.println("Reference: "+mt.getField20().getValue());
        }
        return msg;
    }
}