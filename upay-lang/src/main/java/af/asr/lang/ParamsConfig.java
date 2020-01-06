/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.asr.lang;

import java.util.UUID;

public class ParamsConfig {

//****************************Config Params ********************//
    public static final Integer CORE_POOLING_SIZE = 2;
    public static final Integer MAX_POOLING_SIZE = 2;
    public static final Integer QUEUE_CAPACITY = 1000;
    public static final String DEFAULT_PREFIX = "asrpay->";

//********************************** MMO Config Params *******************************//
    public static final String API_DATA_FORMAT = "application/json";

//****************************** THREAD CONFIG *************************************//
    public static final Integer NUMBER_OF_THREAD = 4;
    public static final Integer MESSAGE_HEADER_LENGTH = 0;

//*********************************** Security Config Params ***********************//
    public static final String TRUSTED_CLIENT_ID = "my-trusted-client";
    public static final String TRUSTED_CLIENT_SECRET = "secret";
    public static final String TOKEN_GENERATION_URL = "/oauth/token";
    public static final Integer ACCESS_TOKEN_VALDITION_TIME = 60 * 60 * 10;
    public static final String SECURED_RESOURCE_URL = "/host/**";
    public static final String[] OAUTH_SECURITY_SCOPE = {"read", "write", "trust"};
    public static final String[] OAUTH_SECURITY_AUTHORITIES = {"ROLE_CLIENT", "ROLE_TRUSTED_CLIENT"};
    public static final String OAUTH_SECURITY_RESOURCE_ID = "oauth2-resource";
    public static final String[] OAUTH_AUTHORIZATION_GRANT_TYPE = {"client_credentials", "password"};
    public static final String RESOURCE_ID = "resource_id";

    //****************** Interceptor Config Params *******************************//
    public static final String INTERCEPTOR_PATTERNS = "/host/**";



//    Token Config

    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 5*60*60;
    public static final String SIGNING_KEY = "badar";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_ISSUER = "https//asr.af";
    public static  final long PAYMENT_TOKEN_ACCESS_VALIDITY_SECONDS = 84000 * 365;

    //********************************** KAFKA***********************************//
    public static  final  String CONSUMER_GROUP_ID ="asrpay";
    public static final String MAILER_CONSUMER_GROUP_ID = "asrpay.mailer";
    public static final String SMS_CONSUMER_GROUP_ID = "asrpay.sms";
    public static final String NOTIFICATION_CONSUMER_GROUP_ID = "asrpay.notification";


    //********************************* SMS ***************************************//
    public static  final String DEFAULT_SMS_SENDER_PHONE_NUMBER = "0093794035544";
    public static final String  TIWILLO_SITE_ACCOUNT_SID ="";
    public static final String TIWILLO_SITE_AUTH_TOKEN = "your_auth_token";



    //************************ SmartVista ***********************************//
    public static final String SMART_VISTA_IP = "127.0.0.1";
    public static final Integer SMART_VISTA_PORT = 6106;
    public static final String SMARTVISTA_CONFIG_FILE_PATH = "isoconfig.xml";

    public static final Integer SMART_VIST_TIMEOUT = 3000;

    //***************************** Cryptography ********************//
    public static final String AAD = "ASR";
    public static  final String PUBLIC_PAYMENT_TOKEN_SUBJECT_DATA = UUID.randomUUID().toString()+ "Public Subject Data";
    public static final String PUBLIC_PAYMENT_TOKEN_BODY_DATA = UUID.randomUUID().toString()+ " Public Body Data";
    public static  final String PRIVATE_PAYMENT_TOKEN_SUBJECT_DATA = UUID.randomUUID().toString()+ "Private Subject Data";
    public static final String PRIVATE_PAYMENT_TOKEN_BODY_DAT = UUID.randomUUID().toString()+ " Private Body Data";



    public static  final String DEFAULT_ROLE_NAME = "USER";
    public static final String DEFAULT_TENANT_NAME = "Main Tenant";


    //********************************** FORGET PASSWORD *************************************//
    public static final String FORGET_PASSWORD_MAIL_SUBJECT = "EPAY - RESET PASSWORD";

}
