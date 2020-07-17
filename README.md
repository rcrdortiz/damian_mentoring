# Execute the service
If you want to execute the main service you can do it with any of the following command:
```
./gradlew clean build run
./gradlew run
```

# Running tests
In order to execute the test you shall execute the following command:
```
./gradlew test
```

# Operating with the service
You can test the two currently implemented methods by executing the following curls (make sure the service is 
running):
```
# GET endopoint
curl http://localhost:8080/greeting
or
curl http://localhost:8080/hate

# POST endpoint
curl -X POST http://localhost:8080
```