

# 数据库管理
## 查找所有数据库
```
select datname from pg_database; 
```
## 创建数据库
```
create database 'dat_name' owner 'long_onwer' enconding UIF8;
注意：创建完数据库，需要切换到数据库下，创建和当前用户同名scheme，删除数据库后schema也会一并删除：
-- 重新登陆到新的数据库下。执行语句
creat schema AUTHORIZATTION CURRENT_USER;
```
## 删除数据库
```
drop database 'datname';
注意：删库前需要关闭所有会话，不然会提示：
SELECT pg_terminate_backend(pg_stat_activity.pid)  
FROM pg_stat_activity  
WHERE datname='mydb' AND pid<>pg_backend_pid();
```




<!--stackedit_data:
eyJoaXN0b3J5IjpbMjA3OTk5NjgyXX0=
-->