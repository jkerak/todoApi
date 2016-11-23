# todoApi
SpringMVC REST API for simple todo app

This project uses [swagger-codegen-tooling](https://github.com/zalando-stups/swagger-codegen-tooling) to generate server interfaces interfaces with SpringMVC and Swagger annotations. 

REST endpoints and DTOs are defined in [swagger.yaml](https://github.com/jkerak/todoApi/blob/master/src/main/resources/swagger-codegen/swagger.yaml), and sources are generated in `/target/generated-sources/swagger-codegen` during each build.

The master branch of this repository is deployed at https://jkerak-todoapi.herokuapp.com/
