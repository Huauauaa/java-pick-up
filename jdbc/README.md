# JDBC

## mysql

```bash
docker run -d -p 3307:3306 -v /Users/harvey/home/mysql/conf:/etc/mysql/conf.d -v /Users/harvey/home/mysql/data:/var/lib/mysql  -e MYSQL_ROOT_PASSWORD=123456 --name mysql0 mysql
```

```sql
create
database jdbc;

CREATE TABLE `t_book`
(
    `id`   int NOT NULL AUTO_INCREMENT,
    `name` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

insert into t_book(name)
values ('Chinese');
insert into t_book(name)
values ('English');
```
