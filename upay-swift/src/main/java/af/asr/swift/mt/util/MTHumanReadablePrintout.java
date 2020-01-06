package af.asr.swift.mt.util;

import com.prowidesoftware.swift.model.SwiftMessage;
import com.prowidesoftware.swift.model.Tag;
import com.prowidesoftware.swift.model.field.Field;

import java.io.IOException;
import java.util.Locale;

/**
 * Example to generate a human friendly printout of an MT content
 *
 * <p>https://stackoverflow.com/questions/47265944/generating-human-readable-swift-messages-using-prowide-core
 *
 */
public class MTHumanReadablePrintout {

    public static void printMsg(String message) throws IOException {
        Locale locale = Locale.getDefault();
        SwiftMessage sm = SwiftMessage.parse(message);

        /*
         * With single value per field
         */
        System.out.println("Sender: " + sm.getSender());
        System.out.println("Receiver: " + sm.getReceiver() + "\n");

        for (Tag tag : sm.getBlock4().getTags()) {
            Field field = tag.asField();
            System.out.println(Field.getLabel(field.getName(), "103", null, locale));
            System.out.println(field.getValueDisplay(locale) + "\n");
        }

        /*
         * With values per component
         */
        for (Tag tag : sm.getBlock4().getTags()) {
            Field field = tag.asField();
            System.out.println("\n" + Field.getLabel(field.getName(), "103", null, locale));
            for (int component = 1 ; component <= field.componentsSize() ; component++) {
                if (field.getComponent(component) != null) {
                    System.out.print(field.getComponentLabel(component) + ": ");
                    System.out.println(field.getValueDisplay(component, locale));
                }
            }
        }

    }
}