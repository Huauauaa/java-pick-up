# JDBC

## mysql

```bash
docker run -d -p 3307:3306 -v /Users/harvey/home/mysql/conf:/etc/mysql/conf.d -v /Users/harvey/home/mysql/data:/var/lib/mysql  -e MYSQL_ROOT_PASSWORD=123456 --name mysql0 mysql
```

```sql
create
database jdbc;

create table t_book
(
    name varchar(100)
);

insert into t_book
values ('Chinese');
insert into t_book
values ('English');
```
