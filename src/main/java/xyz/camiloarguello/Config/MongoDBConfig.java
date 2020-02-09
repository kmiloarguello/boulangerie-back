package xyz.camiloarguello.Config;


import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"xyz.camiloarguello.Dao"})
public class MongoDBConfig {
}
