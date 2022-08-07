# RateLimiterWithSpringBoot

## Steps 
 # 1. Run the `Bucket4jRateLimitApp` .
 # 2. Modify any parameter inside a `application-bucket4j-starter.yml`
 # 3. after locally up the application run the below curl 
    
    curl --location --request POST 'http://localhost:9001/api/v1/area/rectangle' \--header 'Content-Type: application/json' \--header 'X-api-key: FX001-99999' \--data-raw '{ "length": 20, "width": 7 }'
    
