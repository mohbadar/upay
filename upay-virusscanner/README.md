

## Virus Scanner Library

#### dependency

`
<dependency> 
   		<groupId>af.asr</groupId>
   		<artifactId>phoenix-virusscanner</artifactId>
   		<version>${project.version}</version>
</dependency>
`

#### Properties File 

`
mosip.kernel.virus-scanner.host=127.0.0.1 
mosip.kernel.virus-scanner.port=3322

`


#### Usage 

`
   @Autowired
   VirusScanner<Boolean, String> virusScannerImpl;
   
   boolean isClean = false;

   		try {
   			isClean = virusScannerImpl.scanFile("filepath");
   		} catch (VirusScanFailedException e) {
   			....
   		}

`