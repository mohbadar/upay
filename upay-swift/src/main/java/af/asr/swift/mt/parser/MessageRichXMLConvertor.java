package af.asr.swift.mt.parser;

import com.prowidesoftware.swift.io.ConversionService;

/**
 * this message conversion to XML representation. Notice this is not SWIFT
 * MX format, but the internal/proprietary XML representation defined at WIFE.
 *
 * <p>
 * running this sample will generate something like:
 * </p>
 * <em>Note the element <code>field</code> inside block4 instead of <code>tag</code>
 * <pre>
 <message>
 <block1>
 <applicationId>F</applicationId>
 <serviceId>01</serviceId>
 <logicalTerminal>BICFOOYYAXXX</logicalTerminal>
 <sessionNumber>8683</sessionNumber>
 <sequenceNumber>497519</sequenceNumber>
 </block1>
 <block2 type="output">
 <messageType>103</messageType>
 <senderInputTime>1535</senderInputTime>
 <MIRDate>051028</MIRDate>
 <MIRLogicalTerminal>ESPBESMMAXXX</MIRLogicalTerminal>
 <MIRSessionNumber>5423</MIRSessionNumber>
 <MIRSequenceNumber>752247</MIRSequenceNumber>
 <receiverOutputDate>051028</receiverOutputDate>
 <receiverOutputTime>1535</receiverOutputTime>
 <messagePriority>N</messagePriority>
 </block2>
 <block3>
 <tag>
 <name>113</name>
 <value>ROMF</value>
 </tag>
 <tag>
 <name>108</name>
 <value>0510280182794665</value>
 </tag>
 <tag>
 <name>119</name>
 <value>STP</value>
 </tag>
 </block3>
 <block4>
 <field>
 <name>20</name>
 <component number="1">0061350113089908</component>
 </field>
 <field>
 <name>13C</name>
 <component number="1">RNCTIME</component>
 <component number="2">1534</component>
 <component number="3">+</component>
 <component number="4">0000</component>
 </field>
 <field>
 <name>23B</name>
 <component number="1">CRED</component>
 </field>
 <field>
 <name>23E</name>
 <component number="1">SDVA</component>
 </field>
 <field>
 <name>72</name>
 <component number="1">/BNF/TRANSF. BCO. FOO</component>
 </field>
 </block4>
 <block5>
 <tag>
 <name>MAC</name>
 <value>88B4F929</value>
 </tag>
 <tag>
 <name>CHK</name>
 <value>22EF370A4073</value>
 </tag>
 </block5>
 </message>
 </pre>
 *
 */
public class MessageRichXMLConvertor{

    public static String main(String fin, boolean useFieldInsteadOfTag) {
        ConversionService srv = new ConversionService();
        /*
         *  This will switch on a more detailed output in the xml, ideal for
         *  processing elements inside each tag
         */
        String xml = srv.getXml(fin, useFieldInsteadOfTag);
        System.out.println(xml);
        return xml;
    }
}