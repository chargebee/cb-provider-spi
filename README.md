## Chargebee's Open API Spec
Service Provider Interfaces for Chargebee's capabilities
- [Open api tax_spec](spec/spi/openapi_tax.yml)
- [Open api trn_validation_spec](spec/spi/openapi_trn.yml)
- To view open api spec visit https://editor.swagger.io/ and place generated yaml content

## Add new open api spec
- Add **openapi.yml** file under `spec/spi/` folder, like spec/spi/**abc**
- Add config details in [spec.config](spec.config) file
- Command to validate open api spec `sh gradlew validateSpec_abc --warning-mode all --stacktrace`
- Command to generate open api spec `sh gradlew generateSpec_abc --warning-mode all --stacktrace`
- Java models, clients and doc will be generated under `generated/abc` folder
- 

## Commands
- Validate the open api spec `sh gradlew validateSpec --warning-mode all --stacktrace`
- Generate models, api client, docs etc `sh gradlew generateSpec --warning-mode all --stacktrace`
    - New folder `generated` will be created which will have all models, clients, docs etc
- Build `sh gradlew build` spi jar will be generated to ./build/libs/cb-provider-spi.jar
- Publish jar to local maven repo `sh gradlew build publishToMavenLocal`

## Working on Service Adapter SPI for first time

Follow the below steps for generating jar

Clone repository in local
```shell
  git clone git@github.com:chargebee/cb-provider-spi.git
```

Validate open api specs using below command
```shell
sh gradlew validateSpec  --warning-mode all --stacktrace
```

Validate specific open api spec using below command
```shell
 sh gradlew validateSpec_tax  --warning-mode all --stacktrace
```

Generate models of all open api specs using below command
```shell
sh gradlew generateSpec  --warning-mode all --stacktrace
```

Generate models specific open api spec using below command
```shell
sh gradlew generateSpec_tax  --warning-mode all --stacktrace
```

When models are generated successfully, generate jar using below command
```shell
sh gradlew clean build
```
If no build issue, and if jar is successfully created, go to **./build/libs/cb-provider-spi.jar**


## Getting Started

Please follow the installation instruction of generated readme to generate the jar of this project. Currently, this jar is used as a dependency in chargebee-app too to use APIs as well as models.

Add dependency
```maven
<dependency>
    <groupId>org.chargebee.spi</groupId>
    <artifactId>cb-provider-spi</artifactId>
    <version>${version}</version>
</dependency>
```

Following sample Java code demonstrates how to use the APIs and models from this project:

```java

/// Import classes:
import org.chargebee.spi.tax.client.ApiClient;
import org.chargebee.spi.tax.client.ApiException;
import org.chargebee.spi.tax.client.Configuration;
import org.chargebee.spi.tax.client.auth.*;
import org.chargebee.spi.tax.client.models.*;
import org.chargebee.spi.tax.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.taxes.provider.com/api/v1");

    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    CheckAddressTaxabilityRequest checkAddressTaxabilityRequest = new CheckAddressTaxabilityRequest(); // CheckAddressTaxabilityRequest | 
    try {
      CheckAddressTaxabilityResponse result = apiInstance.checkAddressTaxability(checkAddressTaxabilityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#checkAddressTaxability");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```


## JSON Schema validation
Tax provider capabilities for new tax providers will be validated against a constantly updating JSON Schema, to validate the correctness and completeness of configurations. JSON Schema can be referenced below.
- [TaxProviderCapabilities JSONSchema](spec/capabilities/tax-provider.schema.json)

## Steps to follow release


1. Assume release is 0.0.9. (find release from git page release section)
2. create a new branch called release/<release> so this would be release/0.0.9
3. create new branch for ticket feat/<ticket-number>
4. commit to  feat/<ticket-number>
5. Raise PR from feat/<ticket-number> to release/0.0.9
6. After PR is approved and merged
7. Raise PR from release/0.0.9 to dev. Once PR is merged it will auto release the 0.0.9 version of SPI for dev code base
8. After that raise PR from release/0.0.9 to main. Once PR is merged it will auto release the 0.0.9 version of SPI for prod codebase


## Steps to generate a spring boot project for given spec using gradle

Prerequisites:
Use Java11 or higher version with gradle version greater than or equal to 7.
For gradle version less than 7 use Java8.

1. Clone repository in local
```shell
  git clone git@github.com:chargebee/cb-provider-spi.git
```

2. Navigate to the repository
```shell
  cd cb-provider-spi
```

3. (a) Generate the Gradle project structure with default configurations:
```shell
  gradle -b meta-generator.gradle generateGradleProject
```

3. (b) Generate the gradle project with custom configurations use below commands. (Custom params if not provided, it will pick it from generator.config file)
```shell
  gradle -b meta-generator.gradle generateGradleProject \
  -PspringBootVersion=2.7.1 \
  -PopenApiGeneratorVersion=7.0.1 \
  -PjavaVersion=11 \
  -PgroupId=com.adapter \
  -PbasePackage=com.adapter.api \
  -PoutputDir=../adapter
```

4. After generating the Gradle project, you can navigate to the output directory and run:
```shell
  gradle openApiGenerateFullProject
```

## Generating Spring boot project using shell script

1. Perform the steps 1 and 2 as mentioned in above section.

2. Execute the script file setup_spring_boot.sh using below command:
```shell
  chmod +x setup_spring_boot.sh
```
3. Run the script:
```shell
  ./setup_spring_boot.sh
```


