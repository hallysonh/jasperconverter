# JasperConverter

Convert JRPRINT files to PDF

## Building

Execute the following code to build the application:

```bash
./gradlew clean copyTask build
```

## Using the application

When building, helper scripts are also copied using the gradle task `copyTask` to `build\libs`. Those script can be used to just drag and drop JRPRINT files and initiate convertions.
