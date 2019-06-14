# plantronics Application

Start Spring Bootstrap application as always.

As this is a secure application the port was changed to 8443.

## Generate SSL with keytool

```json
keytool -genkey -alias plantronics-cert -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore plantronics-ks.p12 -validity 365
```

where:
* genkey: generate a new certificate.
* alias: unique name of the certificate.
* storetype: type of generator used for this certificate.
* keyalg: validateon type for this certificate.
* keysize: the size of the certificate that will be generated.
* keystore: the name of the keystore in which the certificate will be located.
* validity: how many days this certificate will be valid.

### Certificate info

Password: lenovo

### See also

[Enable HTTPS in Spring Boot](https://drissamri.be/blog/java/enable-https-in-spring-boot/)
[Enable HTTPS / SSL in Spring Boot Application](https://www.youtube.com/watch?v=H-pn7NrEssM&list=PLezbWNvtBdzvfZe58P1b642M7lEbWCFC6&index=5)

## Application Start

When starting the application with http://localhost you will be automatically redirected to https://localhost:443