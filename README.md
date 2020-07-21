# chengdonglu210-backend
Java backend for Chengdonglu210 mall

## Environment 
* [MySQL](https://dev.mysql.com/downloads/mysql/)
* [SDKMAN!](https://sdkman.io/install)
* [JDK1.8](https://sdkman.io/jdks#jdk.java.net) or above
* [Maven](https://sdkman.io/sdks#maven)

## Run
### 1. Setup database 
Import the following files inside `litemall-db/sql`
* litemall_schema.sql
* litemall_table.sql
* litemall_data.sql

### 2. Run the Java program
Open terminal and run the following command
```bash
    cd chengdonglu210-backend
    mvn install
    mvn clean package
    java -Dfile.encoding=UTF-8 -jar litemall-all/target/litemall-all-0.1.0-exec.jar
```

## Reference: 
> [Itemall](https://github.com/linlinjava/litemall)


