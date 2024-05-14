# realtime-di_startergy-pattern

## Dependencies to add to your pom.xml
[org.springframework/spring-context-support](https://mvnrepository.com/artifact/org.springframework/spring-context-support)

[org.postgresql/postgresql](https://mvnrepository.com/artifact/org.postgresql/postgresql)

[org.springframework/spring-jdbc](https://mvnrepository.com/artifact/org.springframework/spring-jdbc)

## postgresql table
```
CREATE TABLE IF NOT EXISTS public.realtimedi_customer (
    cno SERIAL PRIMARY KEY,
    cname VARCHAR(20),
    cadd VARCHAR(20),
    pamt DOUBLE PRECISION,
    interamt DOUBLE PRECISION
);
```
